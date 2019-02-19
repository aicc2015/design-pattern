package com.honglekai.principle.openclose;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 15:29
 * modifyTime
 */
public class JavaCoruce implements ICource {

    private String name;

    private Integer id;

    private Double price;

    public JavaCoruce(String name, Integer id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
