package com.honglekai.study.algorithm;

/**
 * description 直接插入排序
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/10 10:14
 * modifyTime
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 27, 38, 5 , 19, 40, 30};
        insertSort(arr);

        System.out.println();
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();

    }

    /**
     *
     1.从第一个元素开始，该元素可以认为已经被排序
     2.取出下一个元素，在已经排序的元素序列中从后向前扫描
     3.如果该元素（已排序）大于新元素，将该元素移到下一位置
     4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     5.将新元素插入到该位置后
     6.重复步骤2~5
     * @param arr
     */
    public static void insertSort(int[] arr){
        for (int i=0; i <arr.length-1; i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]>arr[j-1]){
                    //交换顺序
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
