package DFS.DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<Vertex>();
	}

	public void dfs(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}

	

	private void dfsWithStack(Vertex rootVertex) {

		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex actualVertex = this.stack.pop();
			System.out.print(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}

	}
	
	
	public void dfsRecursively(List<Vertex> vertexList) {

		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithRecursion(v);
			}
		}
	}

	private void dfsWithRecursion(Vertex vertex) {

		vertex.setVisited(true);

		System.out.print(vertex + " ");

		for (Vertex v : vertex.getNeighbourList()) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithRecursion(v);
			}
		}

	}
}
