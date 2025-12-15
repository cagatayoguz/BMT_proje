package app;

import javax.swing.*;
import java.awt.*;

public class YemekhaneGUI extends JFrame {

    public YemekhaneGUI() {

        setTitle("Yemekhane");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // ÜST PANEL – YEMEKHANELER
        JPanel ustPanel = new JPanel(new GridLayout(1, 2, 30, 30));
        ustPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        ustPanel.add(yemekhaneBilgiPanel(
                "Merkez Yemekhane",
                "Kapasite: 800 Kişi",
                "C:\\Users\\cagat\\Downloads\\Merkez yemekhane.jpg"
        ));

        ustPanel.add(yemekhaneBilgiPanel(
                "Dökümhane Yemekhane",
                "Kapasite: 600 Kişi",
                "C:\\Users\\cagat\\Downloads\\dökümhane yemekhane.jpg"
        ));

        // ALT PANEL – BUTONLAR (DAHA KÜÇÜK)
        JPanel altPanel = new JPanel();
        altPanel.setBorder(BorderFactory.createEmptyBorder(10, 200, 20, 200));

        JButton gununMenuBtn = new JButton("Günün Menüsü");
        JButton yemekListesiBtn = new JButton("Yemek Listesi");

        Dimension btnSize = new Dimension(140, 30);
        gununMenuBtn.setPreferredSize(btnSize);
        yemekListesiBtn.setPreferredSize(btnSize);

        gununMenuBtn.addActionListener(e -> new GununMenusuGUI());
        yemekListesiBtn.addActionListener(e -> new YemekListesiGUI());

        altPanel.add(gununMenuBtn);
        altPanel.add(Box.createHorizontalStrut(20));
        altPanel.add(yemekListesiBtn);

        add(ustPanel, BorderLayout.CENTER);
        add(altPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel yemekhaneBilgiPanel(String ad, String kapasite, String resimYolu) {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        JLabel adLabel = new JLabel(ad);
        adLabel.setFont(new Font("Arial", Font.BOLD, 16));
        adLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel kapasiteLabel = new JLabel(kapasite);
        kapasiteLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 📸 YEMEKHANE RESMİ (SS BURAYA)
        JLabel resimLabel = new JLabel();
        resimLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        resimLabel.setPreferredSize(new Dimension(300, 160));
        resimLabel.setBorder(BorderFactory.createDashedBorder(Color.GRAY));
        resimLabel.setHorizontalAlignment(JLabel.CENTER);

        // resim varsa göster
        ImageIcon icon = new ImageIcon(resimYolu);
        resimLabel.setIcon(icon);

        panel.add(adLabel);
        panel.add(Box.createVerticalStrut(8));
        panel.add(kapasiteLabel);
        panel.add(Box.createVerticalStrut(10));
        panel.add(resimLabel);

        return panel;
    }
}
