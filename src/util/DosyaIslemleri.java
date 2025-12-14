package util;

import java.io.*;

public class DosyaIslemleri {

    public static void yaz(String path, String veri) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(veri);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void oku(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
