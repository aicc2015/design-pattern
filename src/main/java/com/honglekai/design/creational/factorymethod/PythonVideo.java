package com.honglekai.design.creational.factorymethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 18:16
 * modifyTime
 */
public class PythonVideo extends Video {
    @Override
    void produce() {
        System.out.println("录制 python 视频");
    }
}
