package com.driver;

public class Main {
    public static void main(String[] args) {
        String name="sai";
        RWOnly rw=new RWOnly();
//        int a=10;
//        rw.variable=a;
//        //'variable' has private access in 'com.driver.RWOnly'
        rw.setName(name);
        rw.getName();
    }

}