package model.sosyal;

public class Oda {
    private int odaNo;
    private boolean doluMu = false;

    public Oda(int odaNo) {
        this.odaNo = odaNo;
    }

    public boolean isDolu() { return doluMu; }
    public void yerles() { doluMu = true; }
}
