package com.bigstudent.common.enums;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/23
 */
public enum DictionaryDataEnum {

    FILM_TYPE("FILM_TYPE","电影标签（类型）"),
    FILM_PLACE("FILM_PLACE","电影标签（地址）"),
    FILM_FORM("FILM_FORM","电影标签（形式）"),
    RESOURCE_LIST("RESOURCE_LIST","资源列表"),
    ARTICLE_MAJOR("ARTICLE_MAJOR","文章大学专业"),
    ARTICLE_LABEL("ARTICLE_LABEL","文章标签"),
    ARTICLE_PLACE("ARTICLE_PLACE","文章地区"),


    ;

    private DictionaryDataEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static DictionaryDataEnum findEnumByCode(String type) {
        for (DictionaryDataEnum dictionaryDataEnum : DictionaryDataEnum.values()) {
            if (dictionaryDataEnum.getCode().equals(type)) {
                return dictionaryDataEnum;
            }
        }
        return null;
    }

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
