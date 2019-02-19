package com.honglekai.design.creational.singleton;

/**
 * description 枚举类单例模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 14:56
 * modifyTime
 */
public enum  EnumInstance {

    INSTANCE{
        protected void printTest(){
            System.out.println("hcc print test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static  EnumInstance getInstance(){
        return INSTANCE;
    }
}
