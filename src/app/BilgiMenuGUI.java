package app;

import javax.swing.*;
import java.awt.*;

public class BilgiMenuGUI extends JFrame {

    public BilgiMenuGUI() {
        setTitle("Bilgi Menüsü");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton btnSpor = new JButton("Spor Salonu");
        JButton btnKutuphane = new JButton("Kütüphane");
        JButton btnYemekhane = new JButton("Yemekhane");
        JButton btnDersProgrami = new JButton("Ders Programı");
        JButton btnAkademisyen = new JButton("Akademisyenler");
        JButton btnKampus = new JButton("Kampüs Haritası");
        JButton btnGeri = new JButton("Geri");

        // === VAR OLAN SINIFLAR ===
        btnSpor.addActionListener(e -> new SporSalonuGUI());
        btnKutuphane.addActionListener(e -> new KutuphaneGUI());
        btnYemekhane.addActionListener(e -> new YemekhaneGUI());
        btnDersProgrami.addActionListener(e -> new DersProgramiGUI());

        // === YENİ EKLENECEKLER ===
        btnAkademisyen.addActionListener(e -> new AkademisyenGUI());
        btnKampus.addActionListener(e -> new KampusHaritasiGUI());

        setLayout(new GridLayout(7, 1, 10, 10));
        add(btnSpor);
        add(btnKutuphane);
        add(btnYemekhane);
        add(btnDersProgrami);
        add(btnAkademisyen);
        add(btnKampus);
        add(btnGeri);

        btnGeri.addActionListener(e -> dispose());

        setVisible(true);
    }
}
