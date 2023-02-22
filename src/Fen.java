import java.util.Arrays;
import java.util.ArrayList;

public class Fen {
    // Make the fencode with the starting value of a new chess game
    String starting_fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
    String[] splited = starting_fen.split(" ");
    String piece_placement = splited[0];
    String active_color = splited[1];
    String castling_possible = splited[2];
    String en_passant = splited[3];
    String halfmove = splited[4];
    String fullmove = splited[5];

    ArrayList<String> fen_history = new ArrayList<String>();

    // Take a fencode and return a board version String[][]
    public String[][] Fen_to_board() {
        String[][] board_updated = new String[8][8];
        String[] lines = piece_placement.split("/");
        // for each line (x)
        for (int i = 0; i < 8; i ++) {
            // counter for y in board
            int counter = 0;
            // line.length versus values necessary
            for (int y = 0; y < lines[i].length(); y++) {
                // if is a number
                if (isNumeric(String.valueOf(lines[i].charAt(y)))) {
                    // What is the value
                    int b = Character.getNumericValue(lines[i].charAt(y));
                    // loop for the amount of space
                    for (int a = 0; a < b; a += 1 ) {
                        board_updated[i][counter] = "x";
                        counter += 1;
                    }
                } else {
                    board_updated[i][counter] = String.valueOf(lines[i].charAt(y));
                    counter += 1;
                }

            }
        }

    return board_updated;

    }

    // Make the fencode given as input the current fencode of the instance
    public void update_fen(String fen_code) {
        String[] splited = fen_code.split(" ");
        String piece_placement = splited[0];
        String active_color = splited[1];
        String castling_possible = splited[2];
        String en_passant = splited[3];
        String halfmove = splited[4];
        String fullmove = splited[5];
    }

    // Verify that the string entered is numeric, for fen code
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Take a fencode and add it to history
    public void add_fen_history(String fen) {
        fen_history.add(fen);
    }

    // Take the fencode history and print it line by line
    public void print_fen_history() {
        for (int i = 0; i < fen_history.size(); i++) {
            System.out.println(fen_history.get(i));
        }
    }
}
