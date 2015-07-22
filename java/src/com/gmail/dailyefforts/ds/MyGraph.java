package com.gmail.dailyefforts.ds;

import java.io.File;
import java.util.Scanner;

public class MyGraph {
	final int V;
	int E;
	private MyList<Integer>[] adj;

	private final Type type;

	public enum Type {
		DIRECTED, UNDIRECTED
	}

	public MyGraph(int V, Type type) {
		this.V = V;
		this.E = 0;
		adj = (MyList<Integer>[]) new MyList[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new MyList<Integer>();
		}
		this.type = type;
	}

	public void addEdge(int v, int w) {
		E++;
		adj[v].add(w);
		if (Type.UNDIRECTED.equals(this.type)) {
			adj[w].add(v);
		}
	}

	public MyList<Integer> adj(int v) {
		return adj[v];
	}

	public int degree(int v) {
		return adj[v].size();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(V + " vertices, " + E + " edges \n");
		for (int v = 0; v < V; v++) {
			builder.append(v + ": ");
			for (int i = 0, size = adj[v].size(); i < size; i++) {
				builder.append(adj[v].get(i) + " ");
			}
			builder.append('\n');
		}
		return builder.toString();
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("./input/graph.txt"));
		int V = sc.nextInt();
		int E = sc.nextInt();
		MyGraph graph = new MyGraph(V, Type.DIRECTED);
		for (int e = 0; e < E; e++) {
			final int v = sc.nextInt();
			final int w = sc.nextInt();
			graph.addEdge(v, w);
			System.out.println("add edge: " + v + " - " + w);
		}
		System.out.println(graph);
		sc.close();
	}

}
