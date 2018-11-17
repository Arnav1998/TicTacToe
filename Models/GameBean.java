package models;

public class GameBean {
	
//Your game bean will be responsible for managing all aspects of your tic-tac-toe game. 
//It will record all moves by all players, keep track of the current player, determine if a move is valid, 
//and report on whether the game is over, who the winner is, or if there is a draw.
	
	private char[][] gameArray;
	private int moveCount;
	
	public GameBean() {
		
		this.gameArray = new char[3][3];
		
		for (int r = 0; r < this.gameArray.length; r++) {
			for (int c = 0; c < this.gameArray[r].length; c++) {
				this.gameArray[r][c] = '-';
			}
		}
		
		this.moveCount = 0;
		
	}
	
	public void move(int moveRow, int moveCol) {
		
		if (isValidMove(moveRow, moveCol)) {
			
			this.moveCount++;
			
			if (moveCount%2 == 0) {
				this.gameArray[moveRow][moveCol] = 'O';
			} else {
				this.gameArray[moveRow][moveCol] = 'X';
			}
			
		} 
		
		for (int r = 0; r < this.gameArray.length; r++) {
			for (int c = 0; c < this.gameArray[r].length; c++) {
				System.out.print(gameArray[r][c]+" ");
			}
			System.out.println();
		}
	
		//return gameWinningStatus();
			
		
	}
	
	private boolean isValidMove(int moveRow, int moveCol) {
		
		if (this.gameArray[moveRow][moveCol]=='-') 
			return true;
		else
			return false;
		
	}
	
	public boolean getGameWinningStatus() {
		
		if (gameArray[0][0] == gameArray[0][1] && gameArray[0][0] == gameArray[0][2] && gameArray[0][0] != '-') {
			return true;
		} else if (gameArray[1][0] == gameArray[1][1] && gameArray[1][0] == gameArray[1][2] && gameArray[1][0] != '-') {
			return true;
		} else if (gameArray[2][0] == gameArray[2][1] && gameArray[2][0] == gameArray[2][2] && gameArray[2][0] != '-') {
			return true;
		} else if (gameArray[0][0] == gameArray[1][0] && gameArray[0][0] == gameArray[2][0] && gameArray[0][0] != '-') {
			return true;
		} else if (gameArray[0][1] == gameArray[1][1] && gameArray[0][1] == gameArray[2][1] && gameArray[0][1] != '-') {
			return true;
		} else if (gameArray[0][2] == gameArray[1][2] && gameArray[0][2] == gameArray[2][2] && gameArray[0][2] != '-') {
			return true;
		} else if (gameArray[0][0] == gameArray[1][1] && gameArray[0][0] == gameArray[2][2] && gameArray[0][0] != '-') {
			return true;
		} else if (gameArray[0][2] == gameArray[1][1] && gameArray[0][2] == gameArray[2][0] && gameArray[0][2] != '-') {
			return true;
		} else {
			return false;
		}
		
	}
	
	public char[][] getGameArray() {
		
		return gameArray;
		
	}

	public char getTurnInfo() {
		if (moveCount%2==0) 
			return 'O';
		else
			return'X';
	}
	
}
