package com.gmail.dailyefforts.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class 整数比较器 implements Comparator<Integer> {
    public enum 类型 {
        升序,
        降序
    }

    private final 类型 序列类型;

    public 整数比较器(类型 序列类型) {
        this.序列类型 = 序列类型;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        final int ret = o1 - o2;
        if (序列类型 == 类型.降序) {
            return -ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        final int N = 8;
        Integer[] a = new Integer[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * N);
        }

        System.out.println("原始数组：");
        System.out.println(Arrays.toString(a));

        System.out.println("\n升序：");
        整数比较器 一个升序比较器 = new 整数比较器(类型.升序);
        Arrays.sort(a, 一个升序比较器);
        System.out.println(Arrays.toString(a));

        System.out.println("\n降序：");
        整数比较器 一个降序比较器 = new 整数比较器(类型.降序);
        Arrays.sort(a, 一个降序比较器);
        System.out.println(Arrays.toString(a));
    }
}
