package app;

import service.YemekhaneService;
import model.sosyal.Yemek;

import javax.swing.*;

public class YemekhaneGUI extends JFrame {

    YemekhaneService service = new YemekhaneService();
    JTextArea area = new JTextArea();

    public YemekhaneGUI() {
        setTitle("Yemekhane");
        setSize(350,250);
        setLocationRelativeTo(null);

        JTextField ad = new JTextField(8);
        JTextField kalori = new JTextField(5);
        JButton ekle = new JButton("Yemek Ekle");

        JPanel p = new JPanel();
        p.add(new JLabel("Yemek:"));
        p.add(ad);
        p.add(new JLabel("Kalori:"));
        p.add(kalori);
        p.add(ekle);

        ekle.addActionListener(e -> {
            service.yemekEkle(new Yemek(ad.getText(), Integer.parseInt(kalori.getText())));
            area.setText("");
            service.getMenu().forEach(y ->
                    area.append(y.getAd()+" ("+y.getKalori()+" kcal)\n")
            );
        });

        add(p, "North");
        add(new JScrollPane(area), "Center");
        setVisible(true);
    }
}
