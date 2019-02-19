package com.honglekai.study.dpStrategy.adapter.interfaceAdapter;

import com.honglekai.study.dpStrategy.adapter.classAdapter.Adapter;

/**
 * description 接口适配器
 * 不希望实现接口中的所有方法，创建一个抽象类，实现接口中的所有方法，然后继承该抽象类既可
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:29
 * modifyTime
 */
public class InterfaceAdapterTest {

    public static void main(String[] args) {
        SourceSub1 sub1 = new SourceSub1();
        SourceSub2 sub2 = new SourceSub2();

        sub1.method1();
        sub1.method2();

        sub2.method1();
        sub2.method2();
    }
}
