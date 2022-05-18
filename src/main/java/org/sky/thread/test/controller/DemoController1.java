package org.sky.thread.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sky.thread.test.service.AsyncTest;

@RestController
public class DemoController1 {

    @Autowired
    AsyncTest asyncTest;

    @RequestMapping("/asynctest")
    public String test1() throws InterruptedException {
        String s = asyncTest.asyncHello();
        return "success";
    }
}
