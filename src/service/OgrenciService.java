package service;

import model.akademik.Ogrenci;
import java.util.ArrayList;

public class OgrenciService {

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public void ogrenciEkle(Ogrenci o) {
        ogrenciler.add(o);
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public boolean ogrenciSil(String ogrenciNo) {
        for (Ogrenci o : ogrenciler) {
            if (o.getOgrenciNo().equals(ogrenciNo)) {
                ogrenciler.remove(o);
                return true;
            }
        }
        return false;
    }

    public void listele() {
        for (Ogrenci o : ogrenciler)
            o.profilGoster();
    }
}
