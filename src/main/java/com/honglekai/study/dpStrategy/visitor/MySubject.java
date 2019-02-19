package com.honglekai.study.dpStrategy.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 9:47
 * modifyTime
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "hello ";
    }
}
