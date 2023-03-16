import java.util.ArrayList;

public class Game {
    String active_color = "w";
    int fullmove = 0;
    int halfmove = 0;
    boolean en_passant = false;
    boolean castling_possible_white = true;
    boolean castling_possible_black = true;
    ArrayList<String> piece_cemetery = new ArrayList<String>();
}
