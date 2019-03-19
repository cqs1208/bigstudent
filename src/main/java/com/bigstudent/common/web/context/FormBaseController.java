package com.bigstudent.common.web.context;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.exception.BigStudentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/5
 */
public class FormBaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public WebContext parseWebRequestData(HttpServletRequest request,  String... patams){
        Map<String, Object> map = new HashMap<>();
        for(String param : patams){
            map.put(param, request.getParameter(param));
            /*if(null == request.getParameter(param)){
                logger.error("form param error: " + "param:" + param);
                throw BigStudentException.paramException(null);
            }else{
                map.put(param, request.getParameter(param));
            }*/
        }
        WebContext webContext = new WebContext();
        webContext.setBodyParams(map);
        return webContext;
    }
}
