package com.honglekai.principle.compositionaggregation;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 16:01
 * modifyTime
 */
public class ProductDao{

    private DBConnetion dbConnetion;


    public void setDbConnetion(DBConnetion dbConnetion) {
        this.dbConnetion = dbConnetion;
    }


    /* public void addProduct(){
        String con = super.getConnetion();
        System.out.println("使用"+con+"增加产品");
    }*/

    public void addProduct(){
        String con = dbConnetion.getConnetion();
        System.out.println("使用"+con+"增加产品");
    }

}
