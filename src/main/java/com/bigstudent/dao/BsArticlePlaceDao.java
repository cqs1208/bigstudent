package com.bigstudent.dao;

import com.bigstudent.domain.BsArticlePlaceDo;

import java.util.List;

/**
 * 文章地区表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:53
 */
public interface BsArticlePlaceDao  {

    int addArticlePlace(BsArticlePlaceDo bsArticlePlaceDo);

    int updateArticlePlace(BsArticlePlaceDo bsArticlePlaceDo);

    List<BsArticlePlaceDo> getArticlePlaceList();
}
