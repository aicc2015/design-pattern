package com.honglekai.principle.singleresponsibility;

/**
 * description 单一职责原则
 * 定义：不要存在多于一个导致类变更的原因
 * 1个类/接口/方法只负责一个职责
 * 优点：降低类的复杂度、提供类的可读性、提供系统的可维护性
 * 降低变更引起的风险
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:25
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        /*Bird bird = new Bird();
        bird.fly("大雁");
        bird.fly("鸵鸟");*/
        FlyBird bird = new FlyBird();
        bird.fly("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.fly("鸵鸟");
    }
}
