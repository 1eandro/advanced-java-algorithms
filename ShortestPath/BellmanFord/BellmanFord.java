package ShortestPath.BellmanFord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {

	private List<Edge> edgeList;
	private List<Vertex> vertexList;

	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}

	public void bellmanFord(Vertex sourceVertex) throws Exception {

		sourceVertex.setDistance(0);

		for (int i = 0; i < vertexList.size() - 1; i++) { // V-1 iterations --> we relax all the edges
			for (Edge edge : edgeList) {

				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();

				if (u.getDistance() == Double.MAX_VALUE)
					continue;

				double newDistance = u.getDistance() + edge.getWeight();

				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}

			}
		}

		for (Edge edge : edgeList) { // V-th iteration
			if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				if (hasCycle(edge)) {
					throw new Exception("There has been a negative cycle detected...");
				}
			}
		}

	}

	public boolean hasCycle(Edge edge) {
		return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
	}

	public void shortestPathTo(Vertex targetVertex) {
		
		List<Vertex> path = new ArrayList<Vertex>();

		if (targetVertex.getDistance() != Double.MAX_VALUE) {
			System.out.println(
					"There is a shortest path from source to target, with cost: " + targetVertex.getDistance());

			Vertex actualVertex = targetVertex;
			path.add(actualVertex);

			while (actualVertex.getPreviousVertex() != null) {
				actualVertex = actualVertex.getPreviousVertex();
				path.add(actualVertex);
			}
		} else {
			System.out.println("There is no path from souce to target...");
		}
		
		Collections.reverse(path);
		
		System.out.println(path);
	}
}
