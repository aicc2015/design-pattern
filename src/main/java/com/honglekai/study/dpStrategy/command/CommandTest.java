package com.honglekai.study.dpStrategy.command;

/**
 * description 命令模式
 * 命令模式很好理解，举个例子，司机下达命令，命令经过传递，传递到士兵耳朵里，
 * 士兵去执行，这个过程在于三个对象相互解耦，任何一方都不依赖其他人，只需要做好自己的事情就行了，司令要的是结果，不会去关注士兵怎么实现的。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 17:32
 * modifyTime
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommond(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
