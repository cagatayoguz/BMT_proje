package app;

import model.fiziki.Kitap;
import service.KutuphaneService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * KutuphaneGUI
 * Projedeki mevcut mimariyle UYUMLU Swing arayüzü
 * - Main sınıfı tarafından çağrılır (bu sınıfta main YOK)
 * - KutuphaneService kullanır
 * - model.fiziki.Kitap sınıfına dokunmaz
 *
 * Özellikler:
 * - Tüm kitapları listeleme
 * - Ödünç alınabilir kitapları gösterme
 * - Kitap ödünç alma
 * - Kitap iade etme
 */
public class KutuphaneGUI extends JFrame {

    private KutuphaneService service;

    private JTable tablo;
    private DefaultTableModel model;

    private JButton btnOduncAl;
    private JButton btnIade;
    private JButton btnMusaitleriGoster;
    private JButton btnTumunuGoster;
    private JButton btnKitapEkle;

    public KutuphaneGUI() {
        service = new KutuphaneService();

        setTitle("Kütüphane Yönetimi");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        arayuzKur();
        tabloyuDoldur(service.getKitaplar());

        setVisible(true);
    }

    private void arayuzKur() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Kitap Adı", "Yazar", "Durum"});

        tablo = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tablo);

        btnOduncAl = new JButton("Ödünç Al");
        btnIade = new JButton("İade Et");
        btnMusaitleriGoster = new JButton("Müsait Kitaplar");
        btnTumunuGoster = new JButton("Tüm Kitaplar");
        btnKitapEkle = new JButton("Kitap Ekle");

        btnOduncAl.addActionListener(e -> oduncAl());
        btnIade.addActionListener(e -> iadeEt());
        btnMusaitleriGoster.addActionListener(e -> musaitleriGoster());
        btnTumunuGoster.addActionListener(e -> tabloyuDoldur(service.getKitaplar()));
        btnKitapEkle.addActionListener(e -> kitapEkle());

        JPanel altPanel = new JPanel();
        altPanel.add(btnOduncAl);
        altPanel.add(btnIade);
        altPanel.add(btnMusaitleriGoster);
        altPanel.add(btnTumunuGoster);
        altPanel.add(btnKitapEkle);

        add(scrollPane, BorderLayout.CENTER);
        add(altPanel, BorderLayout.SOUTH);
    }

    private void tabloyuDoldur(java.util.List<Kitap> kitaplar) {
        model.setRowCount(0);
        for (Kitap k : kitaplar) {
            model.addRow(new Object[]{
                    k.getAd(),
                    k.getYazar(),
                    k.isOduncAlindi() ? "Ödünçte" : "Müsait"
            });
        }
    }

    private void musaitleriGoster() {
        java.util.List<Kitap> musaitler = new java.util.ArrayList<>();
        for (Kitap k : service.getKitaplar()) {
            if (!k.isOduncAlindi()) {
                musaitler.add(k);
            }
        }
        tabloyuDoldur(musaitler);
    }

    private void oduncAl() {
        int seciliSatir = tablo.getSelectedRow();
        if (seciliSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir kitap seçiniz");
            return;
        }

        String kitapAdi = (String) model.getValueAt(seciliSatir, 0);

        for (Kitap k : service.getKitaplar()) {
            if (k.getAd().equals(kitapAdi) && !k.isOduncAlindi()) {
                k.setOduncAlindi(true);
                break;
            }
        }

        tabloyuDoldur(service.getKitaplar());
    }

    private void iadeEt() {
        int seciliSatir = tablo.getSelectedRow();
        if (seciliSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir kitap seçiniz");
            return;
        }

        String kitapAdi = (String) model.getValueAt(seciliSatir, 0);

        for (Kitap k : service.getKitaplar()) {
            if (k.getAd().equals(kitapAdi) && k.isOduncAlindi()) {
                k.setOduncAlindi(false);
                break;
            }
        }

        tabloyuDoldur(service.getKitaplar());
    }

    /**
     * Yeni kitap ekleme işlemi
     * Service katmanına uygun şekilde listeye ekler
     */
    private void kitapEkle() {
        JTextField txtAd = new JTextField();
        JTextField txtYazar = new JTextField();

        Object[] alanlar = {
                "Kitap Adı:", txtAd,
                "Yazar:", txtYazar
        };

        int sonuc = JOptionPane.showConfirmDialog(
                this,
                alanlar,
                "Yeni Kitap Ekle",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (sonuc != JOptionPane.OK_OPTION) return;

        String ad = txtAd.getText().trim();
        String yazar = txtYazar.getText().trim();

        if (ad.isEmpty() || yazar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alanlar boş bırakılamaz");
            return;
        }

        Kitap yeniKitap = new Kitap(ad, yazar);
        service.getKitaplar().add(yeniKitap);

        tabloyuDoldur(service.getKitaplar());
    }
}

