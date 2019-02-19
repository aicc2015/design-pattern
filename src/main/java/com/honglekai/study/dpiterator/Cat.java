package com.honglekai.study.dpiterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 17:55
 * modifyTime
 */
public class Cat {

    private int id;

    public Cat(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }
}
