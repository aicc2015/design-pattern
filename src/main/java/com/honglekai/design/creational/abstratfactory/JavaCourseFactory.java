package com.honglekai.design.creational.abstratfactory;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 11:47
 * modifyTime
 */
public class JavaCourseFactory  implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
