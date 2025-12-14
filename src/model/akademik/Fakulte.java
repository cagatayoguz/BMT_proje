package model.akademik;

import java.util.ArrayList;

public class Fakulte {
    private String ad;
    private ArrayList<Bolum> bolumler = new ArrayList<>();

    public Fakulte(String ad) {
        this.ad = ad;
    }

    public void bolumEkle(Bolum b) {
        bolumler.add(b);
    }
}
