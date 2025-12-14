package service;

import model.sosyal.SporUyesi;
import java.util.ArrayList;

public class SporSalonuService {

    private ArrayList<SporUyesi> uyeler = new ArrayList<>();

    public void uyeEkle(SporUyesi u) {
        uyeler.add(u);
    }

    public ArrayList<SporUyesi> getUyeler() {
        return uyeler;
    }
}
