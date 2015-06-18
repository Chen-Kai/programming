package com.gmail.dailyefforts.algrithm.graph;

import java.io.FileInputStream;
import java.util.*;

public class DG {
    private final int V;
    private int E;
    private List<Integer>[] adj;

    public DG(final int V) {
        this.V = V;
        adj = (List<Integer>[]) new List[V + 1];
        for (int v = 1; v <= V; v++) {
            adj[v] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int s, int e) {
        adj[s].add(e);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(String.format("This Graph has %d v, and %d edges.\n", V, E));
        for (int v = 1; v <= V; v++) {
            buf.append(String.format("%d: ", v));
            for (Integer e : adj[v]) {
                buf.append(e + " ");
            }
            buf.append('\n');
        }
        return String.valueOf(buf);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("./src/com/gmail/dailyefforts/algrithm/graph/input.txt"));

        Set<Integer> vSet = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int E = sc.nextInt();
        for (int e = 0; e < E; e++) {
            final int v = sc.nextInt();
            final int w = sc.nextInt();
            vSet.add(v);
            vSet.add(w);
            list.add(v);
            list.add(w);
        }
        int V = vSet.size();
        DG dg = new DG(V);
        for (int i = 0, size = list.size(); i < size; i += 2) {
            dg.addEdge(list.get(i), list.get(i + 1));
        }
        System.out.println(dg);
        sc.close();
    }

}
