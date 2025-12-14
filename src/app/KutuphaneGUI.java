package app;

import service.KutuphaneService;
import model.fiziki.Kitap;

import javax.swing.*;
import java.awt.*;

public class KutuphaneGUI extends JFrame {

    KutuphaneService service = new KutuphaneService();
    JTextArea area = new JTextArea();

    public KutuphaneGUI() {
        setTitle("Kütüphane");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextField adField = new JTextField(10);
        JTextField yazarField = new JTextField(10);
        JButton ekleBtn = new JButton("Kitap Ekle");

        JPanel ust = new JPanel();
        ust.add(new JLabel("Ad:"));
        ust.add(adField);
        ust.add(new JLabel("Yazar:"));
        ust.add(yazarField);
        ust.add(ekleBtn);

        ekleBtn.addActionListener(e -> {
            service.kitapEkle(new Kitap(adField.getText(), yazarField.getText()));
            area.setText("");
            service.getKitaplar().forEach(k ->
                    area.append(k.getAd()+" - "+k.getYazar()+"\n")
            );
        });

        add(ust, BorderLayout.NORTH);
        add(new JScrollPane(area), BorderLayout.CENTER);
        setVisible(true);
    }
}
