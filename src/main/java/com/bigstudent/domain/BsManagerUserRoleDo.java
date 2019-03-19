package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员角色表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:36:59
 */
 public class BsManagerUserRoleDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 管理员id
     */
    private String managerId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 创建日期
     */
    private String createTime;

    /**
     * 更新日期
     */
    private String updateTime;



    /**
     * 获取主键Id
     *
     * @return id
     */
    public Long getId(){
      return id;
    }

    /**
     * 设置主键Id
     * 
     * @param 要设置的主键Id
     */
    public void setId(Long id){
      this.id = id;
    }
    
    /**
     * 获取管理员id
     *
     * @return 管理员id
     */
    public String getManagerId(){
      return managerId;
    }

    /**
     * 设置管理员id
     * 
     * @param managerId 要设置的管理员id
     */
    public void setManagerId(String managerId){
      this.managerId = managerId;
    }

    /**
     * 获取角色ID
     *
     * @return 角色ID
     */
    public Integer getRoleId(){
      return roleId;
    }

    /**
     * 设置角色ID
     * 
     * @param roleId 要设置的角色ID
     */
    public void setRoleId(Integer roleId){
      this.roleId = roleId;
    }

    /**
     * 获取创建日期
     *
     * @return 创建日期
     */
    public String getCreateTime(){
      return createTime;
    }

    /**
     * 设置创建日期
     * 
     * @param createTime 要设置的创建日期
     */
    public void setCreateTime(String createTime){
      this.createTime = createTime;
    }

    /**
     * 获取更新日期
     *
     * @return 更新日期
     */
    public String getUpdateTime(){
      return updateTime;
    }

    /**
     * 设置更新日期
     * 
     * @param updateTime 要设置的更新日期
     */
    public void setUpdateTime(String updateTime){
      this.updateTime = updateTime;
    }


}