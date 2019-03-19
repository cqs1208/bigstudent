package com.bigstudent.service.impl;

import javax.annotation.Resource;

import com.bigstudent.dao.BsFilmLabelDao;
import com.bigstudent.domain.BsFilmDo;
import com.bigstudent.domain.BsFilmLabelDo;
import com.bigstudent.query.FilmQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsFilmDao;
import com.bigstudent.service.BsFilmService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 电影表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-21 19:27:02
 */
 
@Service("bsFilmService")
public class BsFilmServiceImpl implements BsFilmService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsFilmServiceImpl.class);
   
    @Resource
    private BsFilmDao bsFilmDao;

    @Resource
    private BsFilmLabelDao bsFilmLabelDao;

    @Override
    public void addFilmLabel(BsFilmLabelDo bsFilmLabelDo) {
        bsFilmLabelDao.addFilmLabel(bsFilmLabelDo);
    }

    @Override
    public List<BsFilmLabelDo> getFilmLabelList() {
        return bsFilmLabelDao.getFilmLabelList();
    }

    @Override
    public boolean updateFilmLabel(BsFilmLabelDo bsFilmLabelDo) {
        return bsFilmLabelDao.updateFilmLabel(bsFilmLabelDo) > 0 ? true : false;
    }


}