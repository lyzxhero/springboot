package com.lyzx.demo.annotationdemo;

import java.lang.annotation.*;

/**
 *
 * @Retention 保留期的意思  代表注解的保留周期
 * RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
 * RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
 * RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们
 *
 * @Target
 * Target 是目标的意思，@Target 指定了注解运用的地方。
 * 你可以这样理解，当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。
 *
 * 类比到标签，原本标签是你想张贴到哪个地方就到哪个地方，
 * 但是因为 @Target 的存在，它张贴的地方就非常具体了，比如只能张贴到方法上、类上、方法参数上等等。@Target 有下面的取值
 *      ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
 *      ElementType.CONSTRUCTOR     可以给构造方法进行注解
 *      ElementType.FIELD           可以给属性进行注解
 *      ElementType.LOCAL_          VARIABLE 可以给局部变量进行注解
 *      ElementType.METHOD          可以给方法进行注解
 *      ElementType.PACKAGE         可以给一个包进行注解
 *      ElementType.PARAMETER       可以给一个方法内的参数进行注解
 *      ElementType.TYPE            可以给一个类型进行注解，比如类、接口、枚举
 *
 * @Inherited
 *  Inherited 是继承的意思，但是它并不是说注解本身可以继承，而是说如果一个超类被 @Inherited 注解过的注解进行注解的话，
 *  那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解
 *  eg:如果有 注解A1和A2，如果A1被@Inherited标注过，A2没有
 *   有类Animal和Dog，其中Dog extends Animal，
 *   那么当对Animal标注A1时，在Dog类上也可以获取到超类的注解A1，如果对Animal上标注A2，则在Dog上获取不到A2注解
 *
 * @Repeatable(value=true)
 * ...
 *
 *注解的属性
 * 注解的属性也叫做成员变量。注解只有成员变量，没有方法。
 * 注解的成员变量在注解的定义中以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型
 * 需要注意的是，在注解中定义属性时它的类型必须是 8 种基本数据类型外加 类、接口、注解及它们的数组
 *
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
public @interface A1 {
    String f1() default "v1";
    int f2() default 1;
//    String v1 default "";
}