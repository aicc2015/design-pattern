package com.honglekai.study.thinkinoo;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 16:32
 * modifyTime
 */
public class OOTest {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.setName("张三");

        d.drive(new Plane(),new Address("南京"));
        d.drive(new Car());
    }
}
