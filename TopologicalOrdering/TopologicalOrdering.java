package TopologicalOrdering;

import java.util.Stack;

public class TopologicalOrdering {

	private Stack<Vertex> stack;

	public TopologicalOrdering() {
		this.stack = new Stack<>();
	}

	public void dfs(Vertex vertex) {
		
		System.out.println("\n-> called "+vertex);
		vertex.setVisited(true);
		
		if(vertex.getNeighbourList().isEmpty()) {
			System.out.println("  .."+vertex+" do not have neighbours");
		}

		for (Vertex v : vertex.getNeighbourList()) {
			System.out.println("  ....getting neighbours of "+vertex);
			if (!v.isVisited()) {
				System.out.println("  ......diving at " + vertex);
				dfs(v);
			}else {
				System.out.println("  ........"+vertex+" is visited");
			}

			if (v.getNeighbourList().isEmpty()) {
				System.out.println("  .........." + v + " do not have neighbour");
			}
		}

		System.out.println("  ............pushing " + vertex);
		stack.push(vertex);
	}

	public Stack<Vertex> getStack() {
		return this.stack;
	}

}
