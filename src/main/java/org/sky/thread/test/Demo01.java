package org.sky.thread.test;

import org.testng.annotations.Test;

public class Demo01 {
    @Test
    public void test1(){
        for (int i = 0; i < 20; i++) {
            MutipleThread1 mutipleThread1 = new MutipleThread1();
            System.out.println("线程id："+mutipleThread1.getId());
            System.out.println("线程名："+mutipleThread1.getName());
            mutipleThread1.start();

        }
    }

    @Test
    public void test2(){
        for (int i = 0; i < 20; i++) {
            TestRunnable testRunnable = new TestRunnable();
            testRunnable.toString();
            testRunnable.run();
        }
    }
}
