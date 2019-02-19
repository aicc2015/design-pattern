package com.honglekai.study.dpStrategy.iterator;

/**
 * description 迭代器模式
 * 顺序访问聚集中的对象，一般来说，集合非常常见
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:27
 * modifyTime
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println("=====集合中的元素==========="+iterator.next());
        }
    }
}
