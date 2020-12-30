/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author Tz Group
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kullanıcı k_1 = new StandartKullanici("Furkan", "Korkmaz" );
        Kullanıcı k_2 = new PremiumKullanici("Yusuf", "Kurt", 10);
        
        
        Urun urun_1 = new Telefon("Iphone", "Akıllı Telefon", 10000, 1);
        Urun urun_2 = new Telefon("Samsung", "Akıllı Telefon", 7000, 2);
        
        Urun urun_3 = new Bilgisayar("Asus", "Laptop", 15000);
        
        Sepet spt_1 = new Sepet(k_1);
        Sepet spt_2 = new Sepet(k_2);
        
        spt_1.urunEkle(urun_1);
        spt_1.urunEkle(urun_2);
        
        spt_2.urunEkle(urun_3);
        
        System.out.println("İndirim uygulanmamış Samsung Çift Hatlı fiyatı:" + urun_2.getFiyat());
        
        urun_2.indirimUygula();
        
        System.out.println("İndirim uygulanmış Çift Hatlı Samsung fiyatı: " + urun_2.getFiyat());
        
        System.out.println("İndirim uygulanmamış Iphone fiyatı:" + urun_1.getFiyat());
        
        urun_1.indirimUygula();
        
        System.out.println("İndirim uygulanmış Iphone fiyatı: " + urun_1.getFiyat());
        
        System.out.println("İndirim uygulanmamış laptop fiyatı: " + urun_3.getFiyat());
        
        urun_3.indirimUygula();
        
        System.out.println("İndirim uygulanmış laptop fiyatı:" + urun_3.getFiyat());
        
        //spt_1.sepettekiUrunYazdırma();
        //spt_2.sepettekiUrunYazdırma();
        
        spt_2.satınAl();
        
        
        spt_1.satınAl();
        
        
        k_1.urunListele();
        
        k_2.urunListele();
        
        //spt_1.sepettekiUrunYazdırma();
        //spt_2.sepettekiUrunYazdırma();
        
    }
    
}
