package Introduction;

public class GraphRepresentation {
	
	//adjacencyMatrix for a simple graph.
	//  A -(4)->C
	//  |
	// (2)
	//	|
	//  V
	//  B -(3)->D
	// This directed weighted Graph.
	public static int[][] adjacencyMatrix= {
			{0,2,4,0},
			{0,0,0,3},
			{0,0,0,0},
			{0,0,0,0}
	};
	
	public static void main(String[] args) {
		
		//Adjacency List
		System.out.println("Adjacency Matrix");
		System.out.println();
		//find all edges.
		//O(n^2), where n is number of vertices.
		for(int i = 0; i < adjacencyMatrix.length; i++)
		{
			for(int j = 0; j < adjacencyMatrix[0].length; j++)
			{
				if(adjacencyMatrix[i][j] > 0)
					System.out.println("Edge with weight: " + adjacencyMatrix[i][j]);
			}
		}
		
		//if we know the vertex then O(1);
		System.out.println(adjacencyMatrix[0][2]);
		System.out.println();
		
		//Adjacency List
		System.out.println("Adjacecy List");
		System.out.println();
		
		//  A -->C
		//  |
		//	|
		//  V
		//  B -->D
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		
		a.addNeighbor(b);
		a.addNeighbor(c);
		b.addNeighbor(d);
		
		//print all Neighbors.
		a.showNeighbors();
		b.showNeighbors();
		c.showNeighbors();
		d.showNeighbors();
		
		
		
	}

}
