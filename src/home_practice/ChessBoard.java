package home_practice;

public class ChessBoard {
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE

		// outer row
		for (int row = 0; row < chessBoard.length; row++) {
			// inner column
			int column = 0;
			System.out.print(row+" - ");
			for (char letter = 'a'; letter <= 'h'; letter++) {
				System.out.print(letter+""+column+" ");
				chessBoard[row][column] = (row + 1) + "" + letter;
				column++;
			}
			System.out.println();
		}
	}
}
