package com.honglekai.principle.liskovsubstitution;

/**
 * description 里氏替换原则
 * 定义：
 * 1.如果对每个类型为T1的对象O1,都有类型为T2的对象O2，使得以T1定义的所有程序P在所有的对象O1都替换为O2，
 * 程序P的行为没有发生变化，那么类型T2是T1类型的子类型
 *
 * 定义扩展：
 * 一个软件实体如果适用一个父类的话，那么一定适用于其子类，
 * 所有引用父类的地方必须能透明的使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变
 *
 * 引申意义：子类可以扩展父类的功能，但不能改变父类原有的功能
 * 含义：
 * 1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * 2：子类中可以增加自己特有的方法
 * 3：当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类的输入参考更宽松
 * 4：当子类的方法实现父类方法时(重载、重写、实现抽象方法)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 14:44
 * modifyTime
 */
public class Test {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("宽:"+rectangle.getWidth()+" 长:"+rectangle.getLength());
        }
        System.out.println("宽:"+rectangle.getWidth()+" 长:"+rectangle.getLength());
    }

    /*public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(10);
        rectangle.setLength(20);

        resize(rectangle);
    }*/
}
