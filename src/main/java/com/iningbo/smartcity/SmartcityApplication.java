package com.iningbo.smartcity;

import com.iningbo.smartcity.core.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * iningbo智慧城市
 *
 * @author wx
 * @date 2019/01/15
 */
@SpringBootApplication
@MapperScan(value = "com.iningbo.smartcity.mapper", markerInterface = Mapper.class)
public class SmartcityApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SmartcityApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartcityApplication.class, args);
    }

}

