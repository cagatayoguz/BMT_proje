package app;

import model.akademik.Ogrenci;
import service.OgrenciService;

import javax.swing.*;
import java.awt.*;

public class OgrenciYonetimGUI extends JFrame {

    private OgrenciService ogrenciService;

    public OgrenciYonetimGUI() {
        ogrenciService = new OgrenciService();

        setTitle("Öğrenci Yönetimi");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton btnEkle = new JButton("Öğrenci Ekle");
        JButton btnSil = new JButton("Öğrenci Sil");

        btnEkle.addActionListener(e -> ogrenciEkle());
        btnSil.addActionListener(e -> ogrenciSil());

        setLayout(new GridLayout(2, 1, 15, 15));
        add(btnEkle);
        add(btnSil);

        setVisible(true);
    }

    // =============================
    // ÖĞRENCİ EKLE
    // =============================
    private void ogrenciEkle() {
        JTextField txtAd = new JTextField();
        JTextField txtSoyad = new JTextField();
        JTextField txtKimlik = new JTextField();
        JTextField txtOgrNo = new JTextField();

        Object[] alanlar = {
                "Ad:", txtAd,
                "Soyad:", txtSoyad,
                "Kimlik No:", txtKimlik,
                "Öğrenci No:", txtOgrNo
        };

        int sonuc = JOptionPane.showConfirmDialog(
                this,
                alanlar,
                "Öğrenci Ekle",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (sonuc != JOptionPane.OK_OPTION) return;

        String ogrNo = txtOgrNo.getText().trim();

        for (Ogrenci o : ogrenciService.getOgrenciler()) {
            if (o.getOgrenciNo().equals(ogrNo)) {
                JOptionPane.showMessageDialog(this, "Bu öğrenci numarası zaten var!");
                return;
            }
        }

        Ogrenci yeni = new Ogrenci(
                txtAd.getText().trim(),
                txtSoyad.getText().trim(),
                txtKimlik.getText().trim(),
                ogrNo
        );

        ogrenciService.ogrenciEkle(yeni);
        JOptionPane.showMessageDialog(this, "Öğrenci eklendi");
    }

    // =============================
    // ÖĞRENCİ SİL
    // =============================
    private void ogrenciSil() {
        String ogrNo = JOptionPane.showInputDialog(
                this,
                "Silinecek Öğrenci No:"
        );

        if (ogrNo == null || ogrNo.trim().isEmpty()) return;

        boolean silindi = ogrenciService.ogrenciSil(ogrNo);

        if (silindi) {
            JOptionPane.showMessageDialog(this, "Öğrenci silindi");
        } else {
            JOptionPane.showMessageDialog(this, "Öğrenci bulunamadı");
        }
    }
}
