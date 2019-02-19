package com.honglekai.design.creational.builder.v2;

/**
 * description 演进版 建造者模式 采用链式调用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 17:18
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildcourseName("JAVA设计模式精讲")
                .buildCoursePPT("JAVA设计模式精讲PPT").buildCourseArticle("JAVA设计模式精讲手记")
                .buildCourseVideo("JAVA设计模式精讲视频").buildCourseQA("JAVA设计模式精讲")
                .buildCourseQA("JAVA设计模式精讲问答").build();

        System.out.println(course);
    }
}
