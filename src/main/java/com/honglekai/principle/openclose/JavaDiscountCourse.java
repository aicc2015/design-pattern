package com.honglekai.principle.openclose;

import java.math.BigDecimal;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 15:36
 * modifyTime
 */
public class JavaDiscountCourse extends JavaCoruce {
    public JavaDiscountCourse(String name, Integer id, Double price) {
        super(name, id, price);
    }

    public Double getOriginPrice(){
        return this.getPrice();
    }

    public Double getDiscountPrice(){
        return  new BigDecimal(this.getPrice().toString()).multiply(new BigDecimal("0.8")).doubleValue();
    }
}
