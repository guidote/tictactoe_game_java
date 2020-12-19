import java.util.Scanner;

public class TicTacToe_Game {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//boolean true when there is no winner
		boolean win = false;
		//array to keep track of which spots are taken
		int[] taken = {0,0,0,0,0,0,0,0,0};
		//set up game board, 2d char array
		char[][] gameboard = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		printgameboard(gameboard);

		while(win != true){
			System.out.print("Please input a position to place a piece player 1 (1-9): ");
			int input = in.nextInt();
			for (int i = 0; i < taken.length; i++)
				if(taken[i] == input) {
					System.out.print("Spot is taken! Input another position: ");
					input = in.nextInt();
			}
			play(gameboard, input, taken, "player1");
			win = win(gameboard);
			if(win == true)
				break;
		
			System.out.print("Please input a position to place a piece player 2 (1-9): ");
			input = in.nextInt();
			for (int i = 0; i < taken.length; i++)
				if(taken[i] == input) {
					System.out.print("Spot is taken! Input another position: ");
					input = in.nextInt();
			}
			play(gameboard, input, taken, "player2");
			win = win(gameboard);
		}
		in.close();
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
	
	public static boolean win(char[][] gameboard) {
		//first row win
		if (((gameboard[0][0] == gameboard[0][2]) && (gameboard[0][2] == gameboard[0][4])) && (gameboard[0][0] != ' ')) {
			if (gameboard[0][0] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//second row win
		else if ((gameboard[2][0] == gameboard[2][2]) && (gameboard[2][2] == gameboard[2][4]) && (gameboard[2][2] != ' ')) {
			if (gameboard[2][2] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//third row win
		else if ((gameboard[4][0] == gameboard[4][2]) && (gameboard[4][2] == gameboard[4][4]) && (gameboard[4][4] != ' ')) {
			if (gameboard[4][4] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//first column win
		if ((gameboard[0][0] == gameboard[2][0]) && (gameboard[2][0] == gameboard[4][0]) && (gameboard[0][0] != ' ')) {
			if (gameboard[0][0] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//second column win
		else if ((gameboard[0][2] == gameboard[2][2]) && (gameboard[2][2] == gameboard[4][2]) && (gameboard[2][2] != ' ')) {
			if (gameboard[2][2] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//third column win
		else if ((gameboard[0][4] == gameboard[2][4]) && (gameboard[2][4] == gameboard[4][4]) && (gameboard[4][4] != ' ')) {
			if (gameboard[4][4] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//downward diagonal win
		else if ((gameboard[0][0] == gameboard[2][2]) && (gameboard[2][2] == gameboard[4][4]) && (gameboard[2][2] != ' ')) {
			if (gameboard[2][2] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		//upward diagonal win
		else if ((gameboard[0][4] == gameboard[2][2]) && (gameboard[2][2] == gameboard[4][0]) && (gameboard[2][2] != ' ')) {
			if (gameboard[2][2] == 'X')
				System.out.println("The winner is player 1 ! Congradulations !");
			else
				System.out.println("The winner is player 2 ! Congradulations !");
			return true;
		}
		else 
			return false;
	}
	
}


