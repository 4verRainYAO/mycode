package com.feng.demo.lock8;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p1 = new Phone();

        new Thread(()->{
            p.sendSms();
        },"aa").start();

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        new Thread(()->{
            p1.call();
        },"bb").start();
    }
}
class Phone{
    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sendSms");
    }
    public synchronized void call(){
        System.out.println("call");
    }
    public void hello(){
        System.out.println("hello");
    }
}