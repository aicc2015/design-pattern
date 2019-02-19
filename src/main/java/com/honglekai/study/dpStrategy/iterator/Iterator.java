package com.honglekai.study.dpStrategy.iterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:20
 * modifyTime
 */
public interface Iterator {

    /**
     * 迁移
     * @return
     */
    Object previous();

    /**
     * 后移
     * @return
     */
    Object next();

    /**
     * 是否有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 取得第一个元素
     * @return
     */
    Object first();
}
