package com.honglekai.study.dpStrategy.iterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:26
 * modifyTime
 */
public interface Collection {

    Iterator iterator();

    /**
     * 取得集合对象
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * 获取集合大小
     * @return
     */
    int size();
}
