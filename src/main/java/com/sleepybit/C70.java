package com.sleepybit;

import java.util.List;

/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

示例 1：

输入：n = 2
输出：2
解释：有两种方法可以爬到楼顶。
1. 1 阶 + 1 阶
2. 2 阶
示例 2：

输入：n = 3
输出：3
解释：有三种方法可以爬到楼顶。
1. 1 阶 + 1 阶 + 1 阶
2. 1 阶 + 2 阶
3. 2 阶 + 1 阶

草稿：
输入：n = 4
输出：5


提示：

1 <= n <= 45

 */
public class C70 {

    public static void main(String[] args) {
        System.out.printf(String.format("%d", climbStairs(4)));
    }

    public static int climbStairs(int n) {
        int result = 0;
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        if (n == 3) {
//            return 3;
//        } else {
//            result += climbStairs(n - 1) + climbStairs(n - 2);
//        }

        int[] temp = new int[n + 1];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }

        return temp[n];

    }

}
