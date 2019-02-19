package com.honglekai.study.dpStrategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/8 18:00
 * modifyTime
 */
public class DataSort {


    public static void sort(Object[] a) {

        //冒泡排序
        for (int i=0;i<a.length-1;i++){
            for (int j=0; j<a.length-1-i;j++){
                Comparable o1 = (Comparable) a[j];
                Comparable o2 = (Comparable) a[j+1];
                if (o1.compareTo(o2) == 1){
                    swap(a, j,j+1);
                }
            }
        }
    }

    private static void swap(Object[] arr, int x, int y) {
        Object temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void p(Object[] a) {
        for (Object o : a){
            System.out.print(o+" ");
        }
    }
}
