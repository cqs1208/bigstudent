package com.bigstudent.service.impl;

import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.common.enums.ResourceSecTypeEnum;
import com.bigstudent.common.enums.ResourceTypeEnum;
import com.bigstudent.domain.*;
import com.bigstudent.query.ArticleQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsArticleDao;
import com.bigstudent.service.BsArticleService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 文章表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-07 20:16:52
 */
 
@Service("bsArticleService")
public class BsArticleServiceImpl implements BsArticleService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsArticleServiceImpl.class);

    @Autowired
    private BsArticleDao bsArticleDao;

    @Autowired
    private DictionaryData dictionaryData;

    @Override
    public boolean addArticle(BsArticleDo bsArticleDo) {
        Date now = new Date();
        bsArticleDo.setCreateTime(now);
        bsArticleDo.setUpdateTime(now);
        bsArticleDo = checkArticleSubHost( bsArticleDo);
        return bsArticleDao.addArticle( bsArticleDo);
    }
    @Override
    public boolean updateArticle(BsArticleDo bsArticleDo) {
        Date now = new Date();
        bsArticleDo.setUpdateTime(now);
        bsArticleDo = checkArticleSubHost( bsArticleDo);
        return bsArticleDao.updateArticle( bsArticleDo) > 0 ? true : false;
    }

    @Override
    public List<BsArticleDo> getArticleList(ArticleQuery articleQuery) {
        List<BsArticleDo> articleList = bsArticleDao.getArticleList( articleQuery);
        if(!CollectionUtils.isEmpty(articleList)){
            for(BsArticleDo bsArticleDo : articleList){
                checkArticleAddhost( bsArticleDo);
            }
        }
        articleList = convertByList(articleList);
        return articleList;
    }

    //检查图片地址
    public  BsArticleDo checkArticleSubHost(BsArticleDo bsArticleDo){
        BsResourceDo bsResourceDo = dictionaryData.getResourceInfo(ResourceTypeEnum.HOST.getCode(), ResourceSecTypeEnum.HOST_IMAGE.getCode());
        if(null == bsResourceDo){
            logger.info("addArticle getResource null");
            return null;
        }
        bsArticleDo.setArticleImage( bsArticleDo.getArticleImage().replace(bsResourceDo.getValue(), "") );
        bsArticleDo.setArticlePosters( bsArticleDo.getArticlePosters().replace(bsResourceDo.getValue(), "") );
        return bsArticleDo;
    }

    //检查图片地址
    public  BsArticleDo checkArticleAddhost(BsArticleDo bsArticleDo){
        BsResourceDo bsResourceDo = dictionaryData.getResourceInfo(ResourceTypeEnum.HOST.getCode(), ResourceSecTypeEnum.HOST_IMAGE.getCode());
        if(null == bsResourceDo){
            logger.info("addArticle getResource null");
            return null;
        }
        bsArticleDo.setArticleImage(bsResourceDo.getValue() + bsArticleDo.getArticleImage() );
        bsArticleDo.setArticlePosters(bsResourceDo.getValue() + bsArticleDo.getArticlePosters());
        return bsArticleDo;
    }

    //转换（集合）
    public List<BsArticleDo> convertByList(List<BsArticleDo> articleList){
        if(!CollectionUtils.isEmpty(articleList)){
            for(BsArticleDo articleInfo : articleList){
                convertByInfo(articleInfo);
            }
        }
        return articleList;
    }

    //转换（对象）
    public BsArticleDo convertByInfo(BsArticleDo articleInfo){
        List<BsArticleMajorDo> articleMajorList = (List<BsArticleMajorDo>)dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_MAJOR.getCode());
        List<BsArticleLabelDo> articleLabelList = (List<BsArticleLabelDo>)dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_LABEL.getCode());
       // List<BsArticlePlaceDo> articlePlaceList = (List<BsArticlePlaceDo>) dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_PLACE.getCode());
        if(!CollectionUtils.isEmpty(articleMajorList)){
            for(BsArticleMajorDo bsArticleMajorDo : articleMajorList){
                if(articleInfo.getArticleMajorId().intValue() == bsArticleMajorDo.getId()){
                    articleInfo.setArticleMajorName(bsArticleMajorDo.getMajorSubjectName());
                }
            }
        }
        if(!CollectionUtils.isEmpty(articleLabelList)){
            List<String> labelList = new ArrayList<>();
            String[] lelabelArr = articleInfo.getArticleLabel().split(",");
            for(String lelabelId : lelabelArr){
                for(BsArticleLabelDo bsArticleLabelDo :  articleLabelList){
                    if(Integer.valueOf(lelabelId).intValue() == bsArticleLabelDo.getId()){
                        labelList.add(bsArticleLabelDo.getLabelName());
                    }
                }
            }
            articleInfo.setArticleLabelName(labelList);
        }
       /* if(CollectionUtils.isEmpty(articlePlaceList)){
            for(BsArticlePlaceDo bsArticlePlaceDo : articlePlaceList){
                if(articleInfo.getArticlePlaceId().intValue() == bsArticlePlaceDo.getId()){
                    articleInfo.setArticleMajorName(bsArticlePlaceDo.get);
                }
            }
        }*/
        return articleInfo;
    }
}