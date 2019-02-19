package com.honglekai.study.dpStrategy.observer;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 15:59
 * modifyTime
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("myself update.....");
        notifyObservers();
    }
}
