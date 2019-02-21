package com.honglekai.design.behavioral.command;

/**
 * description 命令模式
 * 定义：将请求封装成对象，以便使用不同的请求
 * 命令模式解决了应用程序中对象的职责以及他们之间的通信方式
 *
 * 适用场景：
 * 1.请求调用者和请求接收者需要解耦，使得调用者和接收者不直接交互
 * 2.需要抽象出等待执行的行为
 *
 * 优点：
 * 1.降低耦合
 * 2.容易扩展新的命令或一组命令
 *
 * 缺点：
 * 1.命令的无限扩展会增加类的数量，提高系统实现复杂度
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:09
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("JAVA设计模式精讲-by geely");
        OpenCourseCommand openCourseCommand = new OpenCourseCommand(courseVideo);
        CloseCourseCommand closeCourseCommand = new CloseCourseCommand(courseVideo);

       Staff staff = new Staff();
       staff.addCommand(openCourseCommand);
       staff.addCommand(closeCourseCommand);

       staff.executeCommands();

    }
}
