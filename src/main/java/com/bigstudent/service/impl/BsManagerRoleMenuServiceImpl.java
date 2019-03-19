package com.bigstudent.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsManagerRoleMenuDao;
import com.bigstudent.service.BsManagerRoleMenuService;



/**
 * 角色菜单表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:36:29
 */
 
@Service("bsManagerRoleMenuService")
public class BsManagerRoleMenuServiceImpl implements BsManagerRoleMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsManagerRoleMenuServiceImpl.class);
   
    @Resource
    private BsManagerRoleMenuDao bsManagerRoleMenuDao;
}