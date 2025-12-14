package app;

import javax.swing.*;
import java.awt.*;

public class SporSalonuUyelikGUI extends JFrame {

    public SporSalonuUyelikGUI() {

        setTitle("Spor Salonu - Aylık Üyelik");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel adLabel = new JLabel("Ad Soyad:");
        JTextField adField = new JTextField();

        JLabel ogrNoLabel = new JLabel("Öğrenci No:");
        JTextField ogrNoField = new JTextField();

        JLabel uyelikTipLabel = new JLabel("Üyelik Tipi:");
        JComboBox<String> uyelikBox = new JComboBox<>();
        uyelikBox.addItem("Aylık Üyelik");

        JLabel ucretLabel = new JLabel("Ücret:");
        JLabel ucretDeger = new JLabel("500 TL");

        JButton kaydolBtn = new JButton("Üye Ol");

        kaydolBtn.addActionListener(e -> {
            if (adField.getText().isEmpty() || ogrNoField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Lütfen tüm alanları doldurun!",
                        "Uyarı",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Üyelik başarıyla oluşturuldu!\n"
                                + "Ad Soyad: " + adField.getText()
                                + "\nÜyelik Tipi: Aylık",
                        "Başarılı",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(adLabel);
        panel.add(adField);
        panel.add(ogrNoLabel);
        panel.add(ogrNoField);
        panel.add(uyelikTipLabel);
        panel.add(uyelikBox);
        panel.add(ucretLabel);
        panel.add(ucretDeger);
        panel.add(new JLabel());
        panel.add(kaydolBtn);

        add(panel);
        setVisible(true);
    }
}
