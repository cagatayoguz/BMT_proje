package app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DersProgramiGUI extends JFrame {

    public DersProgramiGUI() {

        setTitle("Ders Programı");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Sütun isimleri
        String[] sutunlar = {
                "Saat / Gün",
                "Pazartesi",
                "Salı",
                "Çarşamba",
                "Perşembe",
                "Cuma"
        };

        // Örnek ders programı verisi
        Object[][] veri = {
                {"09:00 - 10:00", "Matematik", "Fizik", "", "Programlama", ""},
                {"10:00 - 11:00", "Matematik", "", "Veri Yapıları", "", "İngilizce"},
                {"11:00 - 12:00", "", "Fizik", "Veri Yapıları", "Programlama", ""},
                {"13:00 - 14:00", "Algoritma", "", "", "Veritabanı", ""},
                {"14:00 - 15:00", "", "OOP", "OOP", "", "Veritabanı"}
        };

        DefaultTableModel model = new DefaultTableModel(veri, sutunlar);
        JTable table = new JTable(model);

        table.setRowHeight(30);
        table.setEnabled(false); // sadece görüntüleme

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }
}
