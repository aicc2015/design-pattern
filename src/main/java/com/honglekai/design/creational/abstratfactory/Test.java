package com.honglekai.design.creational.abstratfactory;

/**
 * description 抽象工厂模式
 * 定义：
 * 1.提供创建一系列或相互依赖对象的接口，无需指定他们具体的类
 * 类型：创建型
 * 适用场景：
 * 1.客户端不依赖产品实例如何创建、实现等细节
 * 2.强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
 * 3.提供一个产品类的库，所有产品以同样的接口出现，从而使客户端不依赖具体的实现
 * 优点：
 * 1.具体产品在应用层代码隔离，无须关心创建细节
 * 2.将一系列产品族统一到一起创建
 * 缺点：
 * 1.规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 2.增加系统的抽象性和理解难度
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 11:24
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.procedure();
        article.procedure();
    }
}
