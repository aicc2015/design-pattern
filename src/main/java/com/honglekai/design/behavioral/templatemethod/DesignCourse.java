package com.honglekai.design.behavioral.templatemethod;


/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 15:40
 * modifyTime
 */
public class DesignCourse extends ACourse {
    @Override
    void packCourse() {
        System.out.println("提供课程JAVA源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return false;
    }
}
