package com.honglekai.study.dpStrategy.adapter.objAdapter;

import com.honglekai.study.dpStrategy.adapter.classAdapter.Adapter;
import com.honglekai.study.dpStrategy.adapter.classAdapter.Source;

/**
 * description 对象适配器
 * 1个对象转成满足另一个接口的对象
 * 对象适配器和类适配器类似，只是不继承原对象，而是持有原对象的实例
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:01
 * modifyTime
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
