package com.honglekai.study.dpStrategy.bridge;

/**
 * description 桥接模式
 * 抽象化和实现化解耦，使两者可以独立改变
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 16:51
 * modifyTime
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
