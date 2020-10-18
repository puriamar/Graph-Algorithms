package BFS;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		Vertex f = new Vertex("f");
		Vertex g = new Vertex("g");
		Vertex h = new Vertex("h");
		
		a.addNeighbor(b);
		a.addNeighbor(f);
		a.addNeighbor(g);
		
		
		b.addNeighbor(a);
		b.addNeighbor(c);
		b.addNeighbor(d);
		
		c.addNeighbor(b);
		
		d.addNeighbor(b);
		d.addNeighbor(e);
		
		e.addNeighbor(d);
		
		f.addNeighbor(a);
		
		g.addNeighbor(a);
		g.addNeighbor(h);
		
		h.addNeighbor(g);
		
		//								   a
		//							   /   |   \
		//							  /	   |    \
		//							 b     f     g
		//                         /   \         |
		//                        /     \        |
		//                        c     d        h
		//                              |
		//                              |
		//                              e
		//undirected graph
		//BFS call
		BreadthFirstSearch mySearch = new BreadthFirstSearch();
		mySearch.traverse(a);
		
		
		
	}

}
