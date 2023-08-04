import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI3 extends JFrame {

    private JPanel[][] gridPanels;

    public GUI3() {
        setTitle("Grid Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        gridPanels = new JPanel[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel panel = new JPanel();
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.setBackground(Color.WHITE);

                final int rowIdx = row;
                final int colIdx = col;

                panel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        squareClicked(rowIdx, colIdx);
                    }
                });

                add(panel);
                gridPanels[row][col] = panel;
            }
        }

        pack();
        setLocationRelativeTo(null);
    }

    private void squareClicked(int row, int col) {
        System.out.println("Square clicked: Row " + row + ", Column " + col);
        // You can perform actions based on the clicked square's row and column here
    }


}


