package com.bigstudent.common.web.context;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/5
 */
public class WebContext {

    private Integer userId;
    private String userName;

    private Map<String,Object> bodyParams = new HashMap<>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, Object> getBodyParams() {
        return bodyParams;
    }


    public void setBodyParams(Map<String, Object> bodyParams) {
        this.bodyParams = bodyParams;
    }

    @Override
    public String toString() {
        return "WebContext{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", bodyParams=" + bodyParams +
                '}';
    }
}
