package service;

import model.fiziki.Kitap;
import java.util.ArrayList;

public class KutuphaneService {

    private ArrayList<Kitap> kitaplar = new ArrayList<>();

    public void kitapEkle(Kitap k) {
        kitaplar.add(k);
    }

    public ArrayList<Kitap> getKitaplar() {
        return kitaplar;
    }
}
