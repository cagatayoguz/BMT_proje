package app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SporSalonuSaatlerGUI extends JFrame {

    public SporSalonuSaatlerGUI() {

        setTitle("Spor Salonu Çalışma Saatleri");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] sutunlar = {
                "Gün",
                "Durum",
                "Açılış",
                "Kapanış"
        };

        Object[][] veriler = {
                {"Pazartesi", "Kapalı", "-", "-"},
                {"Salı", "Açık", "08:00", "20:00"},
                {"Çarşamba", "Açık", "08:00", "20:00"},
                {"Perşembe", "Açık", "08:00", "20:00"},
                {"Cuma", "Açık", "08:00", "20:00"},
                {"Cumartesi", "Açık", "08:00", "20:00"},
                {"Pazar", "Açık", "08:00", "20:00"}
        };

        JTable table = new JTable(new DefaultTableModel(veriler, sutunlar));
        table.setRowHeight(28);
        table.setEnabled(false);

        JLabel bilgi = new JLabel(
                "Pazartesi günleri spor salonu kapalıdır.",
                SwingConstants.CENTER
        );
        bilgi.setFont(new Font("Arial", Font.BOLD, 13));

        add(bilgi, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }
}
