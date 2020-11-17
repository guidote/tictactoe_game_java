import java.util.Scanner;

public class TicTacToe_Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean game = true;
		int[] taken = {0,0,0,0,0,0,0,0,0};
		char[][] gameboard = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		printgameboard(gameboard);
		
		while(game = true) {
		System.out.print("Please input a position to place a piece player 1 (1-9): ");
		int input = in.nextInt();
		for (int i = 0; i < taken.length; i++)
			if(taken[i] == input) {
				System.out.print("Spot is taken! Input another position: ");
				input = in.nextInt();
			}
		play(gameboard, input, taken, "player1");
		
		System.out.print("Please input a position to place a piece player 2 (1-9): ");
		input = in.nextInt();
		for (int i = 0; i < taken.length; i++)
			if(taken[i] == input) {
				System.out.print("Spot is taken! Input another position: ");
				input = in.nextInt();
			}
		play(gameboard, input, taken, "player2");
		
	}
		
	}
	
	public static void printgameboard(char[][] gameboard) {
		for (int i = 0; i <= 4; i++)
			System.out.println(gameboard[i]);
	}
	
	public static void play(char[][] gameboard, int position, int[] taken, String player) {
		char piece;
		if (player.equals("player1"))
				piece = 'X';
		else
			piece = 'O';
		
		switch(position) {
		case 1:
			gameboard[0][0] = piece;
			break;
		case 2:
			gameboard[0][2] = piece;
			break;
		case 3:
			gameboard[0][4] = piece;
			break;
		case 4:
			gameboard[2][0] = piece;
			break;
		case 5:
			gameboard[2][2] = piece;
			break;
		case 6:
			gameboard[2][4] = piece;
			break;
		case 7:
			gameboard[4][0] = piece;
			break;
		case 8:
			gameboard[4][2] = piece;
			break;
		case 9:
			gameboard[4][4] = piece;
			break;
		}
		
		taken[position - 1] = position;
		printgameboard(gameboard);
	}
	
	public static void win(char[][] gameboard) {
		if ((gameboard[0][0] == gameboard[0][2]) && (gameboard[0][2] == gameboard[0][4])) {
			if (gameboard[0][0] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
		}
	}
	
}


