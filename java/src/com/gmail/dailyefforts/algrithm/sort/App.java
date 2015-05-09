package com.gmail.dailyefforts.algrithm.sort;

import com.gmail.dailyefforts.princeton.stdlib.StdDraw;

import java.awt.*;
import java.util.Arrays;

public class App {
    public static final int W = 800;
    public static final int H = 800;

    private static void selectionSort(int[] a) {
        System.out.println("Selection sort, before: \n" + Arrays.toString(a));
        show(a, -1);
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            show(a, minIndex);
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
            show(a, i);
        }
        System.out.println("Selection sort, after: \n" + Arrays.toString(a));
    }

    private static void insertionSort(int[] a) {
        System.out.println("Insertion sort, before:\n" + Arrays.toString(a));
        show(a, -1);
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                show(a, j);
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        System.out.println("Insertion sort, after:\n" + Arrays.toString(a));
    }

    private static void show(int[] a, int activeIndex) {
//        try {
//            Thread.sleep(2 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        StdDraw.clear();
        for (int i = 0, x = 20, len = a.length, step = W / len; i < len; x += step, i++) {
            if (i == activeIndex) {
                StdDraw.setPenColor(Color.BLUE);
            } else {
                StdDraw.setPenColor(Color.BLACK);
            }
            StdDraw.line(x, 0, x, a[i]);
            StdDraw.setPenColor(Color.WHITE);
            StdDraw.line(x, a[i], x, H);        }
    }

    public static void main(String[] args) {
        final int N = 100;
        int[] a = new int[N];
        for (int i = 0, len = N; i < len; i++) {
            a[i] = (int) (Math.random() * H);
        }
        StdDraw.setXscale(0, W);
        StdDraw.setYscale(0, H);
        StdDraw.setPenRadius(.005);
//        insertionSort(a);
        selectionSort(a);
    }
}
