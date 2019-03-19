package com.bigstudent.common.enums;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/23
 */
public enum DictionaryTypeEnum {

    BASE_FILM_LABEL("FILM_TYPE","电影标签"),
    BASE_RESOURCE("BASE_RESOURCE","资源"),
    BASE_ARTICLE_MAJOR("BASE_ARTICLE_MAJOR","文章大学专业"),
    BASE_ARTICLE_LABEL("BASE_ARTICLE_LABEL","文章标签"),
    BASE_ARTICLE_PLACE("BASE_ARTICLE_PLACE","文章地区"),


    ;

    private DictionaryTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static DictionaryTypeEnum findEnumByCode(String type) {
        for (DictionaryTypeEnum enumInfo : DictionaryTypeEnum.values()) {
            if (enumInfo.getCode().equals(type)) {
                return enumInfo;
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
