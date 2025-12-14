package service;

import model.akademik.Ogrenci;
import java.util.ArrayList;

public class OgrenciService {

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public void ogrenciEkle(Ogrenci o) {
        ogrenciler.add(o);
    }

    public void listele() {
        for (Ogrenci o : ogrenciler)
            o.profilGoster();
    }
}
