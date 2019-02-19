package com.lyzx.demo.annotationdemo;

public class MainTest {

    public static void main(String[] args){
        Class<Model2> clazz = Model2.class;
        boolean containsA1 = clazz.isAnnotationPresent(A1.class);
        if(containsA1){
            A1 a1 = clazz.getAnnotation(A1.class);
            System.out.println(a1.f1());
            System.out.println(a1.f2());
        }

//        Annotation[] anns = clazz.getAnnotations();
//        for(Annotation item : anns){
//
//            System.out.println(item.toString());
//        }
    }
}