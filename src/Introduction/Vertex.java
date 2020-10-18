package Introduction;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Vertex> adjacencyList;
	
	
	public Vertex(String name)
	{
		this.name = name;
		this.adjacencyList = new ArrayList<Vertex>();
	}
	
	public void addNeighbor(Vertex name)
	{
		this.adjacencyList.add(name);
	}
	
	public void showNeighbors()
	{
		System.out.print(this.name + ": ");
		for(Vertex neighbor: this.adjacencyList)
			System.out.print(neighbor + " ");
		System.out.println();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
