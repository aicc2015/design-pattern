package com.honglekai.design.structural.decorator.v2;

import com.honglekai.design.creational.prototype.abstractprototype.B;

/**
 * description 装饰者模式
 *
 * 定义：在不改变原有对象的基础之上，将功能附加到对象上
 * 提供了比继承更有弹性的替代方案(扩展原有对象的功能)
 *
 * 类型：结构型
 *
 * 适用场景：
 * 1.扩展一个类的功能或给一个类添加附加职责
 * 2.动态给一个对象添加功能，这些功能可以动态的撤销
 *
 * 优点：
 * 1.继承的有力补充，比继承更灵活，在不改变一个对象的前提下给一个对象扩展功能
 * 2.通过使用不同装饰类或这些装饰类的排列组合，可以实现不同效果
 * 3.符合开闭原则
 *
 * 缺点：
 * 1.会出现更多的代码，更多的类，增加程序复杂性
 * 2.动态装饰时，多层装饰时会更复杂
 *
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:34
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {

        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();

        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);

        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc()+" 销售价格"+aBatterCake.cost());
    }
}
