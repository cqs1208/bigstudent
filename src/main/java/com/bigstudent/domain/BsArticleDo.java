package com.bigstudent.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 文章表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-07 20:13:57
 */
@Data
 public class BsArticleDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章图片
     */
    private String articleImage;

    /**
     * 文章内容
     */
    private String articleContent;

    /**
    * 文章标签
    */
   private String articleLabel;

   /**
    * 文章标签名称
    */
   private List<String> articleLabelName;

    /**
     * 文章摘要
     */
    private String articleAbstract;

    /**
     * 是否原创(0:不是原创;1:原创;)
     */
    private String articleOriginal;

    /**
     * 来源名称
     */
    private String articleResourceName;

    /**
     * 来源链接
     */
    private String articleResourceUrl;

    /**
     * 地区表ID
     */
    private Integer articlePlaceId;

   /**
    * 地区表ID对应名称
    */
   private String articlePlaceName;

    /**
     * 大学专业ID（三级ID）
     */
    private Integer articleMajorId;

   /**
    * 大学专业ID对应名称
    */
   private String articleMajorName;

    /**
     * 浏览次数
     */
    private Integer articleBrowse;

    /**
     * 点赞人数
     */
    private Integer articleAgree;

    /**
     * 评论人数
     */
    private Integer articleComment;

    /**
     * 收藏人数
     */
    private Integer articleCollection;

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
    * 海报
    */
   private String articlePosters;

   /**
    * 文章形式（1:文章形式;2:问答形式;）
    */
   private Integer articleShape;
}