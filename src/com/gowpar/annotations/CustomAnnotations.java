package com.gowpar.annotations;


// Marker Annotation
// Single value Annotation
// Multiple value Annotation

@interface SmartPhone {
    String os() default "Android";
    int version() default 4;
}

@SmartPhone(os = "Android", version = 7)
class NokiaASeries {

}

@SmartPhone
class LGCookie {

}

public class CustomAnnotations {

    public static void main(String[] args) {

    }
}
