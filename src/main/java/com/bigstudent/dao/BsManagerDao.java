package com.bigstudent.dao;

import com.bigstudent.domain.BsManagerDo;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表Dao
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:23:11
 */
public interface BsManagerDao  {

    BsManagerDo getManagerInfo(@Param("managerName") String managerName, @Param("managerPassword") String managerPassword);
    BsManagerDo getById(Integer id);
    Integer addManager(BsManagerDo bsManagerDo);
    Integer updateManager(BsManagerDo bsManagerDo);
}
