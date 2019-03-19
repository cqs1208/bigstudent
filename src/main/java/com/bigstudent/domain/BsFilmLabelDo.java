package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 电影标签表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-21 19:26:25
 */
 public class BsFilmLabelDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 标签类型（FILM_TYPE:电影类型;FILM_PLACE:电影地址;FILM_FORM:电影形式;）
     */
    private String labelType;

    /**
     * 名称
     */
    private String labelName;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;



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
     */
    public void setId(Long id){
      this.id = id;
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    /**
     * 获取名称
     *
     * @return 名称
     */
    public String getLabelName(){
      return labelName;
    }

    /**
     * 设置名称
     * 
     * @param labelName 要设置的名称
     */
    public void setLabelName(String labelName){
      this.labelName = labelName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}