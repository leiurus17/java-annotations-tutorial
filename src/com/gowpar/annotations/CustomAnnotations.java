package com.gowpar.annotations;

import java.lang.annotation.*;

// Marker Annotation
// Single value Annotation
// Multiple value Annotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os() default "Android";

    int version() default 4;
}

@SmartPhone(os = "Android", version = 7)
class NokiaASeries {
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

@SmartPhone
class LGCookie {

}

public class CustomAnnotations {

    public static void main(String[] args) {
        NokiaASeries nokia = new NokiaASeries("Fire", 5);
        System.out.println(nokia.model);

        Class c = nokia.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);

        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os());
        System.out.println(s.version());
    }
}
