package com.honglekai.principle.compositionaggregation;

/**
 * description 合成复用原则
 * 定义：尽量使用对象组合/聚合，而不使用继承达到软件复用的目的
 * 聚合has-A关系、组合contains-A 、继承 is-A
 * 优点：可以使系统更加灵活，降低了类与类直接的耦合度，一个类的变化对其他类影响较小
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:57
 * modifyTime
 */
public class Test {

    /*public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.addProduct();
    }*/

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
//        productDao.setDbConnetion(new MySqlConnetion());
        productDao.setDbConnetion(new PostgreSQLConnetion());
        productDao.addProduct();
    }
}
