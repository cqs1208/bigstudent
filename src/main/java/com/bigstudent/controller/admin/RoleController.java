package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonCode;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.common.web.context.WebContext;
import com.bigstudent.domain.BsManagerDo;
import com.bigstudent.service.BsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/17
 */
@RestController
@RequestMapping("/role")
public class RoleController extends FormBaseController {
    @Autowired
    private BsManagerService bsManagerService;

    @RequestMapping(value = "/addRole", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addRole (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request, "roleName", "managerPassword");

       /* String managerName = webContext.getBodyParams().get("roleName").toString();
        String managerPassword = webContext.getBodyParams().get("roleDescription").toString();
        String managerPassword = webContext.getBodyParams().get("roleDescription").toString();
        BsManagerDo bsManagerDo = bsManagerService.getManagerInfo(managerName, managerPassword);
        if(null == bsManagerDo){
            return CommonResponse.getNewInstance(CommonCode.NOT_EXIST.getCode(),CommonCode.NOT_EXIST.getMsg());
        }*/

        map.put("managerInfo", null);
        return CommonResponse.getSuccessInfo(map);
    }
}
