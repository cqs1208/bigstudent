package com.bigstudent.service;


import com.bigstudent.domain.BsUserDo;

/**
 * 用户表Service
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-05 12:02:04
 */
public interface BsUserService {

    /**
     * 获取用户信息
     * @param bsUserDo
     * @return
     */
    BsUserDo getUserInfo(BsUserDo bsUserDo);

    /**
     * 根据手机号获取用户信息
     * @param userName
     * @return
     */
    BsUserDo getUserByUserName(String userName);

    /**
     * 更新用户信息
     * @param bsUserDo
     * @return
     */
    int updateUserInfo(BsUserDo bsUserDo);

    /**
     * 新增用户信息
     * @param bsUserDo
     * @return
     */
    Long addUserInfo(BsUserDo bsUserDo);
}
