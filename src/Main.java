public class Main {
    public static void main(String[] args) {
        Fen a = new Fen();
        Board b = new Board();
        b.game_board = a.Fen_to_board();
        b.display_board();
        b.move_piece(1,0,2,0);
        b.display_board();

    }
}