package com.bigstudent.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonCode;
import com.bigstudent.common.util.ConverterUtils;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.web.context.JsonBaseController;
import com.bigstudent.common.web.context.WebContext;
import com.bigstudent.domain.BsUserDo;
import com.bigstudent.service.BsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/5
 */
@RestController
@RequestMapping("/user")
public class UserController extends JsonBaseController {

    @Autowired
    private BsUserService bsUserService;

    @RequestMapping(value = "/regist", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addUserInfo (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request, "userName", "password");

        BsUserDo bsUserDo = new BsUserDo();
        bsUserDo.setUserName(webContext.getBodyParams().get("userName").toString());
        bsUserDo.setPassword(webContext.getBodyParams().get("password").toString());
        BsUserDo bsUserInfo = bsUserService.getUserInfo(bsUserDo);
        if(null != bsUserInfo){
            return CommonResponse.getNewInstance(CommonCode.ALREADY_REGIST);
        }

        BsUserDo bsUserDoInfo = (BsUserDo)ConverterUtils.mapToObject(webContext.getBodyParams(), BsUserDo.class);

        Long userId = bsUserService.addUserInfo(bsUserDoInfo);
        bsUserDoInfo.setId(userId);
        map.put("userInfo", bsUserDoInfo);
        return CommonResponse.getSuccessInfo(map);
    }

    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public CommonResponse login (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request,"userName", "password");
        BsUserDo bsUserDo = new BsUserDo();
        bsUserDo.setUserName(webContext.getBodyParams().get("userName").toString());
        bsUserDo.setPassword(webContext.getBodyParams().get("password").toString());
        BsUserDo bsUserInfo = bsUserService.getUserInfo(bsUserDo);
        if(null == bsUserInfo){
            return CommonResponse.getNewInstance(CommonCode.NOT_EXIST);
        }

        map.put("userInfo", bsUserInfo);
        return CommonResponse.getSuccessInfo(map);

    }

    @RequestMapping(value = "/getUserInfo", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getUserInfo (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request,"userName");
        String userName = webContext.getBodyParams().get("userName").toString();
        BsUserDo bsUserInfo = bsUserService.getUserByUserName(userName);
        if(null == bsUserInfo){
            return CommonResponse.getNewInstance(CommonCode.NOT_EXIST);
        }

        map.put("userInfo", bsUserInfo);
        return CommonResponse.getSuccessInfo(map);

    }

    @RequestMapping(value = "/updatePassword", produces = {"application/json;charset=UTF-8"})
    public CommonResponse setUserPassword (HttpServletRequest request){
        WebContext webContext =  parseWebRequestData(request, "userName", "oldPassword", "newPassword");
        BsUserDo bsUserDo = new BsUserDo();
        bsUserDo.setUserName(webContext.getBodyParams().get("userName").toString());
        bsUserDo.setPassword(webContext.getBodyParams().get("oldPassword").toString());
        BsUserDo bsUserInfo = bsUserService.getUserInfo(bsUserDo);

        if(null != bsUserInfo){
            bsUserDo.setId(bsUserInfo.getId());
            bsUserDo.setPassword(webContext.getBodyParams().get("newPassword").toString());
            bsUserService.updateUserInfo(bsUserDo);
        }
        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateUserInfo", produces = {"application/json;charset=UTF-8"})
    public CommonResponse updateUserInfo (HttpServletRequest request) {
        WebContext webContext =  parseWebRequestData(request, "userName");

        BsUserDo bsUserInfo = bsUserService.getUserByUserName(webContext.getBodyParams().get("userName").toString());

        if(null != bsUserInfo){
            BsUserDo bsUser = (BsUserDo)ConverterUtils.mapToObject(webContext.getBodyParams(), BsUserDo.class);
            bsUser.setId(bsUserInfo.getId());
            Date date = new Date();
            bsUser.setUpdateTime(date);
            bsUserService.updateUserInfo(bsUser);
        }
        return CommonResponse.getSuccessInfo(null);
    }



}
