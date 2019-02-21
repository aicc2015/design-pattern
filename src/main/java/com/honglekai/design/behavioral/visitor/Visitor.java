package com.honglekai.design.behavioral.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 16:36
 * modifyTime
 */
public class Visitor  implements IVisitor{
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程："+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("收费课程："+codingCourse.getName()+" 课程价格"+codingCourse.getPrice());
    }
}
