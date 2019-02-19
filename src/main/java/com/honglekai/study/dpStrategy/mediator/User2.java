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
public class User2  extends User{

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(" user2 execute......");
    }
}
