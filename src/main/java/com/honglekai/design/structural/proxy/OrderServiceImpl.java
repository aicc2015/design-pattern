package com.honglekai.design.structural.proxy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 10:45
 * modifyTime
 */
public class OrderServiceImpl implements IOrderService {


    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        //spring会自己注入，这里直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("service 调用dao 成功");
        return iOrderDao.insertOrder(order);
    }
}
