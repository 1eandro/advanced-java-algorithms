package MazeSolver;

import java.util.Scanner;

public class FileReader {

	private String[][] map;
	private String filename;
	private int numOfRows;
	private int numOfColumns;
	private int startPositionCol; // the position of the S colIndex
	private int startPositionRow; // the position of the E rowIndex

	public FileReader(String fileName, int numOfRows, int numOfColumns) {
		this.filename = fileName;
		this.numOfColumns = numOfColumns;
		this.numOfRows = numOfRows;
		this.map = new String[numOfRows][numOfColumns];
	}

	public void parseFile() {

		try {

			// Scanner scanner = new Scanner(new File(this.filename));
			Scanner scanner = new Scanner(getClass().getResourceAsStream(filename));

			for (int i = 0; i < this.numOfRows; i++) {
				for (int j = 0; j < this.numOfColumns; j++) {

					map[i][j] = scanner.next("[^ ]"); // read the next valid character

					if (map[i][j].equals("S")) { // we found the 'S' so save the col and row indexes!
						startPositionRow = i;
						startPositionCol = j;
						System.out.println("The start position has been found: [" + i + "][" + j + "]");
					}
				}

			}

			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getStartPositionCol() {
		return startPositionCol;
	}

	public int getStartPositionRow() {
		return startPositionRow;
	}

	public String[][] getMap() {
		return this.map;
	}

	@Override
	public String toString() {

		String strMap = "";

		for (int i = 0; i < this.numOfRows; i++) {
			for (int j = 0; j < this.numOfColumns; j++) {
				strMap += this.map[i][j] + " ";
			}
			strMap += "\n";
		}

		return strMap;
	}
}
