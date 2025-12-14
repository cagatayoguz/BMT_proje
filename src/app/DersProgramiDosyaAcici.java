//package app;
//
//import java.awt.Desktop;
//import java.io.File;
//
//public class DersProgramiDosyaAcici {
//
//    public static void dosyaAc(String dosyaYolu) {
//        try {
//            File dosya = new File(dosyaYolu);
//
//            if (!dosya.exists()) {
//                System.out.println("Dosya bulunamadı!");
//                return;
//            }
//
//            Desktop.getDesktop().open(dosya);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
