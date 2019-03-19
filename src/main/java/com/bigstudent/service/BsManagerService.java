package com.bigstudent.service;

import com.bigstudent.dao.BsManagerDao;
import com.bigstudent.domain.BsManagerDo;

/**
 * 管理员表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:23:11
 */
public interface BsManagerService {

    /**
     * 获取管理员信息
     */
    public BsManagerDo getManagerInfo (String managerName, String managerPassword);

    /**
     * 添加管理员
     */
    public Integer addManager (BsManagerDo bsManagerDo);

    /**
     * 修改管理员信息
     */
    public boolean updateManager (BsManagerDo bsManagerDo);

    /**
     * 删除管理员
     */
    public boolean delManager (BsManagerDo bsManagerDo);
}
