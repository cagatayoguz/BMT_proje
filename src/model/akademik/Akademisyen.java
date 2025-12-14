package model.akademik;

public class Akademisyen extends Kisi {

    private String unvan;

    public Akademisyen(String ad, String soyad, String kimlikNo, String unvan) {
        super(ad, soyad, kimlikNo);
        this.unvan = unvan;
    }

    @Override
    public void profilGoster() {
        System.out.println("Akademisyen: " + unvan + " " + getAd() + " " + getSoyad());
    }
}
