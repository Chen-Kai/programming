package com.gmail.dailyefforts.ds;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class UF {
    private int[] id;     // id[i] = parent of i
    private byte[] rank;  // rank[i] = rank of subtree rooted at i (cannot be more than 31)
    private int count;    // number of components

    public UF(int N) {
        count = N;
        id = new int[N];
        rank = new byte[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int p) {
        if (p < 0 || p >= id.length) throw new IndexOutOfBoundsException();
        while (p != id[p]) {
            id[p] = id[id[p]];    // path compression by halving
            p = id[p];
        }
        return p;
    }

    public int count() {
        return count;
    }
  
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
  
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        // make root of smaller rank point to root of larger rank
        if      (rank[i] < rank[j]) id[i] = j;
        else if (rank[i] > rank[j]) id[j] = i;
        else {
            id[j] = i;
            rank[i]++;
        }
        count--;
        System.out.println(Arrays.toString(id));
    }

    public static void main(String[] args) {
        int N = 10;
        UF uf = new UF(N);
        Scanner sc = new Scanner(new StringReader("4 3 3 8 6 5 9 4 2 1 5 0 7 2 6 1"));
        while (sc.hasNext()) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(uf.count() + " components");
        sc.close();
    }
}

