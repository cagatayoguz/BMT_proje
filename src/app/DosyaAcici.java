package app;

import java.awt.Desktop;
import java.io.File;

public class DosyaAcici {

    public static void ac(String dosyaYolu) {
        try {
            File file = new File(dosyaYolu);

            if (!file.exists()) {
                System.out.println("Dosya bulunamadı: " + dosyaYolu);
                return;
            }

            Desktop.getDesktop().open(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
