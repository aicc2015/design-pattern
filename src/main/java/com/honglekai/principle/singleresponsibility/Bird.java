package com.honglekai.principle.singleresponsibility;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:43
 * modifyTime
 */
public class Bird {

    public void fly(String name){
        if ("鸵鸟".equals(name)){
            System.out.println(name+" 用脚走");
        }else{
            System.out.println(name+" 用翅膀飞");
        }

    }
}
