package org.sky.aspect.controller;

import org.sky.aspect.service.Demo1Service;
import org.sky.aspect.service.MyAfterLogAspect;
import org.sky.aspect.service.MyBeforeLogAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aspectLearn")
public class Demo1Controller {

    @Autowired
    Demo1Service demo1Service;

    @MyBeforeLogAspect
    @MyAfterLogAspect
    @RequestMapping("test1")
    public String test1(){
        demo1Service.user();
        return "success";
    }

    @RequestMapping("test2")
    public String test2(){
        demo1Service.user();
        return "success";
    }

}
