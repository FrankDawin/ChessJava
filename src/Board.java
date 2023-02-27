import java.util.Arrays;

public class Board {
    String[][] game_board = new String[8][8];

    // move a piece on the board, x1y1 = piece, x2y2 = destination
    public void move_piece(int x1, int y1, int x2, int y2) {

        // If a value is more than 7 and less than 0, out of bound
        if (0 < x1 && x1 > 7 || 0 < x2 && x2 > 7 || 0 < y1 && y1 > 7 || 0 < y2 && y2 > 7) {
            System.out.println("Out_of bound move");
            return;
        }
        String p = game_board[x1][y1];
        String k = game_board[x2][y2];
        if (p != "x" && k != "x") {
            if (Character.isLowerCase(p.charAt(0)) && Character.isLowerCase(k.charAt(0)) || Character.isLowerCase(p.charAt(0)) == false && Character.isLowerCase(k.charAt(0)) == false) {
                System.out.println("Cannot eat own piece " + p + "/" + k);
                return;
            }
        }

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
