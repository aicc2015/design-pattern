package com.honglekai.design.behavioral.iterator;

/**
 * description 迭代器模式
 * 定义：
 * 1.提供一种方法，顺序访问一个集合对象中的各个元素，又不暴露该对象的内部表示
 *
 * 类型：行为型
 *
 * 适用场景：
 * 1.访问一个集合对象的内容而无需暴露它的内部表示
 * 2.为遍历不同的集合提供统一的接口
 *
 * 优点：
 * 1.分离了集合对象的遍历行为
 *
 * 缺点：
 * 1.类的个数成对增加
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 16:59
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("JAVA电商一期");
        Course course4 = new Course("linux课程");
        Course course2 = new Course("JAVA电商二期");
        Course course3 = new Course("设计模式精讲");
        Course course5 = new Course("python课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);

        System.out.println("课程列表");
        printCourses(courseAggregate);

        courseAggregate.remove(course4);
        courseAggregate.remove(course5);

        System.out.println("删除后列表==============");
        printCourses(courseAggregate);

    }

    private static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator iterator = courseAggregate.getCourseIterator();
       while (!iterator.isLastCourse()){
           Course course = iterator.nextCourse();
           System.out.println(course.getName());
       }
    }
}
