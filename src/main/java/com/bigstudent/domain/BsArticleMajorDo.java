package com.bigstudent.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 文章大学专业表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:21
 */
@Data
 public class BsArticleMajorDo implements Serializable{

    private static final long serialVersionUID = 1L;

   private List<BsArticleMajorDo> articleMajorList = new ArrayList<>();
    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 学科门类
     */
    private String majorSubjectName;

    /**
     * 父级ID
     */
    private Integer majorParentId;

    /**
     * 等级
     */
    private Integer majorLevel;

    /**
     * 排序
     */
    private Integer sort;
    /**
     * 类型（1:专科;2:本科;）
     */
    private Integer majorSchoolType;

    /**
     * code
     */
    private String majorCode;

    /**
     * 类型
     */
    private String majorType;


    /**
     * 备注
     */
    private String remark;

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

}