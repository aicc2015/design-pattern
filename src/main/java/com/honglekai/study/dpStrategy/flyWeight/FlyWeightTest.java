package com.honglekai.study.dpStrategy.flyWeight;


/**
 * description 享元模式
 * 核心：享元工厂类，提供存储享元对象的享元池，
 * 如果用户需要对象时，从享元池中获取，如果没有享元池中不存在，则会创建一个享元对象返回给用户，被在享元池中新增该对象
 * 1.优点：能够极大的减少系统中对象的个数
 *        享元模式使用了外部状态，外部状态相对独立，不会影响到内部状态，所以享元模式使得享元对象在不同环境下被共享
 * 2.缺点：享元模式需要区分内部状态和外部状态，使得应用程序在某种程度上来说更加复杂了；
 *        为了使享元对象能够共享，需要将享元对象的状态外部化，而读取外部状态使得运行时间变长了
 * 3.使用场景： 一个系统中存在大量相同或相似的对象，由于这类对象的大量使用，会造成系统内存的耗费，可以使用享元对象来减少系统中对象的数量
 *            系统的大部分状态都可以外部化，可以将这些外部状态传入对象中
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 9:22
 * modifyTime
 */
public class FlyWeightTest {

    public static void main(String[] args) {
        Shape shape1 = FlyWeightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyWeightFactory.getShape("蓝色");
        shape2.draw();

        Shape shape3 = FlyWeightFactory.getShape("绿色");
        shape3.draw();


        Shape shape4 = FlyWeightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyWeightFactory.getShape("蓝色");
        shape5.draw();

        Shape shape6 = FlyWeightFactory.getShape("绿色");
        shape6.draw();

        System.out.println("一个画了"+FlyWeightFactory.getNum()+"种颜色");

    }
}
