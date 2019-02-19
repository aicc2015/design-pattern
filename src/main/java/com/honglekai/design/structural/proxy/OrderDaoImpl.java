package com.honglekai.design.structural.proxy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 10:48
 * modifyTime
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insertOrder(Order order) {
        System.out.println("DAO插入数据库成功");
        return 1;
    }
}
