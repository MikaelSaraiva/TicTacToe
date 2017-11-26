import java.util.Scanner;

public class UserInteractiom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BoardTicTacToe board = new BoardTicTacToe();
		int playing = -1;
		

		while (playing != 0) {
			System.out.println("* * Wellcome for this game shit * *");
			System.out.println("");
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(" " + board.check(i + 1, j + 1) + " ");
					if (j != 2) {
						System.out.print("|");
					}
				}
				if (i != 2) {
					System.out.println("\n---+---+---");
				}
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("Press 1 for play X.");
			System.out.println("Press 2 for play O.");
			System.out.println("Press 0 for quit.");
			System.out.println("");
			System.out.print("Select: ");
			playing = input.nextInt();
			
			
		}	

		input.close();
	}

}
