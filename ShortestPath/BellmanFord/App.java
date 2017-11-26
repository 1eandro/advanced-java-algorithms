package ShortestPath.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Vertex> vertexList = new ArrayList<>();

		Vertex vA = new Vertex("A");
		Vertex vB = new Vertex("B");
		Vertex vC = new Vertex("C");
		Vertex vD = new Vertex("D");
		Vertex vE = new Vertex("E");

		vertexList.add(vA);
		vertexList.add(vB);
		vertexList.add(vC);
		vertexList.add(vD);
		vertexList.add(vE);

		List<Edge> edgeList = new ArrayList<>();

		edgeList.add(new Edge(vA, vB, +6));
		edgeList.add(new Edge(vA, vD, +7));

//		edgeList.add(new Edge(vB, vD, -8));   //use -8 instead +8 below to get detect a negative cycle
		edgeList.add(new Edge(vB, vD, +8));
		edgeList.add(new Edge(vB, vE, -4));
		edgeList.add(new Edge(vB, vC, +5));

		edgeList.add(new Edge(vC, vB, -2));

		edgeList.add(new Edge(vD, vC, -3));
		edgeList.add(new Edge(vD, vE, +9));

		edgeList.add(new Edge(vE, vC, +7));
		edgeList.add(new Edge(vE, vA, +2));

		BellmanFord bellmanFord = new BellmanFord(vertexList, edgeList);

		try{
			bellmanFord.bellmanFord(vA);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		bellmanFord.shortestPathTo(vE);
	}
}
