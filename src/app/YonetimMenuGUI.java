package app;

import javax.swing.*;
import java.awt.*;

public class YonetimMenuGUI extends JFrame {

    public YonetimMenuGUI() {
        setTitle("Yönetim Menüsü");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // === Butonlar ===
        JButton btnOgrenciYonetim = new JButton("Öğrenci Yönetimi");
        JButton btnKutuphaneYonetim = new JButton("Kütüphane Yönetimi");
        JButton btnSporYonetim = new JButton("Spor Salonu Yönetimi");

        // === Aksiyonlar ===
        btnOgrenciYonetim.addActionListener(e -> new OgrenciYonetimGUI());
        btnKutuphaneYonetim.addActionListener(e -> new KutuphaneYonetimGUI());
        btnSporYonetim.addActionListener(e -> new SporSalonuYonetimGUI());

        // === Yerleşim ===
        setLayout(new GridLayout(3, 1, 15, 15));
        add(btnOgrenciYonetim);
        add(btnKutuphaneYonetim);
        add(btnSporYonetim);

        setVisible(true);
    }
}
