package com.honglekai.principle.openclose;

/**
 * description 开闭原则
 * 定义：对扩展开发，对修改关闭
 * 优点：提高系统的可用性和可扩展性
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 15:30
 * modifyTime
 */
public class Test {
    public static void main(String[] args) {
        ICource iCource = new JavaDiscountCourse("java设计模式",10, 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCource;
        System.out.println("课程名称"+iCource.getName()+" 课程id"+iCource.getId()+" 课程原价"+javaDiscountCourse.getOriginPrice()+" 课程打折价格"+javaDiscountCourse.getDiscountPrice());
    }
}
