package com.bigstudent.common;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/10/29
 */
public enum CommonCode {

    /***/
    SUCCESS("SUCCESS", "00000", "操作成功"),
    FAILED("FAILED", "00001",  "操作失败"),
    PARAM_ERROR("PARAM_ERROR", "00002", "参数异常"),
    SYSTEM_ERROR("SYSTEM_ERROR", "00003", "系统异常"),
    ALREADY_REGIST("ALREADY_REGIST", "00004", "请勿重复注册"),
    NOT_EXIST("NOT_EXIST", "00005", "用户不存在"),
    ALREADY_EXIST("ALREADY_EXIST", "00006", "用户已存在"),
    NOT_LOGIN("NOT_LOGIN", "00007", "用户未登录"),


    UPLOAD_SUCCESS("NOT_LOGIN", "00100", "上传成功"),
    UPLOAD_FAILED("NOT_LOGIN", "00101", "上传失败"),
    ;

    private String commonCode;
    private String code;
    private String msg;

    CommonCode(String commonCode,String code, String name) {
        this.code = code;
        this.msg = name;
        this.commonCode = commonCode;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCommonCode() {
        return commonCode;
    }

    public void setCommonCode(String commonCode) {
        this.commonCode = commonCode;
    }
}
