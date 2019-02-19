package com.honglekai.study.dpStrategy.memento;

/**
 * description 备忘录模式
 * 保存对象的某个状态，以便在适当的时候恢复对象，
 * 通俗的讲：假设有原始类A，A中有各种属性，A可以决定需要备份的属性，
 * 备忘录类B用来存储A的一些内部状态，类C呢，主要是存储备忘录的，只能存储，不能修改
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 17:59
 * modifyTime
 */
public class MementoTest {


    public static void main(String[] args) {

        Orignal orignal = new Orignal("你好");

        Storage storage = new Storage(orignal.createMemento());

        System.out.println("-=-----初始状态---"+orignal.getValue());

        orignal.setValue("我好");

        System.out.println("-------修改后状态------"+orignal.getValue());

        orignal.restoreMemento(storage.getMemento());

        System.out.println("======恢复后状态======"+orignal.getValue());


    }
}
