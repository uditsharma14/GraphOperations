package com.classes.graph;

import java.util.ArrayList;
import java.util.HashMap;

import com.classes.graph.node.Node;
import com.classes.graph.operations.GraphOperations;

public class Graph {

	//utility function to add an edge in an undirected graph
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
	}
	
	// utility function to print the adjacency list representation of graph
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("\nAdjacency list of vertex" + i);
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> " + adj.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	// Driver Code
	public static void main(String[] args) {
		// Creating a graph with 5 vertices
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
		map.put(0, 'A');
		map.put(1, 'B');
		map.put(2, 'C');
		map.put(3, 'D');
		map.put(4, 'E');
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());
		
		// Adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 2, 0);
		addEdge(adj, 2,3);
		addEdge(adj, 3, 3);
		printGraph(adj);
		GraphOperations.BFStraversal(adj,4,2,map);
		System.out.println();
		GraphOperations.DFSTraversal(adj, 4, 2, map);
	}
	
	
	
}
