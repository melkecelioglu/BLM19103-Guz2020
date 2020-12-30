/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biletix;

/**
 *
 * @author emin yasir corut
 */
public class BiletixTest {
    public static void main(String[] args) {
        
        
        Sinema sinema=new Sinema("Maximum Sinema");
        
        System.out.println(sinema.ad+"'sına HoşGeldiniz");
        System.out.println("****************************************");
        
        Kullanici k1=new Emekli("Alp Özkan", 56, 12155215, 85);
        Kullanici k2=new Ogrenci("Kaan Yıldız", 20, 131515515, 40);
        Kullanici k3=new Emekli("Uğur Yıldız", 50, 1213514, 20);
        Kullanici k4=new Ogrenci("Seyit Kara", 17, 51611515, 45);
        
        k1.bilgileriYazdir();
        System.out.println("************");
        k2.bilgileriYazdir();
        System.out.println("************");
        k3.bilgileriYazdir();
        System.out.println("************");
        k4.bilgileriYazdir();
        System.out.println("************");
        
        Film f1=new Film(10, "Jhon Wick", "Aksiyon", 45);
        Film f2=new Film(11, "Buz devri 5", "Animasyon", 20);
        Film f3=new Film(12, "Doctor Stranger", "Aksiiyon", 55);
        Film f4=new Film(13, "Ayla", "Drama", 15);
        
        Seans s1=new Seans(111, f1, 16);
        Seans s2=new Seans(121, f3, 20);
        Seans s3=new Seans(131, f2, 18);
        Seans s4=new Seans(141, f4, 22);
        
//        System.out.print(k1.adSoyad+" ");
//        k1.satinAl(s1);
//        System.out.println(k1.adSoyad+"' ın kalan bakiyesi= "+k1.getBakiye());
//        System.out.println("");
//        System.out.print(k1.adSoyad+" ");
//        k1.satinAl(s2);
//        System.out.println(k1.adSoyad+"' ın kalan bakiyesi= "+k1.getBakiye());
//        System.out.println("");
//        System.out.print(k2.adSoyad+" ");
//        k2.satinAl(s4);
//        System.out.println(k2.adSoyad+"' ın kalan bakiyesi= "+k2.getBakiye());
//        System.out.println("");
//        System.out.print(k3.adSoyad+" ");
//        k3.satinAl(s3);
//        System.out.println(k3.adSoyad+"' ın kalan bakiyesi= "+k3.getBakiye());
//        System.out.println("");
//        System.out.print(k4.adSoyad+" ");
//        k4.satinAl(s3);
//        System.out.println(k4.adSoyad+"' ın kalan bakiyesi= "+k4.getBakiye());
//        System.out.println("");
        
//        System.out.println(k1.adSoyad+"' ın kalan bakiyesi= "+k1.getBakiye());
//        System.out.println("");
//        System.out.println(k2.adSoyad+"' ın kalan bakiyesi= "+k2.getBakiye());
//        System.out.println("");
//        System.out.println(k3.adSoyad+"' ın kalan bakiyesi= "+k3.getBakiye());
//        System.out.println("");
//        System.out.println(k4.adSoyad+"' ın kalan bakiyesi= "+k4.getBakiye());
//        System.out.println("");


        
        
        
        sinema.biletSat(k1, s4);
        System.out.println(k1.adSoyad+"'adlı kişinin kalan bakiyesi= "+k1.bakiye+"\n");
        sinema.biletSat(k4, s1);
        System.out.println(k4.adSoyad+"'adlı kişinin kalan bakiyesi= "+k4.bakiye+"\n");
        sinema.biletSat(k3, s3);
        System.out.println(k3.adSoyad+"'adlı kişinin kalan bakiyesi= "+k3.bakiye+"\n");
        sinema.biletSat(k2, s2);
        System.out.println(k2.adSoyad+"'adlı kişinin kalan bakiyesi= "+k2.bakiye+"\n");
        sinema.biletSat(k4, s4);
        System.out.println(k4.adSoyad+"'adlı kişinin kalan bakiyesi= "+k4.bakiye+"\n");
        sinema.biletSat(k1, s2);
        System.out.println("***********************************");
        k1.bilgileriYazdir();
        
        
       
        
        
        
        
        
    }
}
