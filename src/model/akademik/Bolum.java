package model.akademik;

import java.util.ArrayList;

public class Bolum {
    private String ad;
    private ArrayList<Ders> dersler = new ArrayList<>();

    public Bolum(String ad) {
        this.ad = ad;
    }

    public void dersEkle(Ders d) {
        dersler.add(d);
    }
}
