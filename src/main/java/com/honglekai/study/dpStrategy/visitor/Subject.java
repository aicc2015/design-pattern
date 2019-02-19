package com.honglekai.study.dpStrategy.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 9:46
 * modifyTime
 */
public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
