package com.honglekai.study.filterChain;

/*
 * 责任链模式：
 * 数据消息在进入数据库之前，要被多种过滤规则进行处理，多种规则形成一种链，依次处理
 * 给定的数据消息
 */
/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 13:43
 * modifyTime
 */
public class MainTest {

    public static void main(String[] args) {

        String msg = "<script>;;;被就业,学习中，敏感操作";
        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();
        response.setResponseStr("Response");

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter())
                .add(new SensitiveFilter());

        fc.doFilter(request,response,fc);

        System.out.println(request.requestStr);
        System.out.println(response.responseStr);

        /*
         * 处理器对数据进行处理
         * --|----|---数据--|-----|---
         * 规则1      规则2                 规则3       规则4
         * 相应的也根据 定义的过滤链来处理， 处理顺序 为 规则4 规则3 规则2  规则1
         * 类似 栈 先进后出
         */
    }
}
