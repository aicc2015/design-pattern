package com.honglekai.design.behavioral.visitor;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 16:21
 * modifyTime
 */
public class CodingCourse extends Course {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void accept(IVisitor visitor) {
     visitor.visit(this);
    }
}
