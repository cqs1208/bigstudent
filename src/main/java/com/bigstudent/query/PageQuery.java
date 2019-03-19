package com.bigstudent.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc: 分页,
 * PageInterceptor只有在pageNum和pageSize都不为空的情况下才会分页，为了防止开发人员分页出错，只要两个参数有一个为空，则默认查询第一页的15条数据
 * @author:  weiqingeng
 * @date:  2018/10/23 13:43
 */
@Data
public class PageQuery implements Serializable {

    private Integer pageNum;
    private Integer pageSize;

    public void setPageNum(Integer pageNum) {
        if (null == pageNum || pageNum < 1) {
            this.pageNum = 1;
        } else {
            this.pageNum = pageNum;
        }
    }

    public void setPageSize(Integer pageSize) {
        if (null == pageSize || pageSize < 1) {
            this.pageSize = 15;
        } else {
            if(pageSize > 1000){
                this.pageSize = 1000;
            }else{
                this.pageSize = pageSize;
            }
        }
    }

    public PageQuery(){
        if (null == pageSize || pageSize < 1 ||  null == pageNum || pageNum < 1) {
            this.pageNum = 1;
            this.pageSize = 15;
        } else {
            if(pageSize > 1000){
                this.pageSize = 1000;
            }
        }
    }
}
