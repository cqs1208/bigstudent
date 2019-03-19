package com.bigstudent.service;

import com.bigstudent.domain.BsArticleDo;
import com.bigstudent.query.ArticleQuery;

import java.util.List;

/**
 * 文章表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-07 20:16:52
 */
public interface BsArticleService {

    /**
     * 添加文章
     * @param bsArticleDo
     * @return
     */
    boolean addArticle(BsArticleDo bsArticleDo);

    /**
     * 修改文章
     * @param bsArticleDo
     * @return
     */
    boolean updateArticle(BsArticleDo bsArticleDo);

    /**
     * 文章列表
     * @param articleQuery
     * @return
     */
    List<BsArticleDo> getArticleList(ArticleQuery articleQuery);
}
