import java.util.Arrays;

public class TicTacToe {

	final char[][] ticTacToe = new char[3][3];
	char square = ' ';
	char x = 'X';
	char o = 'O';

	public TicTacToe() {
		Arrays.fill(ticTacToe, ' ');
	}

	public void setSquare(char character) {
		this.square = character;
	}

	public void setX(char character) {
		this.x = character;
	}

	public void setO(char character) {
		this.o = character;
	}

	public char check(int numLine, int numColumn) {
		return ticTacToe[numLine - 1][numColumn - 1];
	}

	public boolean playX(int numLine, int numColumn) {
		boolean play = true;

		if (check(numLine, numColumn) == square) {
			play = false;
		} else {
			ticTacToe[numLine][numColumn] = x;
		}

		return play;

	}

	public boolean playO(int numLine, int numColumn) {
		boolean play = true;

		if (check(numLine, numColumn) == square) {
			play = false;
		} else {
			ticTacToe[numLine][numColumn] = o;
		}

		return play;

	}

	public boolean checkWinner() {
		boolean winner = false;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (ticTacToe[i][j] == ticTacToe[i][j + 1]) {
				}
			}

		}
		return winner;
	}
}