package com.bigstudent.common.enums;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/23
 */
public enum ResourceTypeEnum {

    HOST("HOST","服务器地址")


    ;

    private ResourceTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResourceTypeEnum findEnumByCode(String type) {
        for (ResourceTypeEnum enumInfo : ResourceTypeEnum.values()) {
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
