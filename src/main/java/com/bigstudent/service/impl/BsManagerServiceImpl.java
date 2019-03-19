package com.bigstudent.service.impl;

import javax.annotation.Resource;

import com.bigstudent.common.CommonCode;
import com.bigstudent.common.exception.BigStudentException;
import com.bigstudent.domain.BsManagerDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bigstudent.dao.BsManagerDao;
import com.bigstudent.service.BsManagerService;



/**
 * 管理员表ServiceImpl
 * 
 * @author chenqingsong
 * @version 1.0.0 初始化
 * @date 2018-11-14 09:23:11
 */
 
@Service("bsManagerService")
public class BsManagerServiceImpl implements BsManagerService {
	
    private static final Logger logger = LoggerFactory.getLogger(BsManagerServiceImpl.class);
   
    @Resource
    private BsManagerDao bsManagerDao;

    @Override
    public BsManagerDo getManagerInfo(String managerName, String managerPassword) {
        return bsManagerDao.getManagerInfo( managerName,  managerPassword);
    }

    @Override
    public Integer addManager(BsManagerDo bsManagerDo) {

        //获取创建者信息
        BsManagerDo bsManagerInfo = bsManagerDao.getById(bsManagerDo.getCreatorId());
        if(null != bsManagerInfo){
            //判断管理员名称是否存在
            BsManagerDo bsManagerInfo2 = bsManagerDao.getManagerInfo( bsManagerDo.getManagerName(),  null);
            if(null != bsManagerInfo2){
                throw new BigStudentException(CommonCode.ALREADY_EXIST.getCode(),
                        CommonCode.ALREADY_EXIST.getMsg(), null);
            }
            return bsManagerDao.addManager( bsManagerDo);
        }

        throw new BigStudentException(CommonCode.NOT_LOGIN.getCode(),
                CommonCode.NOT_LOGIN.getMsg(), null);
    }

    @Override
    public boolean updateManager(BsManagerDo bsManagerDo) {
        //获取管理员信息
        BsManagerDo bsManagerInfo = bsManagerDao.getById(bsManagerDo.getId());
        if(null == bsManagerInfo){
            throw new BigStudentException(CommonCode.NOT_LOGIN.getCode(),
                    CommonCode.NOT_LOGIN.getMsg(), null);
        }
        return bsManagerDao.updateManager(bsManagerDo) >= 1 ? true : false;
    }

    @Override
    public boolean delManager(BsManagerDo bsManagerDo) {
        return false;
    }

}