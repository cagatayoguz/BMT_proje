package app;

import javax.swing.*;

public class KampusHaritasiGUI extends JFrame {

    public KampusHaritasiGUI() {

        setTitle("Kampüs Haritası");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        // İstersen yolu sonra değiştirirsin
        label.setIcon(new ImageIcon("C:\\Users\\cagat\\Downloads\\kampus_haritasi.png"));

        add(label);
        setVisible(true);
    }
}

