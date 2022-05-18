package org.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication //来标注一个主程序，说明这是一个springboot应用
public class HelloWorldApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
                System.setProperty("logHome","D:\\logs");



    }
}
