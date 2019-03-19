package com.bigstudent.service;

import com.bigstudent.domain.BsArticlePlaceDo;

import java.util.List;

/**
 * 文章地区表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:53
 */
public interface BsArticlePlaceService {

    /**
     * 添加文章地区
     * @param bsArticlePlaceDo
     */
    boolean addArticlePlace(BsArticlePlaceDo bsArticlePlaceDo);

    /**
     * 修改文章地区
     * @param bsArticlePlaceDo
     */
    boolean updateArticlePlace(BsArticlePlaceDo bsArticlePlaceDo);


    /**
     * 文章地区列表
     */
    List<BsArticlePlaceDo> getArticlePlaceList();
}
