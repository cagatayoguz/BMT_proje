package app;

import service.OgrenciService;
import model.akademik.Ogrenci;

import java.util.Scanner;

public class Menu {

    OgrenciService ogrenciService = new OgrenciService();

    public void baslat() {
        Scanner sc = new Scanner(System.in);
        int secim = -1;

        do {
            System.out.println("\n==== KAMPÜS YÖNETİM SİSTEMİ ====");
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Öğrenci Listele");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim: ");
            secim = sc.nextInt();

            switch (secim) {
                case 1 :
                    System.out.print("Ad: ");
                    String ad = sc.next();
                    System.out.print("Soyad: ");
                    String soyad = sc.next();
                    System.out.print("TC: ");
                    String tc = sc.next();
                    System.out.print("Öğrenci No: ");
                    String no = sc.next();

                    ogrenciService.ogrenciEkle(new Ogrenci(ad, soyad, tc, no));




                case 2 : ogrenciService.listele();
            }

        } while (secim != 0);
    }
}
