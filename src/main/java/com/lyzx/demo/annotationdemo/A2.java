package com.lyzx.demo.annotationdemo;

/**
 * 如果一个注解内仅仅只有一个名字为 value 的属性时，应用这个注解时可以直接接属性值填写到括号内
 */
public @interface A2 {
    String value() default "a2";
}
