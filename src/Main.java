import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        debug3();
    }

    // Moving one piece
    public static void debug1() {
        Fen a = new Fen();
        Board b = new Board();
        b.game_board = a.Fen_to_board();
        b.display_board();
        b.move_piece(1,0,2,0);
        b.display_board();
        }

    // Make a list of move for 1 piece
    public static void debug2() {
        // Create a Fen instance
        Fen a = new Fen();

        // Create a board instance
        Board b = new Board();

        // Make the board into the current fencode
        b.game_board = a.Fen_to_board();

        // Create a Piece instance to access main value only
        Piece c = new Piece();

        // Print the starting board
        b.display_board();

        // Make a list of 1 piece possible move
        System.out.println(c.move_knight(7, 1, b.game_board));


    }

    // show a GUI
    public static void debug3() {
        GUI e = new GUI();
    }


}