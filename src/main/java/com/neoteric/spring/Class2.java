package com.neoteric.spring;

public class Class2 {
//public void sayHello(){
//    for(int i=0;i<5;i++) {
//        Class1 obj = new Class1();
//        obj.sayHi();
//    }
//}
    private Class1 class1;

    // Constructor-based injection (recommended)
    public Class2(Class1 class1) {
        this.class1 = class1;
    }

    public void sayHello() {
        for (int i = 0; i < 5; i++) {
            class1.sayHi();
        }
    }
}