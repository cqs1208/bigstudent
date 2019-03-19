package com.bigstudent.common.web.context;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.exception.BigStudentException;
import com.bigstudent.common.web.context.IOUtils;
import com.bigstudent.common.web.context.WebContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/5
 */
public class JsonBaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public  WebContext parseWebRequestData(HttpServletRequest request, String... params){
        WebContext webContext = new WebContext();
        String body = "";
        try {
            body = IOUtils.read(request);
            JSONObject jsonObj = null;
            if(StringUtils.isNotEmpty(body)){
                jsonObj = JSON.parseObject(body);
                if(null != params){
                    for(String str : params){
                        if(null == jsonObj.get(str)){
                            throw BigStudentException.paramException(null);
                        }
                    }
                }
            }
            webContext.setBodyParams(jsonObj);


        }catch (BigStudentException e){
            logger.error("json param error: " + "body:" + body);
            throw BigStudentException.paramException(null);
        }catch (Exception e){
            logger.error("error info: " + "body:" + body);
            throw BigStudentException.systemException(e);
        }
        return webContext;
    }
}
