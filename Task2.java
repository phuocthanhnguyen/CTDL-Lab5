
public class Task2 {
	private static final char EMPTY = ' ';
	private char[][] board;

	    public Task2(int size) {
	        board = new char[size][size];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                board[i][j] = EMPTY;
	            }
	        }
	    }

	    public boolean checkRows() {
	        char player = board[0][0];
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 1; j < board[i].length; j++) {
	                if (board[i][j] != player) {
	                    break;
	                }
	                if (j == board[i].length - 1) {
	                    return true;
	                }
	            }
	            player = board[i][i + 1];
	        }
	        return false;
	    }

	    public boolean checkColumns() {
	        char player = board[0][0];
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 1; j < board[i].length; j++) {
	                if (board[j][i] != player) {
	                    break;
	                }
	                if (j == board[i].length - 1) {
	                    return true;
	                }
	            }
	            player = board[i + 1][i];
	        }
	        return false;
	    }
	    public boolean checkDiagonals() {
	        int size = board.length;
	        boolean emptyFound = false;
	        for (int i = 0; i < size; i++) {
	            if (board[i][i] == EMPTY) {
	                emptyFound = true;
	            }
	            if (emptyFound && board[i][i] != EMPTY) {
	                return false;
	            }
	        }
	        for (int i = 0; i < size; i++) {
	            if (board[i][size - i - 1] == EMPTY) {
	                emptyFound = true;
	            }
	            if (emptyFound && board[i][size - i - 1] != EMPTY) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Task2 board1 = new Task2(3);
	        System.out.println(board1.checkDiagonals());

	        board1.board[0][0] = 'X';
	        board1.board[1][1] = 'X';
	        board1.board[2][2] = 'X';
	        System.out.println(board1.checkDiagonals());

	        Task2 board2 = new Task2(3);
	        board2.board[0][0] = 'X';
	        board2.board[1][1] = 'O';
	        board2.board[2][2] = 'X';
	        System.out.println(board2.checkDiagonals());
	    }
}
