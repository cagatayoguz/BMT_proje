package model.akademik;

import exception.KontenjanDolduException;

public class Ders {
    private String kod;
    private String ad;
    private int kontenjan;
    private int mevcut;

    public Ders(String kod, String ad, int kontenjan) {
        this.kod = kod;
        this.ad = ad;
        this.kontenjan = kontenjan;
        this.mevcut = 0;
    }

    public void ogrenciEkle() throws KontenjanDolduException {
        if (mevcut >= kontenjan)
            throw new KontenjanDolduException("Kontenjan dolu!");
        mevcut++;
    }

    public String getAd() { return ad; }
}
