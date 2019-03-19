package com.bigstudent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 电影表实体
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-21 19:27:02
 */
 public class BsFilmDo implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;
    
    /**
     * 影片名称
     */
    private String filmName;

    /**
     * 电影摘要
     */
    private String articleAbstract;

    /**
     * 电影图片
     */
    private String filmImage;

    /**
     * 电影海报
     */
    private String filmPoster;

    /**
     * 影片主题
     */
    private String filmTitle;

    /**
     * 影片形式
     */
    private String filmForm;

    /**
     * 影片地址
     */
    private String filmPlace;

    /**
     * 影片类型（多个用分号隔开）
     */
    private String filmType;

    /**
     * 内容
     */
    private String filmContent;

    /**
     * 是否原创
     */
    private String filmOriginal;

    /**
     * 来源名称
     */
    private String filmResourceName;

    /**
     * 来源链接
     */
    private String filmResourceUrl;

    /**
     * 浏览次数
     */
    private Integer filmBrowse;

    /**
     * 点赞人数
     */
    private Integer filmAgree;

    /**
     * 收藏人数
     */
    private Integer filmCollection;

    /**
     * 评论人数
     */
    private Integer filmComment;

    /**
     * 豆瓣评分
     */
    private Integer filmScore;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;

    /**
     * 标签类型
     */
    private String labelType;

    /**
     * 标签名称
     */
    private String labelName;



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
    
    /**
     * 获取影片名称
     *
     * @return 影片名称
     */
    public String getFilmName(){
      return filmName;
    }

    /**
     * 设置影片名称
     * 
     * @param filmName 要设置的影片名称
     */
    public void setFilmName(String filmName){
      this.filmName = filmName;
    }

    /**
     * 获取电影摘要
     *
     * @return 电影摘要
     */
    public String getArticleAbstract(){
      return articleAbstract;
    }

    /**
     * 设置电影摘要
     * 
     * @param articleAbstract 要设置的电影摘要
     */
    public void setArticleAbstract(String articleAbstract){
      this.articleAbstract = articleAbstract;
    }

    /**
     * 获取电影图片
     *
     * @return 电影图片
     */
    public String getFilmImage(){
      return filmImage;
    }

    /**
     * 设置电影图片
     * 
     * @param filmImage 要设置的电影图片
     */
    public void setFilmImage(String filmImage){
      this.filmImage = filmImage;
    }

    /**
     * 获取电影海报
     *
     * @return 电影海报
     */
    public String getFilmPoster(){
      return filmPoster;
    }

    /**
     * 设置电影海报
     * 
     * @param filmPoster 要设置的电影海报
     */
    public void setFilmPoster(String filmPoster){
      this.filmPoster = filmPoster;
    }

    /**
     * 获取影片主题
     *
     * @return 影片主题
     */
    public String getFilmTitle(){
      return filmTitle;
    }

    /**
     * 设置影片主题
     * 
     * @param filmTitle 要设置的影片主题
     */
    public void setFilmTitle(String filmTitle){
      this.filmTitle = filmTitle;
    }

    /**
     * 获取影片形式
     *
     * @return 影片形式
     */
    public String getFilmForm(){
      return filmForm;
    }

    /**
     * 设置影片形式
     * 
     * @param filmForm 要设置的影片形式
     */
    public void setFilmForm(String filmForm){
      this.filmForm = filmForm;
    }

    /**
     * 获取影片地址
     *
     * @return 影片地址
     */
    public String getFilmPlace(){
      return filmPlace;
    }

    /**
     * 设置影片地址
     * 
     * @param filmPlace 要设置的影片地址
     */
    public void setFilmPlace(String filmPlace){
      this.filmPlace = filmPlace;
    }

    /**
     * 获取影片类型（多个用分号隔开）
     *
     * @return 影片类型（多个用分号隔开）
     */
    public String getFilmType(){
      return filmType;
    }

    /**
     * 设置影片类型（多个用分号隔开）
     * 
     * @param filmType 要设置的影片类型（多个用分号隔开）
     */
    public void setFilmType(String filmType){
      this.filmType = filmType;
    }

    /**
     * 获取内容
     *
     * @return 内容
     */
    public String getFilmContent(){
      return filmContent;
    }

    /**
     * 设置内容
     * 
     * @param filmContent 要设置的内容
     */
    public void setFilmContent(String filmContent){
      this.filmContent = filmContent;
    }

    /**
     * 获取是否原创
     *
     * @return 是否原创
     */
    public String getFilmOriginal(){
      return filmOriginal;
    }

    /**
     * 设置是否原创
     * 
     * @param filmOriginal 要设置的是否原创
     */
    public void setFilmOriginal(String filmOriginal){
      this.filmOriginal = filmOriginal;
    }

    /**
     * 获取来源名称
     *
     * @return 来源名称
     */
    public String getFilmResourceName(){
      return filmResourceName;
    }

    /**
     * 设置来源名称
     * 
     * @param filmResourceName 要设置的来源名称
     */
    public void setFilmResourceName(String filmResourceName){
      this.filmResourceName = filmResourceName;
    }

    /**
     * 获取来源链接
     *
     * @return 来源链接
     */
    public String getFilmResourceUrl(){
      return filmResourceUrl;
    }

    /**
     * 设置来源链接
     * 
     * @param filmResourceUrl 要设置的来源链接
     */
    public void setFilmResourceUrl(String filmResourceUrl){
      this.filmResourceUrl = filmResourceUrl;
    }

    /**
     * 获取浏览次数
     *
     * @return 浏览次数
     */
    public Integer getFilmBrowse(){
      return filmBrowse;
    }

    /**
     * 设置浏览次数
     * 
     * @param filmBrowse 要设置的浏览次数
     */
    public void setFilmBrowse(Integer filmBrowse){
      this.filmBrowse = filmBrowse;
    }

    /**
     * 获取点赞人数
     *
     * @return 点赞人数
     */
    public Integer getFilmAgree(){
      return filmAgree;
    }

    /**
     * 设置点赞人数
     * 
     * @param filmAgree 要设置的点赞人数
     */
    public void setFilmAgree(Integer filmAgree){
      this.filmAgree = filmAgree;
    }

    /**
     * 获取收藏人数
     *
     * @return 收藏人数
     */
    public Integer getFilmCollection(){
      return filmCollection;
    }

    /**
     * 设置收藏人数
     * 
     * @param filmCollection 要设置的收藏人数
     */
    public void setFilmCollection(Integer filmCollection){
      this.filmCollection = filmCollection;
    }

    /**
     * 获取评论人数
     *
     * @return 评论人数
     */
    public Integer getFilmComment(){
      return filmComment;
    }

    /**
     * 设置评论人数
     * 
     * @param filmComment 要设置的评论人数
     */
    public void setFilmComment(Integer filmComment){
      this.filmComment = filmComment;
    }

    /**
     * 获取豆瓣评分
     *
     * @return 豆瓣评分
     */
    public Integer getFilmScore(){
      return filmScore;
    }

    /**
     * 设置豆瓣评分
     * 
     * @param filmScore 要设置的豆瓣评分
     */
    public void setFilmScore(Integer filmScore){
      this.filmScore = filmScore;
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

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labeType) {
        this.labelType = labeType;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}