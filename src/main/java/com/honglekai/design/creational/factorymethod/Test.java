package com.honglekai.design.creational.factorymethod;

/**
 * description 工厂方法模式
 * 定义：定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 * 类型：属于创建型
 * 使用场景：
 * 1.创建对象需要大量的重复代码，
 * 2.客户端(应用层)不依赖产品实例如何被创建、实现等细节
 * 3.一个类通过其子类来制定创建哪个对象
 * 优点：
 * 1.用户只需关心产品对应的工厂，无法关心创建细节
 * 2.加入新的产品符合开闭原则，提供可扩展性
 * 缺点：
 * 1.类的个数过多，增加复杂度
 * 2.增加了系统的抽象性和理解难度
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 18:07
 * modifyTime
 */
public class Test {


    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
