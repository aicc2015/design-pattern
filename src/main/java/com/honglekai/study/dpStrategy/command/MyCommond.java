package com.honglekai.study.dpStrategy.command;

import javax.activation.CommandMap;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 17:33
 * modifyTime
 */
public class MyCommond implements Command {

    private Receiver receiver;

    public MyCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
