package com.bigstudent.service.impl;

import javax.annotation.Resource;

import com.bigstudent.domain.BsArticleMajorDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsArticleMajorDao;
import com.bigstudent.service.BsArticleMajorService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 文章大学专业表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 13:43:21
 */
 
@Service("bsArticleMajorService")
public class BsArticleMajorServiceImpl implements BsArticleMajorService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsArticleMajorServiceImpl.class);
   
    @Resource
    private BsArticleMajorDao bsArticleMajorDao;

    @Override
    public boolean addArticleMajor(BsArticleMajorDo bsArticleMajorDo) {
        return bsArticleMajorDao.addArticleMajor(bsArticleMajorDo) > 0 ? true : false;
    }

    @Override
    public List<BsArticleMajorDo> getArticleMajorList() {
        return bsArticleMajorDao.getArticleMajorList();
    }

    @Override
    public boolean updateArticleMajor(BsArticleMajorDo bsArticleMajorDo) {
        return bsArticleMajorDao.updateArticleMajor( bsArticleMajorDo) > 0 ? true : false ;
    }

    @Override
    public List<BsArticleMajorDo> merge(List<BsArticleMajorDo> list, List<BsArticleMajorDo> list2) {
        if(!CollectionUtils.isEmpty(list) && !CollectionUtils.isEmpty(list2)){
            for(BsArticleMajorDo bsArticleMajor : list){
                String idStr = bsArticleMajor.getId().toString();
                List<BsArticleMajorDo> tempList = new ArrayList<>();
                for(BsArticleMajorDo bsArticleMajorDo : list2){
                    if(idStr.equals(bsArticleMajorDo.getMajorParentId().toString())){
                        tempList.add(bsArticleMajorDo);
                    }
                }
                bsArticleMajor.setArticleMajorList(tempList);
            }
        }
        return list;
    }
}