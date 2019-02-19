package com.honglekai.study.dpStrategy.interpreter;

/**
 * description 解释器模式
 * 一般适用于OOP开发中的编译器开发，所以适用面比较窄
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 10:43
 * modifyTime
 */
public class InterpreterTest {

    public static void main(String[] args) {
        Expression expression = new Minus();
        Context context2 = new Context(9,1);
        int result = expression.interprete(context2);
        System.out.println("------------------"+result);

        // 计算9+2-8的值
        result = new Minus().interprete((new Context(new Plus()
                .interprete(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
