package Soru3;
public class Test {
    
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci("Neslihan Yildirim", 20, 265615354, 110);
        Kullanici ogrenci2 = new Ogrenci("Zehra Aydin", 21, 939593230, 900);
        Emekli emekli1 = new Emekli("Fatma Keskin", 72, 814687501, 70);
        Kullanici emekli2 = new Emekli("Hasan Yilmaz", 66, 635026503, 1200);
        
        Film film1 = new Film(7155, "Lion", "Dram", 40);
        Film film2 = new Film(1135, "Amelie", "Romantik", 25);
        Film film3 = new Film(4687, "Interstellar", "Bilim Kurgu", 45);   
        Film film4 = new Film(1234, "Şampiyon", "Dram", 35);
        Film film5 = new Film(9785, "Moon", "Bilim Kurgu", 50);
        Film film6 = new Film(5467, "The Intouchables", "Komedi", 40);
        
        
        Seans seans1 = new Seans(123, film1, 8);
        Seans seans2 = new Seans(234, film2, 11);
        Seans seans3 = new Seans(456, film3, 14);
        Seans seans4 = new Seans(321, film4, 17);
        Seans seans5 = new Seans(854, film5, 20);
        Seans seans6 = new Seans(547, film5, 6);
        
        Sinema sinema1 = new Sinema("Axis Sinema");
        Sinema sinema2 = new Sinema("Cevahir Sinema");
        
        //sinema1
        sinema1.seansEkle(seans1);
        sinema1.seansEkle(seans2);
        sinema1.seansEkle(seans3);
        sinema1.seansEkle(seans4);
        sinema1.seansEkle(seans5);
        
        //sinema2
        sinema2.seansEkle(seans1);
        sinema2.seansEkle(seans2);
        sinema2.seansEkle(seans3);
        sinema2.seansEkle(seans4);
        sinema2.seansEkle(seans5);
        sinema2.seansEkle(seans6);
        
        sinema1.biletSat(ogrenci2, seans6);
        sinema2.biletSat(ogrenci1, seans6);
    }
}
