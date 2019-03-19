package com.bigstudent.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsManagerUserRoleDao;
import com.bigstudent.service.BsManagerUserRoleService;



/**
 * 管理员角色表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:36:59
 */
 
@Service("bsManagerUserRoleService")
public class BsManagerUserRoleServiceImpl implements BsManagerUserRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsManagerUserRoleServiceImpl.class);
   
    @Resource
    private BsManagerUserRoleDao bsManagerUserRoleDao;
}