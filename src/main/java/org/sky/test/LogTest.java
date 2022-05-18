package org.sky.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;

public class LogTest {

    Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            logger.error("error日志");
            logger.warn("warn日志");
            logger.info("info日志");
            logger.debug("debug日志");
            System.out.println("------------------------------------");
            Thread.sleep(2000);
        }
    }

    @Test
    public void test2(){
        System.out.println("===============这些是环境变量========================");

        Map<String, String> getenv = System.getenv();
        for (Map.Entry<String, String> entry : getenv.entrySet()) {
            System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());
        }
        System.out.println("===============这些是系统变量========================");
//        System.setProperty("logHome","D:\\logs");
        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());
        }

    }
}
