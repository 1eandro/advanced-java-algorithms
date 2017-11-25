package cycleDetectionDFS;

import java.util.List;

public class CycleDetection {

	public void detectCycle(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex vertex) {

		System.out.println("\nDFS on vertex " + vertex);
		vertex.setBeingVisited(true); 
		

		for (Vertex v : vertex.getAdjacenciesList()) {

			System.out.println("Visiting the neighbours of vertex " + v);
			if (v.isBeingVisited()) {
				System.out.println("####### There is a backward edge: so there is a cycle!!!");
				return;
			}

			if (!v.isVisited()) {
				System.out.println("Visiting vertex " + v + " recursively...");
				v.setVisited(true);
				dfs(v);
			}
		}

		System.out.println("Set vertex " + vertex + " setBeingVisited(false) and isVisited(true)...");
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}

}
