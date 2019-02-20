package com.honglekai.design.behavioral.interpreter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 15:56
 * modifyTime
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret()+this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
