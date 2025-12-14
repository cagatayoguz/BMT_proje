package model.akademik;

public abstract class Kisi {
    private String ad;
    private String soyad;
    private String kimlikNo;

    public Kisi(String ad, String soyad, String kimlikNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
    }

    public abstract void profilGoster();

    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public String getKimlikNo() { return kimlikNo; }
}
