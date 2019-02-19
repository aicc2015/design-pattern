package com.honglekai.study.dpStrategy.adapter.objAdapter;

import com.honglekai.study.dpStrategy.adapter.classAdapter.Source;
import com.honglekai.study.dpStrategy.adapter.classAdapter.Targetable;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 16:59
 * modifyTime
 */
public class Wrapper implements Targetable {

    private Source source;


    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is target method ....");
    }
}
