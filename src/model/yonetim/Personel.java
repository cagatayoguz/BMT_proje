package model.yonetim;

public abstract class Personel {
    private String ad;
    private double maas;

    public Personel(String ad, double maas) {
        this.ad = ad;
        this.maas = maas;
    }

    public abstract void gorev();
}
