package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.common.enums.DictionaryTypeEnum;
import com.bigstudent.common.web.context.FormBaseController;
import com.bigstudent.domain.BsArticleLabelDo;
import com.bigstudent.service.BsArticleLabelService;
import com.bigstudent.service.impl.DictionaryData;
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
@RequestMapping("/articleLabel")
public class ArticleLabelController extends FormBaseController {

    @Autowired
    private BsArticleLabelService bsArticleLabelService;

    @Autowired
    private DictionaryData dictionaryData;

    @RequestMapping(value = "/addArticleLabel")
    public CommonResponse addArticleLabel ( BsArticleLabelDo bsArticleLabelDo){

        bsArticleLabelService.addArticleLabel(bsArticleLabelDo);

        //刷新文章标签配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_LABEL.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateArticleLabel")
    public CommonResponse updateArticleLabel (BsArticleLabelDo bsArticleLabelDo){

        bsArticleLabelService.updateArticleLabel(bsArticleLabelDo);

        //刷新文章标签配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_LABEL.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

   /* @RequestMapping(value = "/delArticleLabel")
    public CommonResponse DelArticleMajor ( BsArticleLabelDo bsArticleLabelDo){

        bsArticleLabelDo.setIsDelete("1");
        bsArticleLabelService.updateArticleLabel(bsArticleLabelDo);

        //刷新文章标签配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_LABEL.getCode());

        return CommonResponse.getSuccessInfo(null);
    }*/

    @RequestMapping(value = "/getArticleLabelList", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getArticleMajorList (){
        JSONObject map = new JSONObject();

        List<BsArticleLabelDo> articleLabelList = (List<BsArticleLabelDo>)dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_LABEL.getCode());
        map.put("articleLabelList", articleLabelList);

        return CommonResponse.getSuccessInfo(map);
    }
}
