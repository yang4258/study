package com.yang.algorithm.sort;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] intArr = Common.intArr;

        int temp, index;
        for (int i = 0; i < intArr.length-1; i++) {
            index = i;
            for (int j = i + 1; j<intArr.length; j++) {
                if (intArr[index] > intArr[j]) {
                    index = j;
                }
            }

            if (index != i) {
                temp = intArr[i];
                intArr[i] = intArr[index];
                intArr[index] = temp;
            }
        }

        Common.print(intArr);
    }

}
