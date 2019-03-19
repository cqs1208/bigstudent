package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 资源表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 11:31:50
 */
 public class BsResourceDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 资源名称
     */
    private String name;

    /**
     * 一级分类
     */
    private String type;

    /**
     * 二级分类
     */
    private String secType;

    /**
     * 描述
     */
    private String description;

    /**
     * value值
     */
    private String value;

    /**
     * value1值
     */
    private String value1;

    /**
     * value2值
     */
    private String value2;

    /**
     * value3值
     */
    private String value3;

    /**
     * value4值
     */
    private String value4;

    /**
     * value5值
     */
    private String value5;

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
     * 获取资源名称
     *
     * @return 资源名称
     */
    public String getName(){
      return name;
    }

    /**
     * 设置资源名称
     * 
     * @param name 要设置的资源名称
     */
    public void setName(String name){
      this.name = name;
    }

    /**
     * 获取一级分类
     *
     * @return 一级分类
     */
    public String getType(){
      return type;
    }

    /**
     * 设置一级分类
     * 
     * @param type 要设置的一级分类
     */
    public void setType(String type){
      this.type = type;
    }

    /**
     * 获取二级分类
     *
     * @return 二级分类
     */
    public String getSecType(){
      return secType;
    }

    /**
     * 设置二级分类
     * 
     * @param secType 要设置的二级分类
     */
    public void setSecType(String secType){
      this.secType = secType;
    }

    /**
     * 获取描述
     *
     * @return 描述
     */
    public String getDescription(){
      return description;
    }

    /**
     * 设置描述
     * 
     * @param description 要设置的描述
     */
    public void setDescription(String description){
      this.description = description;
    }

    /**
     * 获取value值
     *
     * @return value值
     */
    public String getValue(){
      return value;
    }

    /**
     * 设置value值
     * 
     * @param value 要设置的value值
     */
    public void setValue(String value){
      this.value = value;
    }

    /**
     * 获取value1值
     *
     * @return value1值
     */
    public String getValue1(){
      return value1;
    }

    /**
     * 设置value1值
     * 
     * @param value1 要设置的value1值
     */
    public void setValue1(String value1){
      this.value1 = value1;
    }

    /**
     * 获取value2值
     *
     * @return value2值
     */
    public String getValue2(){
      return value2;
    }

    /**
     * 设置value2值
     * 
     * @param value2 要设置的value2值
     */
    public void setValue2(String value2){
      this.value2 = value2;
    }

    /**
     * 获取value3值
     *
     * @return value3值
     */
    public String getValue3(){
      return value3;
    }

    /**
     * 设置value3值
     * 
     * @param value3 要设置的value3值
     */
    public void setValue3(String value3){
      this.value3 = value3;
    }

    /**
     * 获取value4值
     *
     * @return value4值
     */
    public String getValue4(){
      return value4;
    }

    /**
     * 设置value4值
     * 
     * @param value4 要设置的value4值
     */
    public void setValue4(String value4){
      this.value4 = value4;
    }

    /**
     * 获取value5值
     *
     * @return value5值
     */
    public String getValue5(){
      return value5;
    }

    /**
     * 设置value5值
     * 
     * @param value5 要设置的value5值
     */
    public void setValue5(String value5){
      this.value5 = value5;
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