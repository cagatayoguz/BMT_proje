package model.sosyal;

public class Yemek {
    private String ad;
    private int kalori;

    public Yemek(String ad, int kalori) {
        this.ad = ad;
        this.kalori = kalori;
    }

    public String getAd() { return ad; }
    public int getKalori() { return kalori; }
}
