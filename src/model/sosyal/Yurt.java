package model.sosyal;

import java.util.ArrayList;

public class Yurt {
    private String ad;
    private ArrayList<Oda> odalar = new ArrayList<>();

    public Yurt(String ad) {
        this.ad = ad;
    }

    public void odaEkle(Oda o) {
        odalar.add(o);
    }
}
