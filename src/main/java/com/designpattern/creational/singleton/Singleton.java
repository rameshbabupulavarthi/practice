package com.designpattern.creational.singleton;

/**
 * Created by Sunil Golla on 5/1/2019.
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton (){}

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }


    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String  [] args){
     Singleton.getInstance();
    }

}
