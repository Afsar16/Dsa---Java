package Z_Projects;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
        printBoard(board);
        boolean isWon = false;
        char player = 'X';

        Scanner in = new Scanner(System.in);

        while(!isWon) {
            System.out.print("Player " + player + " enter ");
            int row = in.nextInt();
            int col = in.nextInt();
            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[0].length; j++) {
                    board[row][col] = player;
                }
            }
            isWon = checkMatch(board, player);
            if(isWon) {
                System.out.println(player+ " won");
                return;
            }else {
                if(player == 'X') {
                    player = 'O';
                }
                else player = 'X';
            }
            printBoard(board);
        }

    }

    private static boolean checkMatch(char[][] board, char player) {
        for(int row=0; row<board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for(int col=0; col<board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public  static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("|"+ board[i][j]+ "|");
            }
            System.out.println();
        }
    }
}
