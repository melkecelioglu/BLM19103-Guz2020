package Soru3;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Test {
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci("Ihsan Simsek", 20, "10580185701", 200.50);
        Kullanici ogrenci2 = new Ogrenci("Ahmet Yılmaz", 17, "13959326200", 25.25);
        Emekli emekli1 = new Emekli("Ayşe Kaya", 65, "25814687501", 350.75);
        Kullanici emekli2 = new Emekli("Mehmet Yıldırım", 70, "93635026503", 29.99);
        
        Film film1 = new Film(1, "The Shining", "Korku", 30);
        Film film2 = new Film(2, "Tenet", "Bilim Kurgu", 40);
        Film film3 = new Film(3, "Superman", "Macera", 50);
        Film film4 = new Film(4, "Yes Man", "Komedi", 50);
        Film film5 = new Film(5, "Fast and Furious", "Aksiyon", 35);
        
        Seans seans1 = new Seans(101, "10:30", film1);
        Seans seans2 = new Seans(102, "18:00", film2);
        Seans seans3 = new Seans(103, "22:45", film3);
        Seans seans4 = new Seans(104, "13:50", film4);
        Seans seans5 = new Seans(105, "00:00", film5);
        
        Sinema sinema1 = new Sinema("Kanyon Cinema");
        Sinema sinema2 = new Sinema("İstinye Park Cinema");
        
        ogrenci1.bilgileriYazdir();
        ogrenci2.bilgileriYazdir();
        emekli1.bilgileriYazdir();
        emekli2.bilgileriYazdir();
        
        System.out.println("\n===============================================================================================================\n");
        
        sinema1.biletSat(ogrenci1, seans1);
        sinema1.biletSat(ogrenci2, seans3);
        sinema1.biletSat(ogrenci2, seans2);
        sinema2.biletSat(emekli1, seans4);
        sinema2.biletSat(emekli2, seans5);
        
        System.out.println("\n===============================================================================================================\n");
        
        ogrenci1.bilgileriYazdir();
        ogrenci2.bilgileriYazdir();
        emekli1.bilgileriYazdir();
        emekli2.bilgileriYazdir();
        
        System.out.println("\n===============================================================================================================\n");
        
        sinema1.biletSat(ogrenci1, seans5);
        sinema1.biletSat(ogrenci2, seans4);
        sinema2.biletSat(ogrenci2, seans1);
        sinema2.biletSat(emekli1, seans2);
        sinema2.biletSat(emekli2, seans3);
        
        System.out.println("\n===============================================================================================================\n");
        
        ogrenci1.bilgileriYazdir();
        ogrenci2.bilgileriYazdir();
        emekli1.bilgileriYazdir();
        emekli2.bilgileriYazdir();
    }
}
