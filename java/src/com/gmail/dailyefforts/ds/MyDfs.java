package com.gmail.dailyefforts.ds;

import java.io.File;
import java.util.Scanner;

import com.gmail.dailyefforts.ds.MyGraph.Type;

public class MyDfs {
	// marked[v] = true if v is reachable from source (or sources)
	private boolean[] marked;
	// number of vertices reachable from s
	private int count;

	/**
	 * Computes the vertices in MyGraph <tt>G</tt> that are reachable from the
	 * source vertex <tt>s</tt>.
	 */
	public MyDfs(MyGraph G, int s) {
		marked = new boolean[G.V];
		dfs(G, s);
	}

	/**
	 * Computes the vertices in MyGraph <tt>G</tt> that are connected to any of
	 * the source vertices <tt>sources</tt>.
	 */
	public MyDfs(MyGraph G, MyList<Integer> sources) {
		marked = new boolean[G.V];
		for (int i = 0, size = sources.size(); i < size; i++) {
			final int v = sources.get(i);
			if (!marked[v])
				dfs(G, v);
		}
	}

	private void dfs(MyGraph G, int v) {
		count++;
		marked[v] = true;
		MyList<Integer> adj = G.adj(v);
		for (int i = 0, size = adj.size(); i < size; i++) {
			final int w = adj.get(i);
			if (!marked[w])
				dfs(G, w);
		}
	}

	/**
	 * Is there a directed path from the source vertex (or any of the source
	 * vertices) and vertex <tt>v</tt>?
	 * 
	 * @param v
	 *            the vertex
	 * @return <tt>true</tt> if there is a directed path, <tt>false</tt>
	 *         otherwise
	 */
	public boolean marked(int v) {
		return marked[v];
	}

	/**
	 * Returns the number of vertices reachable from the source vertex (or
	 * source vertices).
	 * 
	 * @return the number of vertices reachable from the source vertex (or
	 *         source vertices)
	 */
	public int count() {
		return count;
	}

	/**
	 * Unit tests the <tt>DirectedDFS</tt> data type.
	 */
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

		MyDfs dfs = new MyDfs(g, 9);

		// print out vertices reachable from sources
		for (int v = 0; v < g.V; v++) {
			if (dfs.marked(v))
				System.out.print(v + " ");
		}
		System.out.println();
		if (dfs.count() != g.V)
			System.out.println("NOT connected");
		else
			System.out.println("connected");
		sc.close();
	}

}
