package com.honglekai.study.algorithm;

/**
 * description 冒泡排序算法
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/9 18:21
 * modifyTime
 */
public class BubblingSort {

    public static void main(String[] args) {
        int[] arr = {1, 27, 38, 5 , 19, 40, 30};
        bubblingSort(arr);

        System.out.println();
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    /**
     *
     1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     3.针对所有的元素重复以上的步骤，除了最后一个。
     4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param arr
     */
    public static void bubblingSort(int[] arr){
        for (int i=0; i <arr.length; i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //交换顺序
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
