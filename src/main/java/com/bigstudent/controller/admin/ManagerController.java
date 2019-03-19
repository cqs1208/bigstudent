package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonCode;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.util.ConverterUtils;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.common.web.context.WebContext;
import com.bigstudent.domain.BsManagerDo;
import com.bigstudent.domain.BsUserDo;
import com.bigstudent.service.BsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/14
 */
@RestController
@RequestMapping("/manager")
public class ManagerController  extends FormBaseController {

    @Autowired
    private BsManagerService bsManagerService;

    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public CommonResponse login (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request, "managerName", "managerPassword");

        String managerName = webContext.getBodyParams().get("managerName").toString();
        String managerPassword = webContext.getBodyParams().get("managerPassword").toString();
        BsManagerDo bsManagerDo = bsManagerService.getManagerInfo(managerName, managerPassword);
        if(null == bsManagerDo){
            return CommonResponse.getNewInstance(CommonCode.NOT_EXIST);
        }

        map.put("managerInfo", bsManagerDo);
        return CommonResponse.getSuccessInfo(map);
    }

    @RequestMapping(value = "/addManager", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addManager (HttpServletRequest request){

        WebContext webContext =  parseWebRequestData(request, "managerName", "creatorId");

        BsManagerDo bsManagerDo = new BsManagerDo();
        bsManagerDo.setManagerName(webContext.getBodyParams().get("managerName").toString());
        bsManagerDo.setCreatorId(Integer.valueOf(webContext.getBodyParams().get("creatorId").toString()));
        Date date = new Date();
        bsManagerDo.setCreateTime(date);
        bsManagerDo.setUpdateTime(date);

        Integer reInt = bsManagerService.addManager(bsManagerDo);
        if(null == reInt){
            return CommonResponse.getNewInstance(CommonCode.FAILED);
        }

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateManagerPassword", produces = {"application/json;charset=UTF-8"})
    public CommonResponse updateManager (HttpServletRequest request){

        WebContext webContext =  parseWebRequestData(request, "managerPassword", "id");

        BsManagerDo bsManagerDo = new BsManagerDo();
        bsManagerDo.setManagerPassword(webContext.getBodyParams().get("managerPassword").toString());
        bsManagerDo.setId(Integer.valueOf(webContext.getBodyParams().get("id").toString()));
        Date date = new Date();
        bsManagerDo.setUpdateTime(date);

        boolean flag = bsManagerService.updateManager(bsManagerDo);
        if(!flag){
            return CommonResponse.getNewInstance(CommonCode.FAILED);
        }

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/delManager", produces = {"application/json;charset=UTF-8"})
    public CommonResponse delManager (HttpServletRequest request){

      /*  WebContext webContext =  parseWebRequestData(request, "creatorId", "id");

        BsManagerDo bsManagerDo = new BsManagerDo();
        bsManagerDo.setManagerPassword(webContext.getBodyParams().get("creatorId").toString());
        bsManagerDo.setId(Integer.valueOf(webContext.getBodyParams().get("id").toString()));
        Date date = new Date();
        bsManagerDo.setUpdateTime(date);

        boolean flag = bsManagerService.delManager(bsManagerDo);
        if(!flag){
            return CommonResponse.getNewInstance(CommonCode.FAILED.getCode(),CommonCode.FAILED.getMsg());
        }*/

        return CommonResponse.getSuccessInfo(null);
    }
}
