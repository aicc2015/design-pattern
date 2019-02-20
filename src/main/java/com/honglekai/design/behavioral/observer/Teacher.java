package com.honglekai.design.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * description 观察者
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:57
 * modifyTime
 */
public class Teacher implements Observer {

    private String teachName;


    public Teacher(String teachName) {
        this.teachName = teachName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(teachName+"老师"+course.getCourseName()+"课程接收到一个"+question.getUserName()+"提交的问答"+question.getContent());
    }
}
