package com.honglekai.study.dpStrategy.mediator;

import com.honglekai.study.dpStrategy.chainOfResponsibility.MyHandle;

/**
 * description 中介者模式
 * 中介者模式用来降低类与类直接的耦合，如果类与类之间有依赖的话，不利于功能的拓展和维护，因为要修改一个对象，
 * 其他的管理对象都得进行修改，如果使用中介者模式，只需要关心和Mediator类之间的关系，具体类与类之间的关系及调度交给Mediator类既可，这有点像spring容器的的作用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 10:36
 * modifyTime
 */
public class MediatorTest {

    public static void main(String[] args) {
        MyMediator myMediator = new MyMediator();
        myMediator.createMediator();
        myMediator.workAll();
    }
}
