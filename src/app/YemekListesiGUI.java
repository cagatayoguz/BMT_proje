package app;

import javax.swing.*;

public class YemekListesiGUI extends JFrame {

    public YemekListesiGUI() {

        setTitle("Yemek Listesi");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setIcon(new ImageIcon("C:\\Users\\cagat\\Downloads\\yemek listesi.png"));

        add(label);
        setVisible(true);
    }
}
