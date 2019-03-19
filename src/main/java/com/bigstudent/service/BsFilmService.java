package com.bigstudent.service;

import com.bigstudent.domain.BsFilmDo;
import com.bigstudent.domain.BsFilmLabelDo;
import com.bigstudent.query.FilmQuery;

import java.util.List;

/**
 * 电影表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-21 19:27:02
 */
public interface BsFilmService {

    /**
     * 保存电影标签
     * @param bsFilmLabelDo
     */
    void addFilmLabel(BsFilmLabelDo bsFilmLabelDo);

    /**
     * 电影标签列表
     */
    List<BsFilmLabelDo> getFilmLabelList();

    /**
     * 修改电影标签
     */
    boolean updateFilmLabel(BsFilmLabelDo bsFilmLabelDo);
}
