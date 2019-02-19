package com.honglekai.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 16:54
 * modifyTime
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
