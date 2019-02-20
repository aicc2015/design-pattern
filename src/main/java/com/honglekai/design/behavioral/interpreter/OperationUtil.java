package com.honglekai.design.behavioral.interpreter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:04
 * modifyTime
 */
public class OperationUtil {
    public static boolean isOperater(String symbol) {
        return symbol.equals("+") || symbol.equals("*");
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if ("+".equals(symbol)){
            return new AddInterpreter(firstExpression,secondExpression);
        }else if("*".equals(symbol)) {
            return new MulInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}
