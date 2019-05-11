package com.huatec.teaching;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 项目启动类
 *
 * @author 贾波
 */
//@SpringBootApplication声明让spring boot自动给程序进行必要的配置
@SpringBootApplication
//扫描dao
@MapperScan("com.huatec.teaching.dao")
public class SpringBootStartApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartApplication.class, args);
        System.out.println(" ______                    _   ______  \n" +
                "|_   _ \\                 |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\\n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }

}
