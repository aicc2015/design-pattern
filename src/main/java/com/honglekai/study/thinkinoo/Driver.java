package com.honglekai.study.thinkinoo;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 16:19
 * modifyTime
 */
public class Driver {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive(Vehicle v){
        v.run(new Address("合肥"));
    }


    public void drive(Vehicle v,Address address){
        v.run(address);
    }
}
