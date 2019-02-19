package com.honglekai.design.behavioral.templatemethod;

/**
 * description 模板方法模式
 * 定义：
 * 1.定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 * 2.模板方法使得子类在不改变算法结构的情况下，重新定义算法的某些步骤
 *
 * 类型：行为型
 *
 * 适用场景：
 * 1.一次性实现一个算法不变的部分，并将可变部分留给子类实现
 * 2.各子类公共的行为被提取出来并集中到一个公共类，从而避免代码重复
 *
 * 优点：
 * 1.提高复用性
 * 2.提高扩展性
 * 3.符合开闭原则
 *
 * 缺点：
 * 1.类数目增加
 * 2.增加了系统实现的复杂度
 * 3.继承关系自身缺点，如果父类添加一个新的抽象方法，所有子类都要改一遍
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 15:43
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("制作设计模式课程begin------");
        ACourse designCourse = new DesignCourse();
        designCourse.makeCourse();
        System.out.println("制作设计模式课程end------");


        System.out.println("制作前端课程begin------");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("制作前端课程end------");
    }
}
