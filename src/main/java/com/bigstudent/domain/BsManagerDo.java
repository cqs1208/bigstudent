package com.bigstudent.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:31:48
 */
@Getter
@Setter
 public class BsManagerDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Integer id;
    
    /**
     * 管理员名称
     */
    private String managerName;

    /**
     * 管理员密码
     */
    private String managerPassword;

    /**
     * 创建者
     */
    private Integer creatorId;

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