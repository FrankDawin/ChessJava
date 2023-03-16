import java.util.ArrayList;

public class Piece {
    int value_pawn = 1;
    int value_knight = 3;
    int value_bishop = 3;
    int value_rook = 5;
    int value_queen = 9;
    int value_king = 50;

    String pawn = "p";
    String knight = "n";
    String bishop = "b";
    String rook = "r";
    String queen = "q";
    String king = "k";

    int[][] diagonal = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int[][] horizontal = {{1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
    int[][] knight_move = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

    // Return the move the king can make as arraylist, take in a position of the king as 2 int
    public ArrayList<String> move_king(int x, int y, String[][] game_board) {

        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }

        ArrayList<String> moves = new ArrayList<String>();

        for (int b = 0; b < diagonal.length; b++) {
            int i = x;  // reset value of x
            int j = y;

            // assert same color cannot eat each other
            if (color_marker == 1 && game_board[i][j] != "x") {
                if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                    break;
                }
            } else if (color_marker == 0 && game_board[i][j] != "x") {
                if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                    break;
                }
            }

            String coor1 = make_string(x + diagonal[i][0], y + diagonal[i][1]);
            moves.add(coor1);
        }

        for (int a = 0; a < horizontal.length; a++) {
            int i = x;  // reset value of x
            int j = y;
            // assert same color cannot eat each other
            if (color_marker == 1 && game_board[i][j] != "x") {
                if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                    break;
                }
            } else if (color_marker == 0 && game_board[i][j] != "x") {
                if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                    break;
                }
            }

            String coor2 = make_string(x + horizontal[a][0], y + horizontal[a][1]);
            moves.add(coor2);
        }
        return moves;
    }

    // Return the move the rook can make as arraylist, take in a position of the piece as 2 int
    public ArrayList<String> move_rook(int x, int y, String[][] game_board) {

        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }

        ArrayList<String> moves = new ArrayList<String>();

        // for each way the rook can move
        for (int a = 0; a < horizontal.length; a++) {
            int i = x;  // reset value of x
            int j = y; // reset value of y

            while ((i > 0) && (i < 7) && (j > 0) && (j < 7)) {

                // assert same color cannot eat each other
                if (color_marker == 1 && game_board[i][j] != "x") {
                    if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                } else if (color_marker == 0 && game_board[i][j] != "x") {
                    if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                }

                String coor2 = make_string(i + horizontal[a][0], j + horizontal[a][1]);
                moves.add(coor2);
                i = i + horizontal[a][0];
                j = j + horizontal[a][1];

                }


            }

        return moves;
    }

    // Return the move the bishop can make as arraylist, take in a position of the piece as 2 int
    public ArrayList<String> move_bishop(int x, int y, String[][] game_board) {

        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }

        ArrayList<String> moves = new ArrayList<String>();

        // for each way the rook can move
        for (int a = 0; a < diagonal.length; a++) {
            int i = x;  // reset value of x
            int j = y; // reset value of y

            while ((i > 0) && (i < 7) && (j > 0) && (j < 7)) {

                // assert same color cannot eat each other
                if (color_marker == 1 && game_board[i][j] != "x") {
                    if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                } else if (color_marker == 0 && game_board[i][j] != "x") {
                    if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                }

                String coor2 = make_string(i + diagonal[a][0], j + diagonal[a][1]);
                moves.add(coor2);
                i = i + diagonal[a][0];
                j = j + diagonal[a][1];

            }

        }

        return moves;
    }

    // Return the move the knight can make as arraylist, take in a position of the piece as 2 int
    public ArrayList<String> move_knight(int x, int y, String[][] game_board) {

        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }

        ArrayList<String> moves = new ArrayList<String>();

        for (int a = 0; a < knight_move.length; a++) {

            int i = x;  // reset value of x
            int j = y; // reset value of y

            // assert same color cannot eat each other
            if (color_marker == 1 && game_board[i][j] != "x") {
                if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                    break;
                }
            } else if (color_marker == 0 && game_board[i][j] != "x") {
                if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                    break;
                }
            }

            String coor2 = make_string(x + knight_move[a][0], y + knight_move[a][1]);
            moves.add(coor2);

        }

        return moves;
    }

    // Return the move the queen can make as arraylist, take in a position of the piece as 2 int
    public ArrayList<String> move_queen(int x, int y, String[][] game_board) {
        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }
        ArrayList<String> moves = new ArrayList<String>();

        // for each way the rook can move
        for (int a = 0; a < horizontal.length; a++) {
            int i = x;  // reset value of x
            int j = y; // reset value of y

            while ((i > 0) && (i < 7) && (j > 0) && (j < 7)) {

                // assert same color cannot eat each other
                if (color_marker == 1 && game_board[i][j] != "x") {
                    if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                } else if (color_marker == 0 && game_board[i][j] != "x") {
                    if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                }

                String coor2 = make_string(i + horizontal[a][0], j + horizontal[a][1]);
                moves.add(coor2);
                i = i + horizontal[a][0];
                j = j + horizontal[a][1];

            }


        }

        // for each way the rook can move
        for (int a = 0; a < diagonal.length; a++) {
            int i = x;  // reset value of x
            int j = y; // reset value of y

            while ((i > 0) && (i < 7) && (j > 0) && (j < 7)) {

                // assert same color cannot eat each other
                if (color_marker == 1 && game_board[i][j] != "x") {
                    if (Character.isUpperCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                } else if (color_marker == 0 && game_board[i][j] != "x") {
                    if (Character.isLowerCase(game_board[i][j].charAt(0))) {
                        break;
                    }
                }

                String coor2 = make_string(i + diagonal[a][0], j + diagonal[a][1]);
                moves.add(coor2);
                i = i + diagonal[a][0];
                j = j + diagonal[a][1];

            }

        }

        return moves;
    }

    // Return the move the pawn can make as arraylist, take in a position of the king as 2 int
    public ArrayList<String> move_pawn(int x, int y, String[][] game_board) {
        int color_marker = 0; // 0 is white, 1 is black

        if (Character.isLowerCase(game_board[x][y].charAt(0))) {
            color_marker = 1;
        }
        ArrayList<String> moves = new ArrayList<String>();

        for (int a = 0; a < horizontal.length; a++) {
            String coor2 = make_string(x + horizontal[a][0], y + horizontal[a][1]);
            moves.add(coor2);
        }
        return moves;
    }

    public String make_string(int x, int y) {
        String answer = x + " " + y;
        return answer;
    }
}



