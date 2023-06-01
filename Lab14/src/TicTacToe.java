import java.util.*;

public class TicTacToe {
    public static int win(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'X') ||
                    (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == 'X')) {
                return 1;
            }
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'O') ||
                    (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == 'O')) {
                return 2;
            }
        }
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'X')) {
            return 1;
        }
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'O')) {
            return 2;
        }
        boolean isFilled = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ('X' != board[i][j] && 'O' != board[i][j]) {
                    isFilled = false;
                    break;
                }
            }
        }
        if (isFilled) {
            return 3;
        }
        return 0;
    }
    public static void placeOnBoard(char[][] board, char x, int y, char symbol) {
        if (Character.toUpperCase(x) == 'A') {
            board[y-1][0] = symbol;
        } else if (Character.toUpperCase(x) == 'B') {
            board[y-1][1] = symbol;
        } else {
            board[y-1][2] = symbol;
        }
    }
    public static void askUser(char[][] board, boolean whose) {
        System.out.print("Enter a coordinate to place an ");
        char x;
        int y;
        if (!whose) {
            System.out.print("X, space-separated: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.next().charAt(0);
            y = scanner.nextInt();
            placeOnBoard(board, x, y, 'X');
        } else {
            System.out.print("O, space-separated: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.next().charAt(0);
            y = scanner.nextInt();
            placeOnBoard(board, x, y, 'O');
        }
    }
    public static void showBoard(char[][] board) {
        System.out.println("\n+-A-+-B-+-C-+\n" +
                "1 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |\n" +
                "+---+---+---+\n" +
                "2 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |\n" +
                "+---+---+---+\n" +
                "3 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |\n" +
                "+---+---+---+\n");
    }
    public static void main(String[] args) {
        boolean turn = false;
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        showBoard(board);
        while (true) {
            askUser(board, turn);
            showBoard(board);
            int result = win(board);
            if (result == 1) {
                System.out.println("X wins!");
                break;
            } else if (result == 2) {
                System.out.println("O wins!");
                break;
            } else if (result == 3) {
                System.out.println("Tie!");
                break;
            }
            turn = !turn;
        }
    }
}
