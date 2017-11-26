package cycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class AppBiggerGraph {
	
	
	public static void main(String[] args) {

		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		Vertex v8 = new Vertex("8");
		Vertex v9 = new Vertex("9");
		Vertex v10 = new Vertex("10");
		Vertex v11 = new Vertex("11");
		Vertex v12 = new Vertex("12");
		Vertex v13 = new Vertex("13");
		Vertex v14 = new Vertex("14");
		Vertex v15 = new Vertex("15");
		Vertex v16 = new Vertex("16");
		Vertex v17 = new Vertex("17");
		Vertex v18 = new Vertex("18");
		Vertex v19 = new Vertex("19");
		Vertex v20 = new Vertex("20");

		v0.addNeighbour(v1);
		v0.addNeighbour(v3);
		
		v1.addNeighbour(v4);

		v2.addNeighbour(v16);

		v3.addNeighbour(v4);
		v3.addNeighbour(v8);
		v3.addNeighbour(v6);
		
		v4.addNeighbour(v2);
		v4.addNeighbour(v5);

		v5.addNeighbour(v9);

		v6.addNeighbour(v10);

		v7.addNeighbour(v8);

		v8.addNeighbour(v2);
		v8.addNeighbour(v4);
		v8.addNeighbour(v10);

		v9.addNeighbour(v8);

		v10.addNeighbour(v11);

		v11.addNeighbour(v12);

		v12.addNeighbour(v8);

		v13.addNeighbour(v7);

		v14.addNeighbour(v16);
		v14.addNeighbour(v17);

		v15.addNeighbour(v20);
		v15.addNeighbour(v17);

		v16.addNeighbour(v15);

		//v17 do not have neighbour

		v18.addNeighbour(v13);

		v19.addNeighbour(v18);

		v20.addNeighbour(v19);


		

		List<Vertex> vertexList = new ArrayList<>();


		vertexList.add(v0);
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v3);
		vertexList.add(v4);
		vertexList.add(v5);
		vertexList.add(v6);
		vertexList.add(v7);
		vertexList.add(v8);
		vertexList.add(v9);
		vertexList.add(v10);
		vertexList.add(v11);
		vertexList.add(v12);
		vertexList.add(v13);
		vertexList.add(v14);
		vertexList.add(v15);
		vertexList.add(v16);
		vertexList.add(v17);
		vertexList.add(v18);
		vertexList.add(v19);
		vertexList.add(v20);

		CycleDetection cycleDetection = new CycleDetection();
		cycleDetection.detectCycle(vertexList);

	}
}
