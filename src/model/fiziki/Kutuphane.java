package model.fiziki;

import java.util.ArrayList;

public class Kutuphane {
    private ArrayList<Kitap> kitaplar = new ArrayList<>();

    public void kitapEkle(Kitap k) {
        kitaplar.add(k);
    }
}
