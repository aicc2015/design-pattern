package com.honglekai.design.structural.adapter;

/**
 * description 适配器
 * 定义：
 * 1.将一个类的接口转换成客户期望的另一个接口
 * 2.使原本接口不兼容的类可以一起工作
 *
 * 类型：结构型
 *
 * 适用场景：
 * 1.已经存在的类，它的方法和需求不匹配时(方法结果相同或相似)
 * 2.不是软件设计阶段考虑的设计模式，而是随着软件维护，由于不同产品、不同厂家造成功能类似而接口不相同情况下的解决方案
 *
 * 优点：
 * 1.能提高类的透明性和复用，现有的类复用但不需要改变
 * 2.目标类与适配器解耦，提高程序扩展性
 * 3.符合开闭原则
 *
 * 缺点：
 * 1.适配器编写过程需要全面考虑， 可能会增加系统的复杂性
 * 2.增加系统代码可读的难度
 *
 * 扩展：
 * 类适配器、对象适配器、接口适配器
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 10:11
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter();
        dc5V.outputDC5V();
    }


}
