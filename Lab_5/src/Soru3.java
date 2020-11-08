/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeki
 */
public class Soru3 {

    public static double ortalamaHesapla(double sayi1, double sayi2, int sayi3, int sayi4){
        double ortalama = (sayi1 + sayi2 + sayi3 + sayi4) / 4;
        return ortalama;
    }
    public static void main(String[] args) {
        double sonuc = ortalamaHesapla(2.5, 4.5, 5, 10);
        System.out.println("Sonuç:" + sonuc);
    }
    
}
