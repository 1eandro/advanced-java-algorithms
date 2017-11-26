package ShortestPath.DAG;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	
//	Bellman-Ford algorithm: O(E*V)
//	Dijkstra method: O(E+V*logV)
//	DAG shortest path method: O(E+V)
	
	public static void main(String[] args) {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertexA);
		vertexList.add(vertexB);
		vertexList.add(vertexC);
		
		vertexA.addNeighbour(new Edge(1, vertexA, vertexB));
		vertexA.addNeighbour(new Edge(3, vertexA, vertexC));

		vertexB.addNeighbour(new Edge(1, vertexB, vertexC));

		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPath(vertexList, vertexA, vertexC);
		acyclicShortestPath.showShortestPathTo(vertexC);
	}
}
