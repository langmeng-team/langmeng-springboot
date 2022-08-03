package com.langmeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author langmeng
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LangMengApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(LangMengApplication.class, args);
        System.out.println("==========系统启动成功==========...\n");
    }
}