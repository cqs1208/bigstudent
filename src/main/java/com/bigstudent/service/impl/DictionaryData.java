package com.bigstudent.service.impl;

import com.bigstudent.common.Constants;
import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.common.enums.DictionaryTypeEnum;
import com.bigstudent.domain.*;
import com.bigstudent.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/21
 */
@Component("dictionaryData")
public class DictionaryData {

    @Resource
    private BsFilmService bsFilmService;
    @Resource
    private BsResourceService bsResourceService;
    @Resource
    private BsArticleMajorService bsArticleMajorService;
    @Resource
    private BsArticleLabelService bsArticleLabelService;
    @Resource
    private BsArticlePlaceService bsArticlePlaceService;

    public  Map<String, Object> baseData = new HashMap<>();

    @PostConstruct
    public void init(){
        for (DictionaryTypeEnum enumInfo : DictionaryTypeEnum.values()) {
            refreshData(enumInfo.getCode());
        }
    }

    //刷新电影配置
    public void refreshData(String type){

        //处理活动逻辑
        DictionaryTypeEnum dictionaryTypeEnum = DictionaryTypeEnum.findEnumByCode(type);
        switch(dictionaryTypeEnum){
            case BASE_FILM_LABEL:
                List<BsFilmLabelDo> filmLabelist = bsFilmService.getFilmLabelList();
                Map<String, List<BsFilmLabelDo>> filmMap = filmLabelist.stream().collect(Collectors.groupingBy(BsFilmLabelDo::getLabelType));
                baseData.put(DictionaryDataEnum.FILM_FORM.getCode(), filmMap.get(DictionaryDataEnum.FILM_FORM.getCode()));
                baseData.put(DictionaryDataEnum.FILM_TYPE.getCode(), filmMap.get(DictionaryDataEnum.FILM_TYPE.getCode()));
                baseData.put(DictionaryDataEnum.FILM_PLACE.getCode(), filmMap.get(DictionaryDataEnum.FILM_PLACE.getCode()));
                break;
            case BASE_RESOURCE:
                List<BsResourceDo> resourceList = bsResourceService.getResourceList();
                baseData.put(DictionaryDataEnum.RESOURCE_LIST.getCode(), resourceList);
                break;
            case BASE_ARTICLE_MAJOR:
                List<BsArticleMajorDo> articleMajorList = bsArticleMajorService.getArticleMajorList();
                baseData.put(DictionaryDataEnum.ARTICLE_MAJOR.getCode(), articleMajorList);
                break;
            case BASE_ARTICLE_LABEL:
                List<BsArticleLabelDo> articleLabelList = bsArticleLabelService.getArticleLabelList();
                baseData.put(DictionaryDataEnum.ARTICLE_LABEL.getCode(), articleLabelList);
                break;
            case BASE_ARTICLE_PLACE:
                List<BsArticlePlaceDo> articlePlaceList = bsArticlePlaceService.getArticlePlaceList();
                baseData.put(DictionaryDataEnum.ARTICLE_PLACE.getCode(), articlePlaceList);
                break;
            default:
                break;
        }
    }

    //获取资源信息
    public BsResourceDo getResourceInfo(String type, String secType){
        List<BsResourceDo> resourceList = (List<BsResourceDo>)baseData.get(DictionaryDataEnum.RESOURCE_LIST.getCode());
        for(BsResourceDo bsResourceDo : resourceList){
            if(type.equals(bsResourceDo.getType()) && secType.equals(bsResourceDo.getSecType())){
                return bsResourceDo;
            }
        }
        return null;
    }

}
