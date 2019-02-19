package com.honglekai.design.creational.prototype;

import java.text.MessageFormat;

/**
 * description 原型模式
 * 定义：指原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * 不需要知道创建的任何细节，不调用构造函数
 * 类型：创建型
 *
 * 适用场景：
 * 1.类初始化消耗较多资源
 * 2.new 产生的一个对象需要非常繁琐的过程(数据准备、数据权限等)
 * 3.构造函数比较复杂
 * 4.循环体中生成大量对象时
 *
 * 优点：
 * 1.原型模式比直接new一个对象性能高
 * 2.简化创建过程
 *
 * 缺点：
 * 1.必须配备克隆方法
 * 2.对克隆复杂对象或对克隆对象进行复杂改造时，容易引入风险
 * 3.深拷贝、浅拷贝要运用得当
 *
 * 扩展：深克隆、浅克隆
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 17:04
 * modifyTime
 */
public class MailUtil {

    public static void sendEmail(Mail mail){
        String content = "姓名{0},邮箱地址{1},{2}发送成功";
        System.out.println(MessageFormat.format(content,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void restoreOrigin(Mail mail){
        System.out.println("origin email content : "+mail.getContent());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("原始内容");
        System.out.println(mail);
        for (int i = 0; i < 10; i++) {
//            Mail newMail = new Mail();//对象创建耗内存
            //这里用原型模式来copy 采用二进制流copy
            Mail temp = (Mail)mail.clone();

            System.out.println(temp);
            temp.setName("姓名"+i);
            temp.setEmailAddress("姓名"+i+"@honglekai.com");
            temp.setContent("恭喜你中奖了");
            MailUtil.sendEmail(temp);
        }
        MailUtil.restoreOrigin(mail);
    }


}
