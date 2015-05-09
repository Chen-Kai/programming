package com.gmail.dailyefforts.algrithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static void insertSort(int[] a) {
        System.out.println("Insert sort, before:\n" + Arrays.toString(a));
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        System.out.println("Insert sort, after:\n" + Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strs = line.split("\\s+");
        int[] a = new int[strs.length];
        for (int i = 0, len = strs.length; i < len; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }
        insertSort(a);
    }
}
