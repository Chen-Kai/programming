package com.gmail.dailyefforts.algrithm.recursion;

import java.util.*;

public class Permutations {
    public static void perm(String str) {
        perm("", str);
    }

    private static void perm(String prefix, String str) {
        final int N = str.length();

        // 边界
        if (N == 0) {
            System.out.println(prefix);
            return;
        }

        // 每一种情况
        for (int i = 0; i < N; i++) {
            perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, N));
        }
    }


    public static void perm(int[] a) {
        List<Integer> list = new ArrayList<Integer>(a.length);
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        perm(list);
    }

    public static <T> void perm(List<T> list) {
        perm(new LinkedList<T>(), list);
    }

    private static <T> void perm(List<T> targetList, List<T> unSelectedList) {
        final int size = unSelectedList.size();
        if (size == 0) {
            System.out.println(targetList);
            return;
        }
        for (int i = 0; i < size; i++) {
            T item = unSelectedList.remove(0);
            targetList.add(item);
            perm(targetList, unSelectedList);
            targetList.remove(item);
            unSelectedList.add(item);
        }
    }


    public static void main(String[] args) {
        perm("abcdef");
        List<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        perm(list);
    }
}
