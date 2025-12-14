package app;

import javax.swing.*;
import java.awt.*;

public class BolumSecimGUI extends JFrame {

    public BolumSecimGUI(String fakulteAdi) {

        setTitle(fakulteAdi + " - Bölüm Seçimi");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        JLabel label = new JLabel(fakulteAdi + " Bölümleri", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        if (fakulteAdi.equals("Teknoloji Fakültesi")) {

            JButton bilgisayarBtn = new JButton("Bilgisayar Mühendisliği");
            JButton elektrikBtn   = new JButton("Elektrik-Elektronik Mühendisliği");
            JButton otomotivBtn   = new JButton("Otomotiv Mühendisliği");

            // 🔥 DOSYA BAĞLANTILARI
            bilgisayarBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\teknoloji bilgisayar.xls"
                    )
            );

            elektrikBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\teknoloji elektrik.pdf"
                    )
            );

            otomotivBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\teknoloji otomotiv.pdf"
                    )
            );

            panel.add(bilgisayarBtn);
            panel.add(elektrikBtn);
            panel.add(otomotivBtn);
        }
        if (fakulteAdi.equals("Mühendislik Fakültesi")) {

            JButton bilgisayarBtn2 = new JButton("Bilgisayar Mühendisliği");
            JButton elektrikBtn2   = new JButton("Elektrik-Elektronik Mühendisliği");
            JButton endustriBtn   = new JButton("Endüstri Mühendisliği");

            // 🔥 DOSYA BAĞLANTILARI
            bilgisayarBtn2.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\Mühendislik Bilgisayar.pdf"
                    )
            );

            elektrikBtn2.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\mühendislik elektrik.pdf"
                    )
            );

            endustriBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\Mühendislik endüstri.pdf"
                    )
            );

            panel.add(bilgisayarBtn2);
            panel.add(elektrikBtn2);
            panel.add(endustriBtn);
        }

        if (fakulteAdi.equals("Fen Fakültesi")) {

            JButton matematikBtn = new JButton("Matematik");
            JButton fizikBtn   = new JButton("Fizik");
            JButton kimyaBtn   = new JButton("Kimya");

            // 🔥 DOSYA BAĞLANTILARI
            matematikBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\mat ders pro.pdf"
                    )
            );

            fizikBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\fizik ders pro.pdf"
                    )
            );

            kimyaBtn.addActionListener(e ->
                    DosyaAcici.ac(
                            "C:\\Users\\cagat\\Downloads\\kimya ders pro.pdf"
                    )
            );

            panel.add(matematikBtn);
            panel.add(fizikBtn);
            panel.add(kimyaBtn);
        }


        add(panel);
        setVisible(true);
    }
}
