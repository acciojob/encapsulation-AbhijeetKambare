package com.driver;

public class Main {
    public static void main(String[] args) {
        String name="sai";
        RWOnly rw=new RWOnly(name);
//        int a=10;
//        rw.variable=a;
//        //'variable' has private access in 'com.driver.RWOnly'
        System.out.println(rw.setName(name));
    }

}