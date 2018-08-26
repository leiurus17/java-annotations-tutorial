package com.gowpar.annotations;

import java.util.ArrayList;

@FunctionalInterface
interface C {
    void show();
}

class A {

    public void show() {
        System.out.println("Show in Class A.");
    }
}

class B extends A {

    @Override
    @SuppressWarnings("unchecked")
    public void show() {

        ArrayList<Integer> obj = new ArrayList<>();
        System.out.println("Show in Class B.");
    }

    @Deprecated
    public void run() {
        System.out.println("Run in Class B.");
    }

}

public class AnnotationsDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.show();
        b.show();
        b.run();
    }
}
