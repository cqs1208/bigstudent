package com.bigstudent.dao;

import com.bigstudent.domain.BsArticleMajorDo;

import java.util.List;

/**
 * 文章大学专业表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:21
 */
public interface BsArticleMajorDao  {

    int addArticleMajor(BsArticleMajorDo bsArticleMajorDo);

    List<BsArticleMajorDo> getArticleMajorList();

    int updateArticleMajor(BsArticleMajorDo bsArticleMajorDo);
}
