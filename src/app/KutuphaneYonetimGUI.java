package app;

import model.fiziki.Kitap;
import service.KutuphaneService;

import javax.swing.*;
import java.awt.*;

public class KutuphaneYonetimGUI extends JFrame {

    private KutuphaneService kutuphaneService;

    public KutuphaneYonetimGUI() {
        kutuphaneService = new KutuphaneService();

        setTitle("Kütüphane Yönetimi");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton btnKitapEkle = new JButton("Kitap Ekle");
        JButton btnKitapSil = new JButton("Kitap Sil");

        btnKitapEkle.addActionListener(e -> kitapEkle());
        btnKitapSil.addActionListener(e -> kitapSil());

        setLayout(new GridLayout(2, 1, 15, 15));
        add(btnKitapEkle);
        add(btnKitapSil);

        setVisible(true);
    }

    // =============================
    // KİTAP EKLE
    // =============================
    private void kitapEkle() {
        JTextField txtKitapAdi = new JTextField();
        JTextField txtYazar = new JTextField();

        Object[] alanlar = {
                "Kitap Adı:", txtKitapAdi,
                "Yazar:", txtYazar
        };

        int sonuc = JOptionPane.showConfirmDialog(
                this,
                alanlar,
                "Kitap Ekle",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (sonuc != JOptionPane.OK_OPTION) return;

        String ad = txtKitapAdi.getText().trim();
        String yazar = txtYazar.getText().trim();

        if (ad.isEmpty() || yazar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alanlar boş olamaz");
            return;
        }

        Kitap yeniKitap = new Kitap(ad, yazar);
        kutuphaneService.kitapEkle(yeniKitap);

        JOptionPane.showMessageDialog(this, "Kitap başarıyla eklendi");
    }

    // =============================
    // KİTAP SİL
    // =============================
    private void kitapSil() {
        String kitapAdi = JOptionPane.showInputDialog(
                this,
                "Silinecek Kitap Adı:"
        );

        if (kitapAdi == null || kitapAdi.trim().isEmpty()) return;

        boolean silindi = kutuphaneService.kitapSil(kitapAdi);

        if (silindi) {
            JOptionPane.showMessageDialog(this, "Kitap silindi");
        } else {
            JOptionPane.showMessageDialog(this, "Kitap bulunamadı");
        }
    }
}
