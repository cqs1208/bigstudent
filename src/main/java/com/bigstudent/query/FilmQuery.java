package com.bigstudent.query;

import java.util.Date;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/21
 */
public class FilmQuery {
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract;
    }

    public String getFilmImage() {
        return filmImage;
    }

    public void setFilmImage(String filmImage) {
        this.filmImage = filmImage;
    }

    public String getFilmPoster() {
        return filmPoster;
    }

    public void setFilmPoster(String filmPoster) {
        this.filmPoster = filmPoster;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmForm() {
        return filmForm;
    }

    public void setFilmForm(String filmForm) {
        this.filmForm = filmForm;
    }

    public String getFilmPlace() {
        return filmPlace;
    }

    public void setFilmPlace(String filmPlace) {
        this.filmPlace = filmPlace;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public String getFilmContent() {
        return filmContent;
    }

    public void setFilmContent(String filmContent) {
        this.filmContent = filmContent;
    }

    public String getFilmOriginal() {
        return filmOriginal;
    }

    public void setFilmOriginal(String filmOriginal) {
        this.filmOriginal = filmOriginal;
    }

    public String getFilmResourceName() {
        return filmResourceName;
    }

    public void setFilmResourceName(String filmResourceName) {
        this.filmResourceName = filmResourceName;
    }

    public String getFilmResourceUrl() {
        return filmResourceUrl;
    }

    public void setFilmResourceUrl(String filmResourceUrl) {
        this.filmResourceUrl = filmResourceUrl;
    }

    public Integer getFilmBrowse() {
        return filmBrowse;
    }

    public void setFilmBrowse(Integer filmBrowse) {
        this.filmBrowse = filmBrowse;
    }

    public Integer getFilmAgree() {
        return filmAgree;
    }

    public void setFilmAgree(Integer filmAgree) {
        this.filmAgree = filmAgree;
    }

    public Integer getFilmCollection() {
        return filmCollection;
    }

    public void setFilmCollection(Integer filmCollection) {
        this.filmCollection = filmCollection;
    }

    public Integer getFilmComment() {
        return filmComment;
    }

    public void setFilmComment(Integer filmComment) {
        this.filmComment = filmComment;
    }

    public Integer getFilmScore() {
        return filmScore;
    }

    public void setFilmScore(Integer filmScore) {
        this.filmScore = filmScore;
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

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
