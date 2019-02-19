package com.honglekai.study.dpStrategy.state;

import com.honglekai.study.dpStrategy.flyWeight.ConnectionPool;

/**
 * description 状态模式
 *  核心思想：当对象状态改变时，同时改变其行为
 * 1.通过改变状态获取不同的行为
 * 2.你的好友能同时看到你的变化
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 18:18
 * modifyTime
 */
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
