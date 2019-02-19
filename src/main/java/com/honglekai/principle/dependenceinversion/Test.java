package com.honglekai.principle.dependenceinversion;

/**
 * description 依赖倒置原则
 * 定义:高层不应该依赖低层模块，两者应依赖其抽象
 * 抽象不应该依赖细节，细节应该依赖抽象
 * 面向接口编程，不是面向实现编程
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:06
 * modifyTime
 */
public class Test {

   /*
    v1 面向实现编程
    public static void main(String[] args) {
        Hcc hcc = new Hcc();
        hcc.stuyJavaCourse();
        hcc.stuyFECourse();
    }*/

   /*
    v2
    public static void main(String[] args) {
        Hcc hcc = new Hcc();
        hcc.studyImoocCourse(new JavaCourse());
        hcc.studyImoocCourse(new FECourse());
    }*/


   /*
    v3
    public static void main(String[] args) {
        Hcc hcc = new Hcc(new JavaCourse());
        hcc.studyImoocCourse();
        Hcc hcc2 = new Hcc(new FECourse());
        hcc2.studyImoocCourse();
    }*/

    //v4
    public static void main(String[] args) {
        Hcc hcc = new Hcc();
        hcc.setiCourse(new JavaCourse());
        hcc.studyImoocCourse();

        hcc.setiCourse(new FECourse());
        hcc.studyImoocCourse();
    }
}
