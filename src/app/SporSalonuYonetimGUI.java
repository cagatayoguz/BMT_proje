package app;

import model.sosyal.SporUyesi;
import service.SporSalonuService;

import javax.swing.*;
import java.awt.*;

public class SporSalonuYonetimGUI extends JFrame {

    private SporSalonuService sporService;

    public SporSalonuYonetimGUI() {
        sporService = new SporSalonuService();

        setTitle("Spor Salonu Yönetimi");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton btnUyeEkle = new JButton("Üye Ekle");
        JButton btnUyeSil = new JButton("Üye Sil (Pasif Yap)");

        btnUyeEkle.addActionListener(e -> uyeEkle());
        btnUyeSil.addActionListener(e -> uyeSil());

        setLayout(new GridLayout(2, 1, 15, 15));
        add(btnUyeEkle);
        add(btnUyeSil);

        setVisible(true);
    }

    // =============================
    // ÜYE EKLE
    // =============================
    private void uyeEkle() {
        JTextField txtOgrNo = new JTextField();
        JTextField txtProgram = new JTextField();

        Object[] alanlar = {
                "Öğrenci No:", txtOgrNo,
                "Program:", txtProgram
        };

        int sonuc = JOptionPane.showConfirmDialog(
                this,
                alanlar,
                "Spor Salonu Üye Ekle",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (sonuc != JOptionPane.OK_OPTION) return;

        String ogrNo = txtOgrNo.getText().trim();
        String program = txtProgram.getText().trim();

        if (ogrNo.isEmpty() || program.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alanlar boş olamaz");
            return;
        }

        // Öğrenci zaten üye mi?
        for (SporUyesi u : sporService.getUyeler()) {
            if (u.getOgrenciNo().equals(ogrNo) && u.isAktif()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Bu öğrenci zaten aktif üye!"
                );
                return;
            }
        }

        SporUyesi yeniUye = new SporUyesi(ogrNo, program);
        sporService.getUyeler().add(yeniUye);

        JOptionPane.showMessageDialog(this, "Üye başarıyla eklendi");
    }

    // =============================
    // ÜYE SİL (PASİF YAP)
    // =============================
    private void uyeSil() {
        String ogrNo = JOptionPane.showInputDialog(
                this,
                "Pasif yapılacak Öğrenci No:"
        );

        if (ogrNo == null || ogrNo.trim().isEmpty()) return;

        for (SporUyesi u : sporService.getUyeler()) {
            if (u.getOgrenciNo().equals(ogrNo) && u.isAktif()) {
                u.setAktif(false);
                JOptionPane.showMessageDialog(this, "Üyelik pasif hale getirildi");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Aktif üye bulunamadı");
    }
}
