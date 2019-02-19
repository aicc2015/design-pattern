package com.honglekai.study.dpStrategy.observer;

/**
 * description 观察者模式
 * 当一个对象发生变化是，依赖它的对象也会收到通知，发生相应的变化
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 15:03
 * modifyTime
 */
public class ObserverTest {

    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        Subject subject = new MySubject();
        subject.add(observer1);
        subject.add(observer2);

        subject.operation();
    }

}
