package com.honglekai.design.behavioral.interpreter;

import sun.swing.StringUIClientPropertyKey;

import java.util.Stack;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:02
 * modifyTime
 */
public class HccExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray){
            if (!OperationUtil.isOperater(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈 %d",numberExpression.interpret()));
            }else{
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();

                System.out.println(String.format("出站 %d %d ",firstExpression.interpret(), secondExpression.interpret()));

                Interpreter operater = OperationUtil.getExpressionObject(firstExpression,secondExpression,symbol);
                System.out.println(String.format("应用云算法 %s",operater));

                int result =  operater.interpret();
                NumberInterpreter resultInterpreter = new NumberInterpreter(result);
                stack.push(resultInterpreter);
                System.out.println(String.format("阶段结果入栈 %d",resultInterpreter.interpret()));


            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
