package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.domain.BsArticleDo;
import com.bigstudent.query.ArticleQuery;
import com.bigstudent.service.BsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/23
 */
@RestController
@RequestMapping("/article")
public class ArticleAdminController extends FormBaseController {
    @Autowired
    private BsArticleService bsArticleService;

    @RequestMapping(value = "/addArticle", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addArticle (BsArticleDo bsArticleDo){

        boolean flag = bsArticleService.addArticle(bsArticleDo);
        if(flag){
            CommonResponse.getSystemError(null);
        }

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateArticle", produces = {"application/json;charset=UTF-8"})
    public CommonResponse updateArticle (BsArticleDo bsArticleDo){

        bsArticleService.updateArticle(bsArticleDo);

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/delArticle", produces = {"application/json;charset=UTF-8"})
    public CommonResponse DelArticle (BsArticleDo bsArticleDo){

        bsArticleDo.setIsDelete("1");
        bsArticleService.updateArticle(bsArticleDo);

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/getArticleList", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getArticleList ( ArticleQuery articleQuery){
        JSONObject map = new JSONObject();

        List<BsArticleDo> articleList = bsArticleService.getArticleList(articleQuery);
        map.put("articleList", articleList);
        map.put("query", articleQuery);

        return CommonResponse.getSuccessInfo(map);
    }
}
