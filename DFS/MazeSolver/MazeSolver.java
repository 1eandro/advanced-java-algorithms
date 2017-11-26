package DFS.MazeSolver;

import java.util.Scanner;

public class MazeSolver {

	private String[][] mazeMap;
	private boolean[][] visited;
	private int startPositionRow;
	private int startPositionCol;
	
	Scanner scanner = new Scanner(System.in);

	public MazeSolver(String[][] mazeMap, int startPositionRow, int startPositionCol) {
		this.mazeMap = mazeMap;
		this.visited = new boolean[mazeMap.length][mazeMap.length];
		this.startPositionRow = startPositionRow;
		this.startPositionCol = startPositionCol;
	}

	public void findWayOut() {

		try {
			dfs(startPositionRow, startPositionCol);
			System.out.println("No solution found...");
		} catch (RuntimeException e) {
			System.out.println("Route found to exit!!!");
		}

	}

	private void dfs(int rowIndex, int colIndex) {
		
		// waits for a ENTER key of the user, so it prints out the current position so the user can track where the algorithm is
		scanner.nextLine();

		int hash = (int) Math.floor(Math.random() * 89999 + 10000);

		System.out.println("\n-------------------------------------------------------------------- hash:" + hash + "\n"
				+ "Visiting [" + rowIndex + "][" + colIndex + "], which is: `" + mazeMap[rowIndex][colIndex] + "`");

		showVisiting(rowIndex, colIndex);

		if (this.mazeMap[rowIndex][colIndex].equals("E")) {
			throw new RuntimeException(); // if we have found "E" we break out the iteration with an exception
		}

		int endOfMap = this.mazeMap.length - 1;

		if (visited[rowIndex][colIndex]) { // if it has been already visited, we just skip it
			System.out.println("[" + rowIndex + "][" + colIndex + "] already visited");
			return;
		} else if (rowIndex < 0 || rowIndex >= endOfMap) { // out of map
			System.out.println("[" + rowIndex + "][" + colIndex + "] row out of map");
			return;
		} else if (colIndex < 0 || colIndex >= endOfMap) { // out of map
			System.out.println("[" + rowIndex + "][" + colIndex + "] col out of map");
			return;
		} else if (this.mazeMap[rowIndex][colIndex].equals(".")) { // if it is a wall we cannot go in that direction
			System.out.println("[" + rowIndex + "][" + colIndex + "] is a DOT");
			return;
		} else {
			System.out.println("[" + rowIndex + "][" + colIndex + "] is being setted to TRUE");
			this.visited[rowIndex][colIndex] = true;

			System.out.println("_____going down of hash: " + hash);
			dfs(rowIndex + 1, colIndex); // going down

			System.out.println("_____going right of hash: " + hash);
			dfs(rowIndex, colIndex + 1); // going right

			System.out.println("_____going left of hash: " + hash);
			dfs(rowIndex, colIndex - 1); // going left

			System.out.println("_____going up of hash: " + hash);
			dfs(rowIndex - 1, colIndex); // going up
		}

	}

	private void showVisiting(int rowIndex, int colIndex) {

		String[][] auxMap = cloneArray(this.mazeMap);
		auxMap[rowIndex][colIndex] = "@";

		String strMap = "";

		for (int i = 0; i < auxMap.length; i++) {
			for (int j = 0; j < auxMap.length; j++) {
				strMap += auxMap[i][j] + " ";
			}
			strMap += "\n";
		}

		// strMap += "\n\n";

		System.out.println(strMap);
	}

	private String[][] cloneArray(String[][] arrayToBeCloned) {
		String[][] brandNewArray = new String[arrayToBeCloned.length][arrayToBeCloned.length];

		for (int i = 0; i < arrayToBeCloned.length; i++) {
			for (int j = 0; j < arrayToBeCloned.length; j++) {
				brandNewArray[i][j] = String.valueOf(arrayToBeCloned[i][j]);
			}
		}

		return brandNewArray;

	}

}
