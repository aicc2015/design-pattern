package com.honglekai.design.behavioral.observer;

/**
 * description 观察者模式
 * 定义：
 * 1.定义了对象之间一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者(观察者)都会收到通知并更新
 *
 * 类型：行为型
 *
 * 适用场景:
 * 1.关联行为场景，建立一套触发机制
 *
 * 优点：
 * 1.观察者与被观察者之间建立一个抽象的耦合
 * 2.观察者模式支持广播通信
 *
 * 缺点：
 * 1.观察者之间有过多的细节依赖、提高时间消耗及程序复杂度
 * 2.使用要得到，要避免循环调用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 17:10
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        Course course = new Course("设计模式精讲");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setContent("如何理解观察者模式");
        question.setUserName("hcc");

        course.produceQuestion(course,question);


    }
}
