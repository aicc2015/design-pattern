package com.honglekai.study.dpStrategy;

import javax.xml.crypto.Data;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/8 17:59
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
//        int[]  a = {4,9, 1, 3, 5 };

        Cat[] a = {new Cat(4),new Cat(8), new Cat(3)};
        DataSort.sort(a);
        DataSort.p(a);
    }
}
