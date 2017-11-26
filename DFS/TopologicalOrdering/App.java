package DFS.TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
	public static void main(String[] args) {

		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();

		List<Vertex> graph = new ArrayList<>();
		
		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");

		graph.add(v0);
		graph.add(v1);
		graph.add(v2);
		graph.add(v3);
		graph.add(v4);
		graph.add(v5);

		v2.addNeighbour(v3);

		v3.addNeighbour(v1);

		v4.addNeighbour(v0);
		v4.addNeighbour(v1);

		v5.addNeighbour(v0);
		v5.addNeighbour(v2);
		
		for (int i = 0; i < graph.size(); i++) {
			if (!graph.get(i).isVisited()) {
				topologicalOrdering.dfs(graph.get(i));
			}
		}

		Stack<Vertex> stack = topologicalOrdering.getStack();

		for (int i = 0; i < graph.size(); i++) {
			Vertex vertex = stack.pop();
			System.out.print(vertex+" - ");
		}

	}
}
