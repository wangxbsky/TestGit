package org.sky.aspect.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    Logger logger = LoggerFactory.getLogger(LogAdvice.class);

    @Pointcut("@annotation(org.sky.aspect.service.MyBeforeLogAspect)")
    public void beforeLogAdvicePointcut(){}

    @Pointcut("@annotation(org.sky.aspect.service.MyAfterLogAspect)")
    public void afterLogAdvicePointcut(){}

    @Before("beforeLogAdvicePointcut()")
    public void beforeAdv(){
        logger.info("前置切面执行了");

    }

    @After("afterLogAdvicePointcut()")
    public void afterAdv(){
        logger.info("后置切面被执行了");
    }
}
