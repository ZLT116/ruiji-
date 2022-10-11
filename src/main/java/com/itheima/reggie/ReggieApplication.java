package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zlt
 * @date 2022/10/4 - 19:10
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan // 加了这个注解才会去扫描filter注解
@EnableTransactionManagement // 加了这个开启事务的自动注解
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("项目启动成功...");
    }
}

