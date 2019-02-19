package com.honglekai.study.dpStrategy.state;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 18:14
 * modifyTime
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public  void method1(){
        System.out.println("------excute the first opt-------");
    }

    public  void method2(){
        System.out.println("------excute the second opt-------");
    }
}
