package com.miaoshaproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@MapperScan("com.miaoshaproject.dao")
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
