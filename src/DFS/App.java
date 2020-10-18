package DFS;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v3);
		vertexList.add(v4);
		vertexList.add(v5);
		
		v1.addNeighbor(v2);
		v1.addNeighbor(v3);
		v3.addNeighbor(v4);
		v4.addNeighbor(v5);
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.traverse(vertexList);
	}

}
