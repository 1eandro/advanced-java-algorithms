package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {
	
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


		// 0
		v0.addNeighbour(v1);
 		// 1
		v1.addNeighbour(v2);
		v1.addNeighbour(v4);
		// 2 
		v2.addNeighbour(v3);
		v2.addNeighbour(v5);
		
		// 3 
		v3.addNeighbour(v19);
		v3.addNeighbour(v18);
		
		// 4 
		v4.addNeighbour(v17);
		
		// 5 
		v5.addNeighbour(v20);
		
		// 6 
		v6.addNeighbour(v7);
		v6.addNeighbour(v9);
		v6.addNeighbour(v12);
		v6.addNeighbour(v14);
		
		// 7 
		v7.addNeighbour(v8);
		
		// 8 
		// 8 do not have neighbour
		
		// 9 
		v9.addNeighbour(v10);
		v9.addNeighbour(v11);
		
		// 10
		v10.addNeighbour(v16);
		v10.addNeighbour(v13);
		
		// 11
		v11.addNeighbour(v8);
		
		// 12
		v12.addNeighbour(v9);
		v12.addNeighbour(v14);
		v12.addNeighbour(v15);
		
		// 13
		// 13 do not have neighbour
		
		// 14
		v14.addNeighbour(v15);
		
		// 15
		v15.addNeighbour(v10);
		
		// 16
		v16.addNeighbour(v13);
		
		// 17
		// 17 do not have neighbour
		
		// 18
		v18.addNeighbour(v20);
		
		// 19
		v19.addNeighbour(v18);
		
		// 20
		// 20 do not have neighbour
		
		
		List<Vertex> lstVertex = new ArrayList<>();
		
		lstVertex.add(v0);
		lstVertex.add(v1);
		lstVertex.add(v2);
		lstVertex.add(v3);
		lstVertex.add(v4);
		lstVertex.add(v5);
		lstVertex.add(v6);
		lstVertex.add(v7);
		lstVertex.add(v8);
		lstVertex.add(v9);
		lstVertex.add(v10);
		lstVertex.add(v11);
		lstVertex.add(v12);
		lstVertex.add(v13);
		lstVertex.add(v14);
		lstVertex.add(v15);
		lstVertex.add(v16);
		lstVertex.add(v17);
		lstVertex.add(v18);
		lstVertex.add(v19);
		lstVertex.add(v20);
		
				
		DFS dfs = new DFS();
		dfs.dfs(lstVertex);
	}                  
}
