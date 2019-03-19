package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:36:01
 */
 public class BsManagerMenuDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 父级ID
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

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
     * 获取父级ID
     *
     * @return 父级ID
     */
    public Integer getParentId(){
      return parentId;
    }

    /**
     * 设置父级ID
     * 
     * @param parentId 要设置的父级ID
     */
    public void setParentId(Integer parentId){
      this.parentId = parentId;
    }

    /**
     * 获取菜单名称
     *
     * @return 菜单名称
     */
    public String getMenuName(){
      return menuName;
    }

    /**
     * 设置菜单名称
     * 
     * @param menuName 要设置的菜单名称
     */
    public void setMenuName(String menuName){
      this.menuName = menuName;
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