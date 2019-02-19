package com.honglekai.study.dpStrategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/9 23:55
 * modifyTime
 */
public class Cat implements Comparable{

    private int height;


    @Override
    public int compareTo(Object o) {
        if (o instanceof Cat){
            if (this.height > ((Cat) o).getHeight() ){
                return  1;
            }else if(this.height < ((Cat) o).getHeight()){
                return -1;
            }else {
                return 0;
            }
        }else {
            throw new RuntimeException("");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cat(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                '}';
    }
}
