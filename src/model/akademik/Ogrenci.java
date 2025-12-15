package model.akademik;

import java.util.ArrayList;

public class Ogrenci extends Kisi {
    private String ogrenciNo;
    private ArrayList<Ders> aldigiDersler = new ArrayList<>();

    public Ogrenci(String ad, String soyad, String kimlikNo, String ogrenciNo) {
        super(ad, soyad, kimlikNo);
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public ArrayList<Ders> getAldigiDersler() {
        return aldigiDersler;
    }

    @Override
    public void profilGoster() {
        System.out.println(
                "Öğrenci: " + getAd() + " " + getSoyad() + " - No: " + ogrenciNo
        );
    }

    public void dersEkle(Ders d) {
        aldigiDersler.add(d);
    }
}
