package com.honglekai.study.dpStrategy.templateMethod;

/**
 * description 模板方法模式
 * 一个抽象类中，有一个主方法，再定义1-n个方法，可以是抽象的方法，也可以说是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:45
 * modifyTime
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstratCalculater calculater = new Multiply();

        String exp = "8*8";
        int result = calculater.calculate(exp,"\\*");
        System.out.println("========结果为============"+result);
    }
}
