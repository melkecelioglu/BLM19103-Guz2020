
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zeki
 */
public class Soru7 {


    public static double hesap_makinesi(int sayi1, int sayi2, String islem) {
        if (islem.equals("Toplama")) {
            return sayi1 + sayi2;
        } else if (islem.equals("Çıkarma")) {
            return sayi1 - sayi2;
        } else if (islem.equals("Çarpma")) {
            return sayi1 * sayi2;
        } else {
            return sayi1 / sayi2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.print("İşlem seçiniz: ");
        String islem = sc.next();

        System.out.println("Sonuç: " + hesap_makinesi(sayi1, sayi2, islem));

    }

}
