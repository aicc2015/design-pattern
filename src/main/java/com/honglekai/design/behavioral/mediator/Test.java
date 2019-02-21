package com.honglekai.design.behavioral.mediator;

/**
 * description 中介者模式
 * 1.定义一组封装一组对象如何交互的对象
 * 2.通过使对象明确地相互作用来促进松散耦合，并允许独立地改变他们的交互
 *
 * 类型：行为型
 *
 * 适用场景：
 * 1.系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
 * 2.交互的公共行为，如果需要改变行为则可以增加新的中介者类
 *
 * 优点：
 * 1.将一对多转成1对1，降低系统程序复杂度
 * 2.类之间解耦
 *
 * 缺点：
 * 1.中介者过多，导致系统复杂
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:46
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        User user1 =  new User("tom");
        User user2 = new User("jim");

        user1.sendMessage("hello jim ,let's learn design pattern");
        user2.sendMessage("OK tom");
    }
}
