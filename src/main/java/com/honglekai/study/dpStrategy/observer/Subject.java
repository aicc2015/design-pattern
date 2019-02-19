package com.honglekai.study.dpStrategy.observer;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 15:51
 * modifyTime
 */
public interface Subject {

    /**
     * 增加观察者
     * @param observer
     */
    void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 自身的操作
     */
    void operation();
}
