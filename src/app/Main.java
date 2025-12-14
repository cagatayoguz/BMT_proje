package app;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        // Swing arayüzünü doğru thread üzerinde başlat
        SwingUtilities.invokeLater(() -> {
            new AnaMenuGUI();
        });

    }
}
