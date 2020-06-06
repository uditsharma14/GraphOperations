package com.classes.graph.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphOperations {

	public static void BFStraversal(ArrayList<ArrayList<Integer>> adj,int V,int startIndex,HashMap<Integer,Character> map) {
		 // Mark all the vertices as not visited(By default  // set as false) 
        boolean visited[] = new boolean[V]; 
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        // Mark the current node as visited and enqueue it 
        visited[startIndex]=true; 
        queue.add(startIndex); 
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            startIndex = queue.poll(); 
            System.out.print(startIndex+" "); 
  
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = adj.get(startIndex).listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
	}
	
	public static void DFSTraversal(ArrayList<ArrayList<Integer>> adj,int V,int startIndex,HashMap<Integer,Character> map) {
		 // Mark all the vertices as not visited(By default  // set as false) 
       boolean visited[] = new boolean[V]; 
       DFSUtil(adj, startIndex, map,visited);
       
	}
	
	static void DFSUtil(ArrayList<ArrayList<Integer>> adj,int startIndex,HashMap<Integer,Character> map, boolean visited[] ) {
	       visited[startIndex]=true;
	       System.out.print(startIndex+" "); 
           Iterator<Integer> i = adj.get(startIndex).listIterator(); 
           while (i.hasNext()) 
           { 
               int nextIndex = i.next(); 
               if (!visited[nextIndex]) 
               { 
            	   DFSUtil(adj, nextIndex,map,visited);
               }
           }
	}
	
}
