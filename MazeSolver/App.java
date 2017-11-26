package MazeSolver;

public class App {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader("map.txt", 16, 16);
		fileReader.parseFile();
		System.out.println(fileReader);

		String[][] map = fileReader.getMap();
		int startRow = fileReader.getStartPositionRow();
		int startCol = fileReader.getStartPositionCol();

		MazeSolver mazeSolver = new MazeSolver(map, startRow, startCol);
		mazeSolver.findWayOut();
	}

}
