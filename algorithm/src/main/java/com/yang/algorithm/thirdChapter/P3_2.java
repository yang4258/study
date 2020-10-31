package com.yang.algorithm.thirdChapter;

import java.io.File;

public class P3_2 {

    public static void main(String[] args) {
        System.out.println("递推算法求解兔子产仔");
        int n = 12;
        System.out.println("月份：" + n);
        System.out.println(n + "月，有" + fibonacci(n) + "对兔子");
    }

    /**
     * 第一月，一对兔子
     * 每对兔子第三月产仔一对
     *
     * @param n
     * @return
     */
    private static int fibonacci(int n) {
        return (n == 1 || n == 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 递归删除文件或文件夹
     * @param file 需提前眼做 file 是否存在
     */
    private static void del(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                del(files[i]);
            }
        }
        // 删除文件 或 文件夹 （文件夹上一步已清空）
        file.delete();
    }

}
