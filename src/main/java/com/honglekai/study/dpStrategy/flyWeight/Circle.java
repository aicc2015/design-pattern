package com.honglekai.study.dpStrategy.flyWeight;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 9:31
 * modifyTime
 */
public class Circle extends Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("我画了一个"+color+"的原型");
    }
}
