package com.honglekai.study.dpStrategy.state;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 18:15
 * modifyTime
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if ("state1".equals(state.getValue())){
            state.method1();
        }else if("state2".equals(state.getValue())){
            state.method2();
        }
    }
}
