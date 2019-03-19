package com.bigstudent.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章标签表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:42:32
 */
@Data
 public class BsArticleLabelDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 标签名称
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
     * 是否删除
     */
    private String isDelete;

   /**
    * 排序
    */
   private Integer sort;
}