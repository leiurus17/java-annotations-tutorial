package com.gowpar.annotations;

class A {

    public void show() {
        System.out.println("Show in Class A.");
    }
}

class B extends A {

    public void show() {
        System.out.println("Show in Class B.");
    }

}

public class AnnotationsDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.show();
        b.show();
    }
}
