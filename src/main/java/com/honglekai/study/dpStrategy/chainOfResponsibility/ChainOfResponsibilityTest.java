package com.honglekai.study.dpStrategy.chainOfResponsibility;

/**
 * description 责任链模式
 * 有多个对象，每个对象都持有下一个对象的引用，这样就会形成一条链，请求在一条链上传递，
 * 直到某一对象决定处理该请求，但是发出者并不清楚最终哪个对象会处理请求，责任链模式可以处理，在隐瞒客户的情况下，对系统进行动态的调整
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:42
 * modifyTime
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        MyHandle handle1 = new MyHandle("h1");
        MyHandle handle2 = new MyHandle("h2");
        MyHandle handle3 = new MyHandle("h3");

        handle1.setHandle(handle2);
        handle2.setHandle(handle3);

        handle1.operator();
    }
}
