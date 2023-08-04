import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI2 extends JFrame {
    private static final int BOARD_SIZE = 8;
    private JPanel chessBoardPanel;

    public GUI2() {
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
                } else {
                    squarePanel.setBackground(Color.BLACK);
                }
                chessBoardPanel.add(squarePanel);
            }
        }

    }

}

// ImageIcon icon = new ImageIcon(getClass().getResource("img/p.png"));
//                JLabel squarePanel = new JLabel(icon);






