package com.bigstudent.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.util.ConverterUtils;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.common.web.context.WebContext;
import com.bigstudent.domain.BsArticleDo;
import com.bigstudent.domain.BsUserDo;
import com.bigstudent.service.BsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/7
 */
@RestController
@RequestMapping("/article")
public class ArticleController extends FormBaseController {

   @Autowired
    private BsArticleService bsArticleService;

    @RequestMapping(value = "/getArticleInfo", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addUserInfo (HttpServletRequest request){
        JSONObject map = new JSONObject();
        WebContext webContext =  parseWebRequestData(request, null);
        BsArticleDo bsArticleDo = (BsArticleDo) ConverterUtils.mapToObject(webContext.getBodyParams(), BsArticleDo.class);


      //  map.put("userInfo", bsUserDoInfo);
        return CommonResponse.getSuccessInfo(map);
    }
}
