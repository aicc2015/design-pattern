package com.honglekai.design.structural.bridge;

/**
 * description 桥接模式
 * 定义：
 * 1.将抽象部分与它的具体实现部分分离，使他们都可以独立的变化
 * 2.通过组合的方式建立两个类之间的联系，而不是继承
 *
 * 类型：结构型
 *
 * 适用场景：
 * 1.抽象和具体实现之间增加更多的灵活性
 * 2.一个类存在两个(或多个)独立变化的纬度，且这两个(或多个)纬度都需要独立进行扩展
 * 3.不希望继承，或因为多层继承导致系统类个数剧增
 *
 * 优点：
 * 1.分离抽象部分和具体实现部分
 * 2.提高了系统的可扩展性
 * 3.符合开闭原则
 * 4.符合合成复用原则
 *
 * 缺点：
 * 1.增加了系统的理解和设计难度
 * 2.需正确地识别出系统中两个独立变化的维护
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 18:07
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        ABCBank abcBank2 = new ABCBank(new SavingAccount());
        Account abcAccount2 = abcBank2.openAccount();
        abcAccount2.showAccountType();

        ICBCBank icbcBank = new ICBCBank(new SavingAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        ICBCBank icbcBank2 = new ICBCBank(new DepositAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();


    }
}
