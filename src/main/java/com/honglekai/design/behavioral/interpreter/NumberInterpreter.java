package com.honglekai.design.behavioral.interpreter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 16:00
 * modifyTime
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }


    @Override
    public int interpret() {
        return this.number;
    }
}
