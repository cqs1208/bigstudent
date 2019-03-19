package com.bigstudent.common.exception;

import com.bigstudent.common.CommonCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/6
 */
@Getter
@Setter
public class BigStudentException extends RuntimeException {

    private String errorCode;
    private String errorMsg;

    private Exception exception;

    public BigStudentException(String code, String msg) {
        super();
        this.errorCode = code;
        this.errorMsg = msg;

    }

    public BigStudentException(String code, String msg, Exception exception) {
        super();
        this.errorCode = code;
        this.errorMsg = msg;
        this.exception = exception;
    }

    public static BigStudentException paramException(Exception exception) {
        return new BigStudentException(CommonCode.PARAM_ERROR.getCode(),
                CommonCode.PARAM_ERROR.getMsg(), exception);
    }
    public static BigStudentException systemException(Exception exception) {
        return new BigStudentException(CommonCode.SYSTEM_ERROR.getCode(),
                CommonCode.SYSTEM_ERROR.getMsg(), exception);
    }
}
