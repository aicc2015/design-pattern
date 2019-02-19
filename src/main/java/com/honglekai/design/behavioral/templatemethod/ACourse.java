package com.honglekai.design.behavioral.templatemethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 15:36
 * modifyTime
 */
public abstract class ACourse {

    protected final void makeCourse(){
        makePPT();
        makeVideo();
        if (needWriteArticle()){
            writeArticle();
        }
        packCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    abstract void packCourse();

    //钩子方法
    protected boolean  needWriteArticle(){
        return false;
    }

}
