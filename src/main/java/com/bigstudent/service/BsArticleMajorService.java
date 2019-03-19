package com.bigstudent.service;

import com.bigstudent.domain.BsArticleMajorDo;

import java.util.List;

/**
 * 文章大学专业表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:21
 */
public interface BsArticleMajorService {

    /**
     * 添加文章大学专业
     * @param bsArticleMajorDo
     * @return
     */
    boolean addArticleMajor(BsArticleMajorDo bsArticleMajorDo);

    /**
     * 文章大学专业列表
     * @return
     */
    List<BsArticleMajorDo> getArticleMajorList();

    /**
     * 文章大学专业列表
     * @return
     */
    boolean updateArticleMajor(BsArticleMajorDo bsArticleMajorDo);

    /**
     * 文章大学专业列表归类
     * @return
     */
    List<BsArticleMajorDo> merge(List<BsArticleMajorDo> list, List<BsArticleMajorDo> list2);
}
