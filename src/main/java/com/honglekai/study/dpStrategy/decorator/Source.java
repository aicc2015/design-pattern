package com.honglekai.study.dpStrategy.decorator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:51
 * modifyTime
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println(" this is original method .... ");
    }
}
