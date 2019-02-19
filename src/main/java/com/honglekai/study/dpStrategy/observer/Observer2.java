package com.honglekai.study.dpStrategy.observer;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 15:41
 * modifyTime
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("------observer2 has received-------");
    }
}
