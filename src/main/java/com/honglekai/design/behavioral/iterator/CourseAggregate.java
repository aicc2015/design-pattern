package com.honglekai.design.behavioral.iterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 16:49
 * modifyTime
 */
public interface CourseAggregate  {

    void addCourse(Course course);

    void remove(Course course);

    CourseIterator getCourseIterator();
}
