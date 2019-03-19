package com.bigstudent.dao;

import com.bigstudent.domain.BsResourceDo;

import java.util.List;

/**
 * 资源表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 11:31:50
 */
public interface BsResourceDao  {

    List<BsResourceDo> getResourceList();
}
