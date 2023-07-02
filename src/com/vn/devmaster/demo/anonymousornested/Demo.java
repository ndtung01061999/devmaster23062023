package com.vn.devmaster.demo.anonymousornested;

// Lớp nặc danh

//Local class
//Local inner class
//interface

abstract class Demo1 {
    abstract void message();
}

interface Demo3 {
    void message();
}

public class Demo {

    void display() {
        class Demo2 {
            void message() {
                System.out.println("local inner class");
            }
        }
        Demo2 demo2 = new Demo2();
        demo2.message();
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1() {
            void message() {
                System.out.println("Local class");
            }
        };
        demo1.message();

        Demo demo = new Demo();
        demo.display();

        Demo3 demo3 = new Demo3() {
            @Override
            public void message() {
                System.out.println("interface");
            }
        };
        demo3.message();
    }
}
