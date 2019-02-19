package com.honglekai.study.dpStrategy.facade;


/**
 * description 外观模式 facade
 * 1.类与类之间的关系放在facade类中，实现了解耦
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 16:30
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
