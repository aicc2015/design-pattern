package com.honglekai.design.behavioral.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 16:19
 * modifyTime
 */
public interface IVisitor {

  void visit(FreeCourse freeCourse);

  void visit(CodingCourse codingCourse);

}
