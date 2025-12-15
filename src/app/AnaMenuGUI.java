package app;

import javax.swing.*;
import java.awt.*;

public class AnaMenuGUI extends JFrame {

    private static final String YONETIM_SIFRE = "admin123";

    public AnaMenuGUI() {
        setTitle("Ana Menü");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnBilgi = new JButton("Bilgi");
        JButton btnYonetim = new JButton("Yönetim");

        btnBilgi.addActionListener(e -> new BilgiMenuGUI());
        btnYonetim.addActionListener(e -> yonetimGiris());

        setLayout(new GridLayout(2, 1, 15, 15));
        add(btnBilgi);
        add(btnYonetim);

        setVisible(true);
    }

    private void yonetimGiris() {
        JPasswordField sifre = new JPasswordField();

        int sonuc = JOptionPane.showConfirmDialog(
                this,
                sifre,
                "Yönetim Girişi",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (sonuc != JOptionPane.OK_OPTION) return;

        if (!YONETIM_SIFRE.equals(new String(sifre.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Hatalı şifre!");
            return;
        }

        new YonetimMenuGUI();
    }
}
