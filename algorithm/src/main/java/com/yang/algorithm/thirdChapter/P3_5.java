package com.yang.algorithm.thirdChapter;

public class P3_5 {

    public static void main(String[] args) {
        System.out.println("圆周率：" + MontePI(50000000));
    }

    /**
     * 计算圆周率
     * @param n
     * @return
     */
    private static double MontePI(int n) {
        double PI, x, y;
        int num = 0;
        for (int i=0; i<n; i++) {
            x = Math.random();
            y = Math.random();
            if (x*x + y*y <= 1) {
                num ++;
            }
        }
        return 4.0 * num/n;
    }

}
