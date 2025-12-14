package service;

import model.sosyal.Yemek;
import java.util.ArrayList;

public class YemekhaneService {

    private ArrayList<Yemek> menu = new ArrayList<>();

    public void yemekEkle(Yemek y) {
        menu.add(y);
    }

    public ArrayList<Yemek> getMenu() {
        return menu;
    }
}
