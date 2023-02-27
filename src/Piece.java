import java.util.ArrayList;

public class Piece {
    int value_pawn = 1;
    int value_knight = 3;
    int value_bishop = 3;
    int value_rook = 5;
    int value_queen = 9;

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
    public ArrayList<String> move_king(int x, int y) {

        ArrayList<String> moves = new ArrayList<String>();

        for (int i = 0; i < diagonal.length; i++) {
            String coor1 = make_string(x + diagonal[i][0], y + diagonal[i][1]);
            moves.add(coor1);

        for (int a = 0; a < horizontal.length; a++) {
            String coor2 = make_string(x + horizontal[a][0], y + horizontal[a][1]);
            moves.add(coor2);

        }


        }
        return moves;
    }

    // Return the move the rook can make as arraylist, take in a position of the piece as 2 int
    public ArrayList<String> move_rook(int x, int y) {

        ArrayList<String> moves = new ArrayList<String>();

        for (int a = 0; a < horizontal.length; a++) {
            int count = 0;
            int i = x;
            int j = y;

            while (count != 7) {
                String coor2 = make_string(i + horizontal[a][0], j + horizontal[a][1]);
                moves.add(coor2);
                i = i + horizontal[a][0];
                j = j + horizontal[a][1];
                count ++;

            }

        }

        return moves;
    }



    public String make_string(int x, int y) {
        String answer = x + " " + y;
        return answer;
    }

}

