package com.feng.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 如何调用callable接口
 */
public  class CallDemo {
    public static void main(String[] args) throws Exception {
        FutureTask futureTask = new FutureTask(new Mythread());
        new Thread(futureTask,"aa").start();
        System.out.println((String)futureTask.get());
    }
}


class Mythread implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("callable线程");

        return "sahjdisjo";
    }
}