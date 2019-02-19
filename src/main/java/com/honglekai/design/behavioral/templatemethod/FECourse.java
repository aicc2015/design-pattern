package com.honglekai.design.behavioral.templatemethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 15:42
 * modifyTime
 */
public class FECourse extends ACourse {

    private  boolean needWriteArticle = false;

    @Override
    void packCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供图片等多媒体资料");
    }


    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
