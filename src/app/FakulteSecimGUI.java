package app;

import javax.swing.*;
import java.awt.*;

public class FakulteSecimGUI extends JFrame {

    public FakulteSecimGUI() {

        setTitle("Fakülte Seçimi");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel label = new JLabel("Lütfen Fakülte Seçiniz", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        JButton teknolojiBtn = new JButton("Teknoloji Fakültesi");
        JButton muhendislikBtn = new JButton("Mühendislik Fakültesi");
        JButton fenBtn = new JButton("Fen Fakültesi");

        panel.add(label);
        panel.add(teknolojiBtn);
        panel.add(muhendislikBtn);
        panel.add(fenBtn);

        add(panel);

        // Şimdilik sadece tıklama testleri
        teknolojiBtn.addActionListener(e ->
                new BolumSecimGUI("Teknoloji Fakültesi")
        );

        muhendislikBtn.addActionListener(e ->
                new BolumSecimGUI("Mühendislik Fakültesi")
        );

        fenBtn.addActionListener(e ->
                new BolumSecimGUI("Fen Fakültesi")
        );


        setVisible(true);
    }
}
