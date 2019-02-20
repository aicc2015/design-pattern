package com.honglekai.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * description 被观察者
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:55
 * modifyTime
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
