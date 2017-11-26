package ShortestPath.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

	public void computePaths(Vertex sourceVertex) {

		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();
		System.out.println("\n------------------------------------\n>>>> starting computing paths\nadding " + sourceVertex
				+ " to the priorityQueue");
		priorityQueue.add(sourceVertex);
		System.out.println("priorityQueue after start: " + priorityQueue);

		while (!priorityQueue.isEmpty()) {

			Vertex actualVertex = priorityQueue.poll();

			System.out.println("\n************************************\n"+
								"working now with the " + actualVertex + " from the priority queue"+
								"\nand its adjacencies list "+actualVertex.getAdjacenciesList());

			for (Edge edge : actualVertex.getAdjacenciesList()) {

				Vertex v = edge.getTargetVertex();

				double newDistance = actualVertex.getDistance() + edge.getWeight();

				if (newDistance < v.getDistance()) {
					System.out.println("\npriorityQueue before REMOVE " + v + ": " + priorityQueue);
					priorityQueue.remove(v);
					System.out.println("priorityQueue after REMOVE " + v + ": " + priorityQueue);
					v.setDistance(newDistance);
					v.setPredecessor(actualVertex);
					System.out.println("\npriorityQueue before ADD " + v + ": " + priorityQueue);
					priorityQueue.add(v);
					System.out.println("priorityQueue after ADD " + v + ": " + priorityQueue);
				}
			}
		}

	}

	public List<Vertex> getShortestPathTo(Vertex targetVertex) {

		List<Vertex> shortestPathToTarget = new ArrayList<>();

		System.out.println("\n....getting predecessors");
		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
			System.out.println("predecessor of " + vertex + " is " + vertex.getPredecessor());
			shortestPathToTarget.add(vertex);
		}

		Collections.reverse(shortestPathToTarget);

		return shortestPathToTarget;
	}

}
