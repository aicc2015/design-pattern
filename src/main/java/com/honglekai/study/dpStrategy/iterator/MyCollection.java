package com.honglekai.study.dpStrategy.iterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:31
 * modifyTime
 */
public class MyCollection implements Collection {

    private String[] str = {"A","B", "C", "D"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return str[i];
    }

    @Override
    public int size() {
        return str.length;
    }
}
