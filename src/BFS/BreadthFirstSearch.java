package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	//BFS traversal
	
	public void traverse(Vertex root)
	{
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Vertex actual = queue.remove();
			System.out.println("Actual Visited Vertex: " + actual);
			
			for(Vertex v : actual.getAdjacencyList())
			{
				if(!v.isVisited())
				{
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
	
}
