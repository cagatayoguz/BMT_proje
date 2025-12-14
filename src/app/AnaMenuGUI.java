package app;

import javax.swing.*;
import java.awt.*;

public class AnaMenuGUI extends JFrame {

    public AnaMenuGUI() {

        // Pencere ayarları
        setTitle("Kampüs Yönetim Sistemi");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ana panel
        JPanel panel = new JPanel();
        panel.getColorModel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Butonlar
        JButton ogrenciBtn     = new JButton("Öğrenci Yönetimi");
        JButton akademisyenBtn = new JButton("Akademisyen Yönetimi");
        JButton dersBtn        = new JButton("Ders Yönetimi");
        JButton kutuphaneBtn   = new JButton("Kütüphane");
        JButton sporBtn        = new JButton("Spor Salonu");
        JButton yemekBtn       = new JButton("Yemekhane");
        JButton cikisBtn       = new JButton("Çıkış");


        // Panele ekle
        panel.add(ogrenciBtn);
        panel.add(akademisyenBtn);
        panel.add(dersBtn);
        panel.add(kutuphaneBtn);
        panel.add(sporBtn);
        panel.add(yemekBtn);
        panel.add(cikisBtn);

        add(panel);

        // Buton aksiyonları
        sporBtn.addActionListener(e -> new SporSalonuGUI());
        kutuphaneBtn.addActionListener(e -> new KutuphaneGUI());
        yemekBtn.addActionListener(e -> new YemekhaneGUI());
        dersBtn.addActionListener(e -> new DersYonetimiGUI());
        dersBtn.addActionListener(e -> new FakulteSecimGUI());

        //dersBtn.addActionListener(e -> new DersProgramiGUI());


//        dersBtn.addActionListener(e -> {
//            DersProgramiDosyaAcici.dosyaAc(
//                    "C:\\Users\\cagat\\Downloads\\1419ea55-17ad-44dd-8eca-67018ed9da87-lisans-2025-2026-guz-ders-programi-20092025.xls"
//            );
//        });


        cikisBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
