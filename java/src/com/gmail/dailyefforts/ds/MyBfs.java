package com.gmail.dailyefforts.ds;

import java.io.File;
import java.util.Scanner;

import com.gmail.dailyefforts.ds.MyGraph.Type;

public class MyBfs {
	private static final int INFINITY = Integer.MAX_VALUE;
	private boolean[] marked; // marked[v] = is there an s-v path
	private int[] edgeTo; // edgeTo[v] = previous edge on shortest s-v path
	private int[] distTo; // distTo[v] = number of edges shortest s-v path

	public MyBfs(MyGraph g, int s) {
		marked = new boolean[g.V];
		distTo = new int[g.V];
		edgeTo = new int[g.V];
		bfs(g, s);
	}

	// breadth-first search from a single source
	private void bfs(MyGraph G, int s) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		for (int v = 0; v < G.V; v++) {
			distTo[v] = INFINITY;
		}
		distTo[s] = 0;
		marked[s] = true;
		q.enqueue(s);
		while (!q.isEmpty()) {
			int v = q.dequeue();
			MyList<Integer> list = G.adj(v);
			for (int i = 0, size = list.size(); i < size; i++) {
				final int w = list.get(i);
				if (!marked[w]) {
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
					marked[w] = true;
					q.enqueue(w);
				}
			}
		}
	}

	// breadth-first search from multiple sources
	private void bfs(MyGraph G, MyList<Integer> sources) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		for (int i = 0, size = sources.size(); i < size; i++) {
			final int s = sources.size();
			marked[s] = true;
			distTo[s] = 0;
			q.enqueue(s);
		}
		while (!q.isEmpty()) {
			int v = q.dequeue();
			MyList<Integer> list = G.adj(v);
			for (int i = 0, size = list.size(); i < size; i++) {
				final int w = list.get(i);
				if (!marked[w]) {
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
					marked[w] = true;
					q.enqueue(w);
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

	public MyList<Integer> pathTo(int v) {
		if (!hasPathTo(v))
			return null;
		MyList<Integer> path = new MyList<Integer>();
		int x;
		for (x = v; distTo[x] != 0; x = edgeTo[x])
			path.add(x);
		path.add(x);
		return path;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("./input/graph.txt"));
		int V = sc.nextInt();
		int E = sc.nextInt();
		MyGraph g = new MyGraph(V, Type.UNDIRECTED);
		for (int e = 0; e < E; e++) {
			final int v = sc.nextInt();
			final int w = sc.nextInt();
			g.addEdge(v, w);
			System.out.println("add edge: " + v + " - " + w);
		}
		System.out.println(g);
		final int s = 0;
		MyBfs bfs = new MyBfs(g, s);
		for (int v = 0; v < g.V; v++) {
			if (bfs.hasPathTo(v)) {
				System.out.printf("%d to %d (%d):  ", s, v, bfs.distTo(v));

				MyList<Integer> list = bfs.pathTo(v);
				for (int i = 0, size = list.size(); i < size; i++) {
					final int x = list.get(i);
					if (x == s) {
						System.out.print(x);
					} else {
						System.out.print("-" + x);
					}
				}
				System.out.println();
			} else {
				System.out.printf("%d to %d (-):  not connected\n", s, v);
			}

		}
		sc.close();
	}

}
