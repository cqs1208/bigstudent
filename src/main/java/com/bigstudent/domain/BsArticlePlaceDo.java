package com.bigstudent.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 文章地区表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:53
 */

 @Data
 public class BsArticlePlaceDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 排序值
     */
    private Integer sort;

    /**
     * 是否热门（Y:是;N:否;）
     */
    private String isHot;

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