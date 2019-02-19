package com.honglekai.study.dpStrategy.chainOfResponsibility;

import com.honglekai.study.dpStrategy.observer.AbstractSubject;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 17:12
 * modifyTime
 */
public class MyHandle extends AbstractHandle implements Handle {

    private String name;

    public MyHandle(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"-----deal!!-----");
        if (getHandle() != null){
            getHandle().operator();
        }
    }
}
