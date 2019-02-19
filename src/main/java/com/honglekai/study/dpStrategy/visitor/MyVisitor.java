package com.honglekai.study.dpStrategy.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 9:49
 * modifyTime
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println(" visit the subject "+subject.getSubject());
    }
}
