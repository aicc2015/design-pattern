package com.honglekai.design.structural.composite;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 16:34
 * modifyTime
 */
public class Course extends CatlogComponent {

    private String name;

    private double price;


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatlogComponent catlogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatlogComponent catlogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称:"+name+" 课程价格:"+price);
    }
}
