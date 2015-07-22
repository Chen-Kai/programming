package com.gmail.dailyefforts.ds.graph;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectedGraph {
	private final int V;
	private int E;
	private List<Vertex> vertices;

	public DirectedGraph(int V) {
		this.V = V;
		vertices = new ArrayList<>();
		for (int v = 0; v < V; v++) {
			vertices.add(new Vertex(v));
		}
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int from, int to) {
		Vertex v = vertices.get(from);
		Vertex w = vertices.get(to);
		v.addAdj(w);
		v.outDegree++;
		w.inDegree++;
		E++;
	}

	public int inDegree(int v) {
		Vertex vertex = vertices.get(v);
		return vertex.inDegree;
	}

	public int outDegree(int v) {
		Vertex vertex = vertices.get(v);
		return vertex.outDegree;
	}

	public Iterable<Vertex> vertices() {
		return vertices;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("%d vertices, %d edges\n", V, E));
		for (int v = 0; v < V; v++) {
			builder.append(v + ": " + vertices.get(v).adj);
			builder.append('\n');
		}
		return builder.toString();
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileInputStream("./input.txt"));
		final int V = sc.nextInt();
		final int E = sc.nextInt();
		DirectedGraph g = new DirectedGraph(V);
		for (int e = 0; e < E; e++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			g.addEdge(v, w);
		}
		System.out.println(g);
		sc.close();
	}
}
