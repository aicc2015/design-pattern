package com.honglekai.study.dpStrategy.decorator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:52
 * modifyTime
 */
public class Decortor implements Sourceable {

    private Source source;

    public Decortor(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("-------before decorator ----");
        source.method();
        System.out.println("-------after decorator ----");
    }
}
