package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:35:17
 */
 public class BsManagerRoleDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDescription;

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
     * 获取角色名称
     *
     * @return 角色名称
     */
    public String getRoleName(){
      return roleName;
    }

    /**
     * 设置角色名称
     * 
     * @param roleName 要设置的角色名称
     */
    public void setRoleName(String roleName){
      this.roleName = roleName;
    }

    /**
     * 获取角色描述
     *
     * @return 角色描述
     */
    public String getRoleDescription(){
      return roleDescription;
    }

    /**
     * 设置角色描述
     * 
     * @param roleDescription 要设置的角色描述
     */
    public void setRoleDescription(String roleDescription){
      this.roleDescription = roleDescription;
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