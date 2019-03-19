package com.bigstudent.service.impl;

import javax.annotation.Resource;

import com.bigstudent.domain.BsArticlePlaceDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsArticlePlaceDao;
import com.bigstudent.service.BsArticlePlaceService;

import java.util.List;


/**
 * 文章地区表ServiceImpl
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:53
 */
 
@Service("bsArticlePlaceService")
public class BsArticlePlaceServiceImpl implements BsArticlePlaceService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsArticlePlaceServiceImpl.class);
   
    @Resource
    private BsArticlePlaceDao bsArticlePlaceDao;

    @Override
    public boolean addArticlePlace(BsArticlePlaceDo bsArticlePlaceDo) {
        return bsArticlePlaceDao.addArticlePlace( bsArticlePlaceDo) > 0 ? true : false;
    }

    @Override
    public boolean updateArticlePlace(BsArticlePlaceDo bsArticlePlaceDo) {
        return bsArticlePlaceDao.updateArticlePlace( bsArticlePlaceDo) > 0 ? true : false;
    }

    @Override
    public List<BsArticlePlaceDo> getArticlePlaceList() {
        return bsArticlePlaceDao.getArticlePlaceList();
    }
}