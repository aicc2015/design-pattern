package com.honglekai.design.behavioral.interpreter;

/**
 * description 解释器模式
 * 定义：
 * 1.给定一个语言，定义他的文法的一种表示，并定义一个解释器
 * 这个解释器使用该表示解释语言中的句子
 * 2.为了解释一种语言，而为语言创建的解释器
 *
 * 适用场景：
 * 1.某个特定类型问题发生频率足够高
 *
 * 优点：
 * 1.语法由很多类表示，容易改变及扩展此语言
 *
 * 缺点：
 * 1.语法规则数目太多，增加了系统复杂度
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:19
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        HccExpressionParser expressionParser = new HccExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果"+result);
    }
}
