package com.vn.devmaster.demo.interfaceorabstract;

public class Boy implements Person {
    @Override
    public void run() {
        System.out.println("Boy run");
    }

    @Override
    public void eat() {
        System.out.println("Boy eat");
    }

}
