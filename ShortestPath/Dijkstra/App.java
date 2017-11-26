package ShortestPath.Dijkstra;

public class App {
	
	public static void main(String[] args) {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		Vertex vertexG = new Vertex("G");
		Vertex vertexH = new Vertex("H");
		Vertex vertexI = new Vertex("I");
		Vertex vertexJ = new Vertex("J");
		Vertex vertexK = new Vertex("K");
		Vertex vertexL = new Vertex("L");
		Vertex vertexM = new Vertex("M");
		Vertex vertexN = new Vertex("N");
		Vertex vertexO = new Vertex("O");
		
		vertexA.addNeighbour(new Edge(3, vertexA, vertexE));
		vertexA.addNeighbour(new Edge(1, vertexA, vertexC));
		vertexA.addNeighbour(new Edge(5, vertexA, vertexB));

		vertexB.addNeighbour(new Edge(1, vertexB, vertexD));
		vertexB.addNeighbour(new Edge(1, vertexB, vertexH));

		vertexC.addNeighbour(new Edge(3, vertexC, vertexD));
		vertexC.addNeighbour(new Edge(3, vertexC, vertexF));

		vertexD.addNeighbour(new Edge(3, vertexD, vertexI));
		vertexD.addNeighbour(new Edge(5, vertexD, vertexG));

		vertexE.addNeighbour(new Edge(7, vertexE, vertexF));

		vertexF.addNeighbour(new Edge(1, vertexF, vertexI));
		vertexF.addNeighbour(new Edge(1, vertexF, vertexL));

		vertexG.addNeighbour(new Edge(3, vertexG, vertexK));

		vertexH.addNeighbour(new Edge(3, vertexH, vertexG));
		vertexH.addNeighbour(new Edge(7, vertexH, vertexJ));

		vertexI.addNeighbour(new Edge(5, vertexI, vertexM));

		vertexJ.addNeighbour(new Edge(5, vertexJ, vertexK));
		vertexJ.addNeighbour(new Edge(3, vertexJ, vertexN));

		vertexK.addNeighbour(new Edge(1, vertexK, vertexN));

		vertexL.addNeighbour(new Edge(3, vertexL, vertexI));
		vertexL.addNeighbour(new Edge(5, vertexL, vertexM));

		vertexM.addNeighbour(new Edge(7, vertexM, vertexO));
		vertexM.addNeighbour(new Edge(4, vertexM, vertexK));

		vertexN.addNeighbour(new Edge(1, vertexN, vertexO));

		//vertexO do not have a edge to
		
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
		dijkstra.computePaths(vertexA);
		
		System.out.println(dijkstra.getShortestPathTo(vertexO));
		
	}

	
}
