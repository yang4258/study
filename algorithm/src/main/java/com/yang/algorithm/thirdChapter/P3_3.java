package com.yang.algorithm.thirdChapter;

public class P3_3 {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + "! = " + fact(n));
    }

    /**
     * 计算n！
     * @param n
     * @return
     */
    private static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n-1);
    }

}
