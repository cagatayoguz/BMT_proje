package model.sosyal;

public class SporUyesi {
    private String ogrenciNo;
    private String program;
    private boolean aktif;

    public SporUyesi(String ogrenciNo, String program) {
        this.ogrenciNo = ogrenciNo;
        this.program = program;
        this.aktif = true;
    }

    public String getOgrenciNo() { return ogrenciNo; }
    public String getProgram() { return program; }
    public boolean isAktif() { return aktif; }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
