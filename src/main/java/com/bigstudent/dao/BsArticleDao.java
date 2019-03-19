package com.bigstudent.dao;

import com.bigstudent.domain.BsArticleDo;
import com.bigstudent.query.ArticleQuery;

import java.util.List;

/**
 * 文章表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-07 20:16:52
 */
public interface BsArticleDao  {

    boolean addArticle(BsArticleDo bsArticleDo);

    int updateArticle(BsArticleDo bsArticleDo);

    List<BsArticleDo> getArticleList(ArticleQuery articleQuery);
}
