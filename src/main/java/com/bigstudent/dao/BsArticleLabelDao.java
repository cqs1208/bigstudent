package com.bigstudent.dao;

import com.bigstudent.domain.BsArticleLabelDo;

import java.util.List;

/**
 * 文章标签表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:42:32
 */
public interface BsArticleLabelDao  {
    int addArticleLabel(BsArticleLabelDo bsArticleLabelDo);

    List<BsArticleLabelDo> getArticleLabelList();

    int updateArticleLabel(BsArticleLabelDo bsArticleLabelDo);
}
