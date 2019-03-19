package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.common.enums.DictionaryTypeEnum;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.domain.BsArticleMajorDo;
import com.bigstudent.service.BsArticleMajorService;
import com.bigstudent.service.impl.DictionaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/23
 */
@RestController
@RequestMapping("/articleMajor")
public class ArticleMajorController extends FormBaseController {

    @Autowired
    private BsArticleMajorService bsArticleMajorService;

    @Autowired
    private DictionaryData dictionaryData;

    @RequestMapping(value = "/addArticleMajor", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addArticleMajor ( BsArticleMajorDo bsArticleMajorDo){
        bsArticleMajorService.addArticleMajor(bsArticleMajorDo);

        //刷新大学专业配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_MAJOR.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateArticleMajor")
    public CommonResponse updateArticleMajor ( BsArticleMajorDo bsArticleMajorDo){

        boolean flag = bsArticleMajorService.updateArticleMajor(bsArticleMajorDo);

        //刷新大学专业配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_MAJOR.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/delArticleMajor")
    public CommonResponse DelArticleMajor ( BsArticleMajorDo bsArticleMajorDo){

        bsArticleMajorDo.setIsDelete("1");
        bsArticleMajorService.updateArticleMajor(bsArticleMajorDo);

        //刷新大学专业配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_MAJOR.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/getArticleMajorList", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getArticleMajorList (HttpServletRequest request){
        JSONObject map = new JSONObject();

        String uri = request.getRequestURI();
        String url = request.getRequestURL().toString();


        List<BsArticleMajorDo> articleMajorList = (List<BsArticleMajorDo>) dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_MAJOR.getCode());
        if(CollectionUtils.isEmpty(articleMajorList)){
            return CommonResponse.getSuccessInfo(null);
        }
        List<BsArticleMajorDo> articleMajorFirstList = articleMajorList.stream().filter(item -> item.getMajorLevel() == 1).collect(Collectors.toList());
        List<BsArticleMajorDo> articleMajorSecondList = articleMajorList.stream().filter(item -> item.getMajorLevel() == 2).collect(Collectors.toList());
        List<BsArticleMajorDo> articleMajorThirdList = articleMajorList.stream().filter(item -> item.getMajorLevel() == 3).collect(Collectors.toList());

        //二级分类设置三级分类
        articleMajorSecondList = bsArticleMajorService.merge(articleMajorSecondList, articleMajorThirdList);

        //一级分类设置二级分类
        articleMajorFirstList = bsArticleMajorService.merge(articleMajorFirstList, articleMajorSecondList);

        map.put("articleMajorList", articleMajorFirstList);
        return CommonResponse.getSuccessInfo(map);
    }

}
