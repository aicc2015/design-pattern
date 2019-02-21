package com.honglekai.design.behavioral.chainofresponsibility;

/**
 * description 责任链模式
 * 1.为请求创建一个接收此次请求对象的链
 *
 * 类型：行为型
 *
 * 适用场景：
 * 1.一个请求的处理需要多个对象当中的一个或多个协同处理
 *
 * 优点：
 * 1.请求的发送者和接收者(请求的处理)解耦
 * 2.责任链可以动态组合
 *
 * 缺点：
 * 1.责任链太长或处理时间过长，影响性能
 * 2.责任链有可能过多
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 15:38
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setName("JAVA设计模式精讲");
        course.setArticle("JAVA设计模式精讲【手记】");
//        course.setVideo("JAVA设计模式精讲【视频】");

        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
