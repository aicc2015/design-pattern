package com.honglekai.design.structural.flyweight;

import java.lang.management.ManagementFactory;

/**
 * description 享元模式
 * 定义：提供了减少对象数量从而改善应用所需的对象结构的方式
 * 运用共享技术有效的支持大量细粒度的对象
 *
 * 类型：结构型
 *
 * 适用场景：
 * 1.常常应用于系统底层的开发，以便解决系统的性能问题
 * 2.系统需要大量相似对象，类似缓冲池的场景
 *
 * 优点：
 * 1.减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 * 2.减少内存之外的其他资源的占用
 *
 * 缺点：
 * 1.关注内部/外部状态 关注线程安全问题
 * 2.使系统、程序的逻辑复杂化
 *
 * 扩展：
 * 内部状态/外部状态
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 13:37
 * modifyTime
 */
public class Test {

    private static final String[] departments = {"RD","PM","QA","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random()*departments.length)];
            Employee manager =  EmployeeFactory.getManager(department);
            manager.report();
        }

        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(2000);
        Integer d = 2000;

        System.out.println("a==b "+(a==b));
        System.out.println("c==d "+(c==d));
    }
}
