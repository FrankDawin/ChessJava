import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessBoardGUI extends JFrame {
    private static final int BOARD_SIZE = 8;
    private JPanel chessBoardPanel;

    public ChessBoardGUI() {
        setTitle("Chess in Java");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chessBoardPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        add(chessBoardPanel);

        initializeChessBoard();

        setVisible(true);
    }

    private void initializeChessBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JPanel squarePanel = new JPanel();
                if ((row + col) % 2 == 0) {
                    squarePanel.setBackground(Color.WHITE);
                    squarePanel.drawImage("img/p.png", 0, 0, null);
                } else {
                    squarePanel.setBackground(Color.BLACK);
                }
                chessBoardPanel.add(squarePanel);
            }
        }
    }

    }

