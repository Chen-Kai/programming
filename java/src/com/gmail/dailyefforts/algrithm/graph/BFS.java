package com.gmail.dailyefforts.algrithm.graph;

import java.io.FileInputStream;
import java.util.*;

public class BFS {
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private DG g;

    public BFS(DG g) {
        this.g = g;
        final int V = g.getV();
        marked = new boolean[V + 1];
        edgeTo = new int[V + 1];
        distTo = new int[V + 1];

        for (int v = 1; v <= V; v++) {
            distTo[V] = Integer.MAX_VALUE;
        }
    }

    final Queue<Integer> q = new LinkedList<Integer>();

    private void bfs(int s) {
        q.clear();
        Arrays.fill(marked, false);
        Arrays.fill(distTo, Integer.MAX_VALUE);
        marked[s] = true;
        distTo[s] = 0;
        q.add(s);
        while (!q.isEmpty()) {
            int v = q.remove();
            for (int w : g.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    q.add(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public int distTo(int v) {
        return distTo[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        List<Integer> path = new ArrayList<Integer>();
        int x;
        for (x = v; distTo[x] != 0; x = edgeTo[x]) {
            path.add(x);
        }
        path.add(x);
        return path;
    }

    public void resolve() {
        final int V = g.getV();
        int count = 0;
        int sum = 0;
        for (int s = 1; s <= V; s++) {
            bfs(s);
            for (int v = 1; v <= V; v++) {
                if (v == s) {
                    continue;
                }
                if (hasPathTo(v)) {
                    sum += distTo(v);
                    count++;
//                    System.out.printf("%d to %d (%d):  ", s, v, distTo(v));
//                    for (int x : pathTo(v)) {
//                        if (x == s) {
//                            System.out.print(x);
//                        } else {
//                            System.out.print("-> " + x + " ");
//                        }
                }
//                System.out.println();
            }
        }
        System.out.println(sum + " " + count);
        System.out.printf("%.3f", sum / (float) count);
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
        final DG g = new DG(V);
        for (int i = 0, size = list.size(); i < size; i += 2) {
            g.addEdge(list.get(i), list.get(i + 1));
        }

        final BFS bfs = new BFS(g);
        bfs.resolve();
//        System.out.println(g);
        sc.close();
    }
}
