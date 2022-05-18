package org.sky.thread.test.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTest {

    @Async
    public String asyncHello() throws InterruptedException {
        System.out.println("程序开始处理");
        Thread.sleep(5000);
        return "success";
    }

}
