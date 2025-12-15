package model.sosyal;

public class SporUyesi {

    private String ogrenciNo;   // Öğrenci numarası
    private String program;     // Spor programı
    private boolean aktif;      // Üyelik durumu

    // =============================
    // CONSTRUCTOR
    // =============================
    public SporUyesi(String ogrenciNo, String program) {
        this.ogrenciNo = ogrenciNo;
        this.program = program;
        this.aktif = true;
    }

    // =============================
    // GETTER - SETTER
    // =============================
    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    // =============================
    // YARDIMCI
    // =============================
    @Override
    public String toString() {
        return ogrenciNo + " - " + program + (aktif ? " (Aktif)" : " (Pasif)");
    }
}
