package com.honglekai.study.dpStrategy.decorator;

/**
 * description 装饰器模式
 * 给一个对象增加新的功能，而且是动态的，
 * 装饰对象和被装饰对象需要实现相同的接口，并且装饰对象需要持有被装饰对象的实例
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:54
 * modifyTime
 */
public class DecoratorTest  {

    public static void main(String[] args) {
        Source source = new Source();
        Sourceable sourceable = new Decortor(source);
        sourceable.method();
    }
}
