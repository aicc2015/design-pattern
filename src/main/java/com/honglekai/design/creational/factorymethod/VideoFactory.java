package com.honglekai.design.creational.factorymethod;

/**
 * description 这里用抽象的类，不用接口，因为抽象类也可以有一些自己实现的方法
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 18:17
 * modifyTime
 */
public abstract class VideoFactory  {

    public abstract Video getVideo();

    /**
     * 其他自己实现的方法
     */
    public  void otherMethod(){
    }
}
