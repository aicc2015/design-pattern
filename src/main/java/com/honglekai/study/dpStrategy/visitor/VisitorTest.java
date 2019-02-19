package com.honglekai.study.dpStrategy.visitor;

/**
 * description 访问者模式
 * 访问者模式把数据结构和作用于结构上的操作解耦，使操作集合可相对自由的演化。
 * 适用于数据结构相对稳定算法又易变的系统。因为访问者模式使得算法操作变得更加容易，若系统数据结构易于变化，经常有新的数据对象添加进来，则不适用于访问者模式。
 * 优点：增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中到一个访问对象中，其改变不影响系统的数据结构
 * 缺点：增加新的数据结构困难
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 9:50
 * modifyTime
 */
public class VisitorTest {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
