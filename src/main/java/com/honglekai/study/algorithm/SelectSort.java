package com.honglekai.study.algorithm;

/**
 * description 简单选择排序
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/9 18:33
 * modifyTime
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1, 27, 38, 5 , 19, 40, 30};
        selectSort(arr);

        System.out.println();
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();

    }

    /**
     * 1.从未排序序列中，找到关键字最小的元素
     * 2.如果最小元素不是未排序序列的第一个元素，将其和未排序序列第一个元素互换
     * 3.重复1、2步，直到排序结束
     * @param arr
     */
    private static void selectSort(int[] arr) {
        for (int i=0;i< arr.length;i++){
            int min =  i;

            //选出之后待排序中值最小的位置
            for (int j=i+1; j<arr.length;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            //最小值不等于当前值时进行交换
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
