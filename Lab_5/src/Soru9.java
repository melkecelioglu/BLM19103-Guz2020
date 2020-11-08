
import java.util.Scanner;

public class Soru9 {

    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        return sonuc;
    }

    public static double sinx(int x, int adim_sayisi) {
        double sonuc = 0;
        int us = 1;

        for (int i = 0; i < adim_sayisi; i++) {
            double ust_kisim = Math.pow(x, us);
            double alt_kisim = faktoriyel(us);
            sonuc = sonuc + (Math.pow(-1, i) * ust_kisim / alt_kisim);
            us += 2;
        }
        return sonuc;
    }

    public static double cosx(int x, int adim_sayisi) {
        double sonuc = 1;
        int us = 2;

        for (int i = 1; i < adim_sayisi; i++) {
            double ust_kisim = Math.pow(x, us);
            double alt_kisim = faktoriyel(us);
            sonuc = sonuc + (Math.pow(-1, i) * ust_kisim / alt_kisim);
            us += 2;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("X Değeri Giriniz: ");
        int x = s.nextInt();
        System.out.print("Adım Sayısı Giriniz: ");
        int adim_sayisi = s.nextInt();
        System.out.print("Sin veya Cos Giriniz: ");
        String sin_cos = s.next();

        if (sin_cos.equals("Sin")) {
            System.out.println(sinx(x, adim_sayisi));
        } else {
            System.out.println(cosx(x, adim_sayisi));
        }

    }

}
