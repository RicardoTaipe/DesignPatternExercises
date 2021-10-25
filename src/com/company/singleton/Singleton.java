package com.company.singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(uniqueInstance == null){
            synchronized (Singleton.class) {
                if(uniqueInstance == null){
                    return new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}