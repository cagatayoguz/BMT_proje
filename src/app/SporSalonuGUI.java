package app;

import javax.swing.*;
import java.awt.*;

public class SporSalonuGUI extends JFrame {

    public SporSalonuGUI() {

        setTitle("Spor Salonu");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        JButton saatlerBtn = new JButton("Çalışma Saatleri");
        JButton uyelikBtn = new JButton("Aylık Üyelik");

        saatlerBtn.addActionListener(e -> new SporSalonuSaatlerGUI());
        uyelikBtn.addActionListener(e -> new SporSalonuUyelikGUI());

        panel.add(saatlerBtn);
        panel.add(uyelikBtn);

        add(panel);
        setVisible(true);
    }
}
