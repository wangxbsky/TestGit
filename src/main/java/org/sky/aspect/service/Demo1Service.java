package org.sky.aspect.service;


import org.springframework.stereotype.Service;

@Service
public class Demo1Service {
    public String user(){
        System.out.println("user被执行了");
        return "user被执行了";
    }
}
