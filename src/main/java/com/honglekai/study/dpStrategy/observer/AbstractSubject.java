package com.honglekai.study.dpStrategy.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 15:56
 * modifyTime
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enume = vector.elements();
        while (enume.hasMoreElements()){
            enume.nextElement().update();
        }
    }

}
