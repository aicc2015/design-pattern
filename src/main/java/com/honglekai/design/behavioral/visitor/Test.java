package com.honglekai.design.behavioral.visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * description 访问者模式
 * 定义
 * 1.封装作用于某数据结构(list/set/map等)中的各元素的操作
 * 2.可以在不改变各元素的的类的前提下，定义作用于这些元素的操作
 *
 *
 * 类型：行为型
 *
 * 适用场景：
 * 1.一个数据结构如(list/set/map等)包含很多类型对象
 * 2.数据结构与数据操作分离
 *
 * 优点：
 * 1.增加新的操作很容易，即增加一个新的访问者
 * 2.增加新的数据结构困难
 * 3.具体元素变更困难
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 16:25
 * modifyTime
 */
public class Test {
    public static void main(String[] args) {

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("springmvc 数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("JAVA 设计模式精讲");
        codingCourse.setPrice(299);

        List<Course> courseList = new ArrayList();
        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList){
            course.accept(new Visitor());
        }

    }
}
