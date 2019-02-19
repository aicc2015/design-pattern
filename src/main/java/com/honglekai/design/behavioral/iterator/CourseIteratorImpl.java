package com.honglekai.design.behavioral.iterator;

import org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 16:51
 * modifyTime
 */
public class CourseIteratorImpl implements  CourseIterator{

    private List courseList;
    private int pos = 0;
    private Course course;


    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是"+pos);
        course = (Course) courseList.get(pos);
        pos++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (pos < courseList.size()){
            return false;
        }
        return true;
    }
}
