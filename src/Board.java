import java.util.Arrays;

public class Board {
    String[][] game_board = new String[8][8];

    // move a piece on the board, x1y1 = piece, x2y2 = destination
    public void move_piece(int x1, int y1, int x2, int y2) {

        String p = game_board[x1][y1];
        game_board[x2][y2] = p;
        game_board[x1][y1] = "x";

    }

    // Print on screen the current board
    public void display_board() {
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(game_board[i]));
        }
        System.out.println("");
    }
}
