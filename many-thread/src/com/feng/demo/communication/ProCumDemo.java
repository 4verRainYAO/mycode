package com.feng.demo.communication;

public class ProCumDemo {

}
class Target{
    private int number = 0;
    public void increase(){
        if(number==0){
            number++;

        }
        System.out.println(number);
    }
    public void decrease(){
        if(number==1){
            number--;
        }
        System.out.println(number);
    }
}
