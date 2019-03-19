package com.bigstudent.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-05 12:02:04
 */
@Getter
@Setter
 public class BsUserDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 用户昵称
     */
    private String userNick;

    /**
     * 用户名称（手机号）
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String userImage;

    /**
     * 性别（0:保密;1:男;2:女;）
     */
    private String sex;

    /**
     * 邮箱
     */
    private String userMail;

    /**
     * qq号
     */
    private String qqCode;

    /**
     * 微信号
     */
    private String wechatCode;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;

    /**
     * 删除flag
     */
    private String isDelete;

}