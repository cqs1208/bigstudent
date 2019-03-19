package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.common.enums.DictionaryTypeEnum;
import com.bigstudent.common.web.context.JsonBaseController;
import com.bigstudent.domain.BsArticlePlaceDo;
import com.bigstudent.service.BsArticlePlaceService;
import com.bigstudent.service.impl.DictionaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/articlePlace")
public class ArticlePlaceController  extends JsonBaseController {

    @Autowired
    private BsArticlePlaceService bsArticlePlaceService;

    @Autowired
    private DictionaryData dictionaryData;

    @RequestMapping(value = "/addArticlePlace", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addArticlePlace (@RequestBody BsArticlePlaceDo bsArticlePlaceDo){

        bsArticlePlaceService.addArticlePlace(bsArticlePlaceDo);

        //刷新文章地区配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_PLACE.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/updateArticlePlace", produces = {"application/json;charset=UTF-8"})
    public CommonResponse updateArticlePlace (@RequestBody BsArticlePlaceDo bsArticlePlaceDo){

        bsArticlePlaceService.updateArticlePlace(bsArticlePlaceDo);

        //刷新文章地区配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_PLACE.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/delArticlePlace", produces = {"application/json;charset=UTF-8"})
    public CommonResponse DelArticlePlace (@RequestBody BsArticlePlaceDo bsArticlePlaceDo){

        bsArticlePlaceDo.setIsDelete("1");
        bsArticlePlaceService.updateArticlePlace(bsArticlePlaceDo);

        //刷新文章地区配置
        dictionaryData.refreshData(DictionaryTypeEnum.BASE_ARTICLE_PLACE.getCode());

        return CommonResponse.getSuccessInfo(null);
    }

    @RequestMapping(value = "/getArticlePlaceList", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getArticleMajorList (){
        JSONObject map = new JSONObject();

        List<BsArticlePlaceDo> articlePlaceList = (List<BsArticlePlaceDo>)dictionaryData.baseData.get(DictionaryDataEnum.ARTICLE_PLACE.getCode());
        map.put("articlePlaceList", articlePlaceList);

        return CommonResponse.getSuccessInfo(map);
    }
}
