package service;

import model.fiziki.Kitap;
import java.util.ArrayList;

public class KutuphaneService {

    private ArrayList<Kitap> kitaplar = new ArrayList<>();

    public void kitapEkle(Kitap k) {
        kitaplar.add(k);
    }

    // ✅ EKLENDİ
    public boolean kitapSil(String kitapAdi) {
        for (Kitap k : kitaplar) {
            if (k.getAd().equalsIgnoreCase(kitapAdi)) {
                kitaplar.remove(k);
                return true;
            }
        }
        return false;
    }

    // (İleride gerekirse)
    public ArrayList<Kitap> getKitaplar() {
        return kitaplar;
    }
}
