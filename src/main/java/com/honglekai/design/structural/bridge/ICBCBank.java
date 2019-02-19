package com.honglekai.design.structural.bridge;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 18:16
 * modifyTime
 */
public class ICBCBank extends Bank {


    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        return account.openAccount();
    }
}
