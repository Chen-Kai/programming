package com.gmail.dailyefforts.ds.graph;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TopoSort {

	public static List<Integer> topoSort(DirectedGraph g) {
		List<Integer> list = new ArrayList<>();
		Queue<Vertex> q = new LinkedList<>();
		for (Vertex v : g.vertices()) {
			if (v.inDegree == 0) {
				q.add(v);
			}
		}
		while (!q.isEmpty()) {
			Vertex v = q.poll();
			list.add(v.id);
			for (Vertex w : v.adj()) {
				if (--w.inDegree == 0) {
					q.add(w);
				}
			}
		}
		if (list.size() < g.V()) {
			throw new RuntimeException("There is cycle.");
		}
		return list;
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
		System.out.println(TopoSort.topoSort(g));
		sc.close();
	}
}
