package model.fiziki;

import java.util.ArrayList;

public class Bina {
    private String ad;
    private ArrayList<Sinif> siniflar = new ArrayList<>();

    public Bina(String ad) {
        this.ad = ad;
    }

    public void sinifEkle(Sinif s) {
        siniflar.add(s);
    }
}
