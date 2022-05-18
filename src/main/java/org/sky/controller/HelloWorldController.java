package org.sky.controller;

import org.sky.SomeObject.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

@Controller
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @Autowired
    Person person;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println(System.getProperty("logHome"));
        logger.error("error日志");
        logger.warn("warn日志");
        logger.info("info日志");
        logger.debug("debug日志");
        return "hello" + person;
    }
}
