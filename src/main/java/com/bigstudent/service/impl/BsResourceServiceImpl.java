package com.bigstudent.service.impl;

import com.bigstudent.common.enums.DictionaryDataEnum;
import com.bigstudent.domain.BsResourceDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsResourceDao;
import com.bigstudent.service.BsResourceService;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * 资源表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2019-01-23 11:31:50
 */
 
@Service("bsResourceService")
public class BsResourceServiceImpl implements BsResourceService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsResourceServiceImpl.class);
   
    @Autowired
    private BsResourceDao bsResourceDao;

    @Autowired
    private DictionaryData dictionaryData;

    @Override
    public List<BsResourceDo> getResourceList() {
        return bsResourceDao.getResourceList();
    }

    @Override
    public BsResourceDo getResourceInfo(String type) {
        BsResourceDo resourceInfo = null;
        List<BsResourceDo> resourceList = (List<BsResourceDo>) dictionaryData.baseData.get(DictionaryDataEnum.RESOURCE_LIST);
        if(!CollectionUtils.isEmpty(resourceList)){
            resourceInfo = resourceList.stream().filter(item -> type.equals(item.getType())).findFirst().orElse(null);
        }

        return resourceInfo;
    }

    @Override
    public BsResourceDo getResourceInfo(String type, String secType) {
        BsResourceDo resourceInfo = null;
        List<BsResourceDo> resourceList = (List<BsResourceDo>) dictionaryData.baseData.get(DictionaryDataEnum.RESOURCE_LIST);
        if(!CollectionUtils.isEmpty(resourceList)){
            resourceInfo = resourceList.stream().filter(item -> type.equals(item.getType()) && secType.equals(item.getSecType()) ).findFirst().orElse(null);
        }

        return resourceInfo;
    }
}