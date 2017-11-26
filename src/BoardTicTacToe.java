import java.util.Arrays;

public class BoardTicTacToe {

	final char[][] ticTacToe = new char[3][3];
	char square = ' ';
	char x = 'X';
	char o = 'O';

	public BoardTicTacToe() {
		for (int i = 0; i < ticTacToe.length; i++) {
			Arrays.fill(ticTacToe[i], square);
		}
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
			ticTacToe[numLine - 1][numColumn - 1] = x;
		} else {
			play = false;
		}

		return play;

	}

	public boolean playO(int numLine, int numColumn) {
		boolean play = true;

		if (check(numLine, numColumn) == square) {
			ticTacToe[numLine - 1][numColumn - 1] = o;
		} else {
			play = false;
		}

		return play;

	}

	public boolean checkWinner() {
		boolean winner = false;

		for (int i = 0; i < 2 && !winner; i++) {
			if (ticTacToe[i][0] == ticTacToe[i][1]) {
				if (ticTacToe[i][0] == ticTacToe[i][2]) {

					winner = true;
				}
			}
		}
		for (int j = 0; j < 2 && !winner; j++) {
			if (ticTacToe[0][j] == ticTacToe[1][j]) {
				if (ticTacToe[0][j] == ticTacToe[2][j]) {

					winner = true;
				}
			}
		}
		if (ticTacToe[0][0] == ticTacToe[1][1] && !winner) {
			if (ticTacToe[0][0] == ticTacToe[2][2]) {
				winner = true;

			}
		}

		if (ticTacToe[3][1] == ticTacToe[2][2] && !winner) {
			if (ticTacToe[3][1] == ticTacToe[1][3]) {
				winner = true;

			}
		}

		return winner;

	}

	public boolean checkSquare() {
		boolean square = false;

		while (square == false) {
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					if (ticTacToe[i][j] == ' ')
						square = true;
				}
			}
		}

		return square;
	}

	public boolean winnerX() {
		boolean xWin = false;

		for (int i = 0; i < 2; i++) {
			if (ticTacToe[i][0] == x) {
				if (ticTacToe[i][0] == ticTacToe[i][1]) {
					if (ticTacToe[i][0] == ticTacToe[i][2]) {
						xWin = true;

					}
				}
			}
		}
		for (int j = 0; j < 2 && !xWin; j++) {
			if (ticTacToe[0][j] == x) {
				if (ticTacToe[0][j] == ticTacToe[1][j]) {
					if (ticTacToe[0][j] == ticTacToe[2][j]) {

						xWin = true;
					}
				}
			}
		}
		if (ticTacToe[0][0] == x && !xWin) {
			if (ticTacToe[0][0] == ticTacToe[1][1]) {
				if (ticTacToe[0][0] == ticTacToe[2][2]) {
					xWin = true;
				}
			}
		}
		if (ticTacToe[3][1] == x) {
			if (ticTacToe[3][1] == ticTacToe[2][2]) {
				if (ticTacToe[3][1] == ticTacToe[1][3]) {
					xWin = true;
				}
			}
		}

		return xWin;
	}

	public boolean winnerO() {
		boolean oWin = false;

		for (int i = 0; i < 2; i++) {
			if (ticTacToe[i][0] == x) {
				if (ticTacToe[i][0] == ticTacToe[i][1]) {
					if (ticTacToe[i][0] == ticTacToe[i][2]) {
						oWin = true;

					}
				}
			}
		}
		for (int j = 0; j < 2 && !oWin; j++) {
			if (ticTacToe[0][j] == x) {
				if (ticTacToe[0][j] == ticTacToe[1][j]) {
					if (ticTacToe[0][j] == ticTacToe[2][j]) {
						oWin = true;
					}
				}
			}
		}
		if (ticTacToe[0][0] == x && !oWin) {
			if (ticTacToe[0][0] == ticTacToe[1][1]) {
				if (ticTacToe[0][0] == ticTacToe[2][2]) {
					oWin = true;
				}
			}
		}
		if (ticTacToe[3][1] == x) {
			if (ticTacToe[3][1] == ticTacToe[2][2]) {
				if (ticTacToe[3][1] == ticTacToe[1][3]) {
					oWin = true;
				}
			}
		}

		return oWin;
	}
}
