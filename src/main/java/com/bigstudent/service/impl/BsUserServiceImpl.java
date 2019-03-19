package com.bigstudent.service.impl;

import com.bigstudent.dao.BsUserDao;
import com.bigstudent.domain.BsUserDo;
import com.bigstudent.service.BsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 用户表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-05 12:02:04
 */
 
@Service("bsUserService")
public class BsUserServiceImpl implements BsUserService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsUserServiceImpl.class);
   
    @Resource
    private BsUserDao bsUserDao;

    @Override
    public BsUserDo getUserInfo(BsUserDo bsUserDo) {
        return bsUserDao.getUserInfo(bsUserDo);
    }

    @Override
    public BsUserDo getUserByUserName(String userName) {
        return bsUserDao.getUserByUserName(userName);
    }

    @Override
    public int updateUserInfo(BsUserDo bsUserDo) {
        return bsUserDao.updateByUserId(bsUserDo);
    }

    @Override
    public Long addUserInfo(BsUserDo bsUserDo) {
        return bsUserDao.addUserInfo(bsUserDo);
    }
}