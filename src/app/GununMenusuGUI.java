package app;

import javax.swing.*;

public class GununMenusuGUI extends JFrame {

    public GununMenusuGUI() {

        setTitle("Günün Menüsü");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        // 👇 GÜNÜN MENÜSÜ SS
        label.setIcon(new ImageIcon("C:\\Users\\cagat\\Downloads\\günün menüsü.png"));

        add(label);
        setVisible(true);
    }
}
