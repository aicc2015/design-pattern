package com.honglekai.design.creational.simplefactory;

/**
 * description 简单工厂模式
 * 定义：由一个工厂对象决定创建哪一种产品类的实例
 * 类型：属于创建型，不属于GOF 23种设计模式
 * 使用场景：
 * 1.工厂类负责创建的对象比较少
 * 2.客户端(应用层)只负责传入工厂类的参数，对于如何创建对象不关心
 * 优点：只需要传入一个参数就可以获取你需要的对象，无需知道创建细节
 * 缺点：工厂类的职责相对过重，如果增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 18:07
 * modifyTime
 */
public class Test {

   /* public static void main(String[] args) {
        Video video = new JavaVideo();
        video.produce();
    }*/

    /*public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();
    }*/

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }

}
