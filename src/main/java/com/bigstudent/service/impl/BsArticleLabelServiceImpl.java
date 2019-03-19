package com.bigstudent.service.impl;

import javax.annotation.Resource;

import com.bigstudent.domain.BsArticleLabelDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsArticleLabelDao;
import com.bigstudent.service.BsArticleLabelService;

import java.util.List;


/**
 * 文章标签表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:42:32
 */
 
@Service("bsArticleLabelService")
public class BsArticleLabelServiceImpl implements BsArticleLabelService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsArticleLabelServiceImpl.class);
   
    @Resource
    private BsArticleLabelDao bsArticleLabelDao;

    @Override
    public boolean addArticleLabel(BsArticleLabelDo bsArticleLabelDo) {
        return bsArticleLabelDao.addArticleLabel( bsArticleLabelDo) > 0 ? true : false;
    }

    @Override
    public List<BsArticleLabelDo> getArticleLabelList() {
        return bsArticleLabelDao.getArticleLabelList();
    }

    @Override
    public boolean updateArticleLabel(BsArticleLabelDo bsArticleLabelDo) {
        return bsArticleLabelDao.updateArticleLabel( bsArticleLabelDo) > 0 ? true : false;
    }
}