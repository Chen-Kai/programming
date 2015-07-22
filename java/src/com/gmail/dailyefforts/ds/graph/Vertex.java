package com.gmail.dailyefforts.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	final int id;
	final List<Vertex> adj;
	int inDegree;
	int outDegree;

	public Vertex(int id) {
		this.id = id;
		this.adj = new ArrayList<>();
	}
	
	public void addAdj(Vertex w) {
		adj.add(w);
	}

	public List<Vertex> adj() {
		return adj;
	}

	@Override
	public String toString() {
		return String.format("%d", id);
	}
}
