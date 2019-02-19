package com.honglekai.design.structural.composite;

/**
 * description 组合模式
 * 1.将对象组合成树形结构以表示“部分-整体”的层次结构
 * 2.组合模式使客户端对单个对象和组合对象保持一致的方式处理
 *
 * 类型：结构型
 *
 * 适用场景：
 * 1.希望客户端可以忽略组合对象和单个对象的差异
 * 2.处理一个树形结构时
 *
 * 优点：
 * 1.清楚地定义分层次的复杂对象，表示对象的全部或部分层次
 * 2.让客户端忽略了层次的差异，方便对整个层次进行控制
 * 3.简化客户端代码
 * 4.符合开闭原则
 *
 *
 * 缺点：
 * 1.限制类型时会较为复杂
 * 2.使设计变得更加抽象
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 16:49
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        CatlogComponent linuxCourse = new Course("linux课程",100);
        CatlogComponent windowsCourse = new Course("windows课程",200);

        CatlogComponent javaCourse = new CourseCatlog("Java课程目录",2);

        CatlogComponent mmCourse1 = new Course("JAVA电商一期",230);
        CatlogComponent mmCourse2 = new Course("JAVA电商一期",240);
        CatlogComponent designCourse = new Course("JAVA设计模式",190);
        javaCourse.add(mmCourse1);
        javaCourse.add(mmCourse2);
        javaCourse.add(designCourse);

        CatlogComponent mainCourse = new CourseCatlog("慕课网课程主目录",1);

        mainCourse.add(linuxCourse);
        mainCourse.add(windowsCourse);
        mainCourse.add(javaCourse);

        mainCourse.print();
    }
}
