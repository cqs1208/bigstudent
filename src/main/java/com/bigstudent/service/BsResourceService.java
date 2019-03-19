package com.bigstudent.service;

import com.bigstudent.domain.BsResourceDo;

import java.util.List;

/**
 * 资源表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 11:31:50
 */
public interface BsResourceService {

    /**
     * 获取资源列表
     * @return
     */
    List<BsResourceDo> getResourceList();

    /**
     * 跟据一级分类获取某一条资源信息
     * @return
     */
    BsResourceDo getResourceInfo(String type);

    /**
     * 跟据一二级分类获取某一条资源信息
     * @return
     */
    BsResourceDo getResourceInfo(String type, String secType);
}
