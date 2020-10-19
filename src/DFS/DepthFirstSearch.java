package DFS;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
	private Stack<Vertex> stack;
	
	public void traverse(List<Vertex> vertexList)
	{
		for(Vertex v : vertexList)
		{
			if(!v.isVisited())
			{
				v.setVisited(true);
				dfsRecursion(v);
			}
		}
	}
	
	public void dfsRecursion(Vertex root)
	{
		
		System.out.println("Current Vertex: " + root);
		
		for(Vertex v: root.getAdjacencyList())
		{
			v.setVisited(true);
			dfsRecursion(v);
		}
	}
	public void dfsWithStack(Vertex root)
	{
		stack = new Stack<Vertex>();
		root.setVisited(true);
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			Vertex curr = stack.pop();
			System.out.println("Current Vertex: " +curr);
			for(Vertex n: curr.getAdjacencyList())
			{
				if(!n.isVisited())
				{
					n.setVisited(true);
					stack.push(n);
				}
			}
		}
	}
	
}
