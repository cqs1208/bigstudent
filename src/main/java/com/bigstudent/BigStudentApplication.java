package com.bigstudent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/10/29
 */
@SpringBootApplication
@MapperScan("com.bigstudent.dao")
public class BigStudentApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BigStudentApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BigStudentApplication.class);
    }
}
