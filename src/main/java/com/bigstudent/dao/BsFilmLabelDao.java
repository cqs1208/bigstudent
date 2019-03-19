package com.bigstudent.dao;

import com.bigstudent.domain.BsFilmDo;
import com.bigstudent.domain.BsFilmLabelDo;

import java.util.List;

/**
 * 电影标签表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-21 19:26:25
 */
public interface BsFilmLabelDao  {

    void addFilmLabel(BsFilmLabelDo bsFilmLabelDo);

    List<BsFilmLabelDo> getFilmLabelList();

    int updateFilmLabel(BsFilmLabelDo bsFilmLabelDo);
}
