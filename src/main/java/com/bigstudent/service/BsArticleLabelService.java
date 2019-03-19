package com.bigstudent.service;

import com.bigstudent.domain.BsArticleLabelDo;

import java.util.List;

/**
 * 文章标签表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:42:32
 */
public interface BsArticleLabelService {

    /**
     * 添加文章标签
     * @param bsArticleLabelDo
     * @return
     */
    boolean addArticleLabel(BsArticleLabelDo bsArticleLabelDo);


    /**
     * 获取文章标签列表
     * @return
     */
    List<BsArticleLabelDo> getArticleLabelList();


    /**
     * 修改文章标签
     * @return
     */
    boolean updateArticleLabel(BsArticleLabelDo bsArticleLabelDo);
}
