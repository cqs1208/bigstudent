package com.bigstudent.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsManagerMenuDao;
import com.bigstudent.service.BsManagerMenuService;



/**
 * 菜单表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:36:01
 */
 
@Service("bsManagerMenuService")
public class BsManagerMenuServiceImpl implements BsManagerMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsManagerMenuServiceImpl.class);
   
    @Resource
    private BsManagerMenuDao bsManagerMenuDao;
}