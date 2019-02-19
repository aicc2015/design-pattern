package com.honglekai.study.dpStrategy.mediator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 10:30
 * modifyTime
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(".......user1...execute..........");
    }
}
