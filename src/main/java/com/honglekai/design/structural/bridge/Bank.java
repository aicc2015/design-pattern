package com.honglekai.design.structural.bridge;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 18:11
 * modifyTime
 */
public abstract class Bank  {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract  Account openAccount();
}
