package com.bigstudent.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bigstudent.common.exception.BigStudentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/10/29
 */
public class CommonResponse {
    private static final Logger logger = LoggerFactory.getLogger(CommonResponse.class);

    private String            code;                                   // code

    private String            msg;                                    // 返回提示

    private Object            data;                                   // 返回数据

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private CommonResponse() {
    }

    public static CommonResponse getNewInstance() {
        return new CommonResponse();
    }

    public static CommonResponse getNewInstance(CommonCode commonCode) {
        CommonResponse instance = new CommonResponse();
        instance.setCode(commonCode.getCode());
        instance.setMsg(commonCode.getMsg());
        return instance;
    }

    public static CommonResponse getNewInstance(BigStudentException ex) {
        CommonResponse instance = new CommonResponse();
        instance.setCode(ex.getErrorCode());
        instance.setMsg(ex.getErrorMsg());
        return instance;
    }

    public static CommonResponse getNewInstance(CommonCode commonCode, Object data) {
        CommonResponse instance = new CommonResponse();
        instance.setCode(commonCode.getCode());
        instance.setMsg(commonCode.getMsg());
        instance.setData(data);
        return instance;
    }

    public static CommonResponse getSuccessInfo(Object data) {
        CommonResponse instance = new CommonResponse();
        instance.setCode(CommonCode.SUCCESS.getCode());
        instance.setMsg(CommonCode.SUCCESS.getMsg());
        instance.setData(data);
        return instance;
    }

    public static CommonResponse getSystemError(Object data) {
        CommonResponse instance = new CommonResponse();
        instance.setCode(CommonCode.FAILED.getCode());
        instance.setMsg(CommonCode.FAILED.getMsg());
        instance.setData(data);
        return instance;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

}
