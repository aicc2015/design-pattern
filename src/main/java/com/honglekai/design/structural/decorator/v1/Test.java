package com.honglekai.design.structural.decorator.v1;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:15
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc()+" 销售价格"+batterCake.cost() );

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc()+" 销售价格"+batterCakeWithEgg.cost() );


        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc()+" 销售价格"+ batterCakeWithEggSausage.cost());


    }
}
