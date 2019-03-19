package com.bigstudent.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.exception.BigStudentException;
import com.bigstudent.common.web.context.JsonBaseController;
import com.bigstudent.domain.BsArticleMajorDo;
import com.bigstudent.domain.BsFilmLabelDo;
import com.bigstudent.query.FilmQuery;
import com.bigstudent.service.BsFilmService;
import com.bigstudent.service.impl.DictionaryData;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/1/21
 */
@RestController
@RequestMapping("/film")
public class FilmController extends JsonBaseController {

    @Autowired
    private BsFilmService bsFilmService;

    @Autowired
    private DictionaryData dictionaryData;

    @RequestMapping(value = "/addFilm", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addFilm (@RequestBody FilmQuery filmQuery){
        JSONObject map = new JSONObject();
        String filmName = filmQuery.getFilmName();

        map.put("managerInfo", null);
        return CommonResponse.getSuccessInfo(map);
    }

    @RequestMapping(value = "/addArticleMajor1" )
    public CommonResponse addArticleMajor1 ( BsArticleMajorDo bsArticleMajorDo){
        System.out.println("=================dsfsdfdsf===========");
        return null;
    }

    @RequestMapping(value = "/addFilmLabel", produces = {"application/json;charset=UTF-8"})
    public CommonResponse addFilmLabel (@RequestBody BsFilmLabelDo bsFilmLabelDo){
        JSONObject map = new JSONObject();

        if(StringUtils.isEmpty(bsFilmLabelDo.getLabelName()) || StringUtils.isEmpty(bsFilmLabelDo.getLabelType())){
            throw BigStudentException.paramException(null);
        }
        Date now = new Date();
        bsFilmLabelDo.setCreateTime(now);
        bsFilmLabelDo.setUpdateTime(now);
        bsFilmService.addFilmLabel(bsFilmLabelDo);

        return CommonResponse.getSuccessInfo(map);
    }

    @RequestMapping(value = "/getFilmLabelList", produces = {"application/json;charset=UTF-8"})
    public CommonResponse getFilmLabelList (@RequestBody BsFilmLabelDo bsFilmLabelDo){
        JSONObject map = new JSONObject();

        if( StringUtils.isEmpty(bsFilmLabelDo.getLabelType())){
            throw BigStudentException.paramException(null);
        }

        List<BsFilmLabelDo> list = (List<BsFilmLabelDo>)dictionaryData.baseData.get(bsFilmLabelDo.getLabelType());
        map.put("filmLabelList", list);
        return CommonResponse.getSuccessInfo(map);
    }

    @RequestMapping(value = "/updateFilmLabel", produces = {"application/json;charset=UTF-8"})
    public CommonResponse updateFilmLabel (@RequestBody BsFilmLabelDo bsFilmLabelDo){
        JSONObject map = new JSONObject();

        if( null ==  bsFilmLabelDo.getId()){
            throw BigStudentException.paramException(null);
        }

        bsFilmService.updateFilmLabel(bsFilmLabelDo);
        map.put("filmLabelInfo", bsFilmLabelDo);
        return CommonResponse.getSuccessInfo(map);
    }
}
