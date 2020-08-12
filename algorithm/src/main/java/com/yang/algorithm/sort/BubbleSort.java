package com.yang.algorithm.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        // 待排序数据
        int[] intArr = Common.intArr;
        // 排序
        sort(Common.intArr);
    }

    public static void sort(int[] intArr) {
        int temp;
        // 一共冒泡多少次
        for (int i = 1; i < intArr.length; i++) {
            // 已经排序好得数据不要再次比较
            for (int j = 0; j < intArr.length - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
            System.out.print("第" + i + "次排序： ");
            Common.print(intArr);
        }
    }

}
