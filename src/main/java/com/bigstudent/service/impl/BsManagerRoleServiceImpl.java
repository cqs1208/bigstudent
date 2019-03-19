package com.bigstudent.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsManagerRoleDao;
import com.bigstudent.service.BsManagerRoleService;



/**
 * 角色表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:35:17
 */
 
@Service("bsManagerRoleService")
public class BsManagerRoleServiceImpl implements BsManagerRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsManagerRoleServiceImpl.class);
   
    @Resource
    private BsManagerRoleDao bsManagerRoleDao;
}