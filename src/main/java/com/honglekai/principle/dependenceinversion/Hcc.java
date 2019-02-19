package com.honglekai.principle.dependenceinversion;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:04
 * modifyTime
 */
public class Hcc {

    private ICourse iCourse;

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /*public Hcc(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    /*public void stuyJavaCourse(){
        System.out.println("hcc 正在学习 java课程");
    }

    public void stuyFECourse(){
        System.out.println("hcc 正在学习 前端课程");
    }*/

    /*public void studyImoocCourse(ICourse iCourse){
        iCourse.studyCourse();
    }*/

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
