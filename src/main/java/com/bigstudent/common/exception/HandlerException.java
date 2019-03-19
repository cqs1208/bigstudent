package com.bigstudent.common.exception;

import com.bigstudent.common.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/6
 */

@ControllerAdvice
public class HandlerException {
    private static final Logger logger = LoggerFactory.getLogger(HandlerException.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public CommonResponse javaExceptionHandler(Exception ex) {
        logger.error("Exception: ",ex.getStackTrace());

        return CommonResponse.getSystemError(null);
    }

    /**
     * @Description: 自定义异常捕获处理
     */
    @ResponseBody
    @ExceptionHandler(value = BigStudentException.class)
    public CommonResponse messageCenterExceptionHandler(BigStudentException ex) {
        if(null != ex){
            logger.error("BigStudentException: ",ex.getStackTrace());
        }
        return CommonResponse.getNewInstance(ex);
    }
}
