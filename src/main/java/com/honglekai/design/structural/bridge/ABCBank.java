package com.honglekai.design.structural.bridge;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 18:13
 * modifyTime
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开农业银行账号");

        //委托给Accout实现
        return account.openAccount();
    }

}
