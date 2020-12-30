
package soru4;

public class Test {
    public static void main(String[] args) {
        Gazete g1 = new Gazete("Hürriyet",1948);
        Gazete g2 = new Gazete("Cumhuriyet",1924);

        Yazar k1 = new Yazar("Talha Dereyurt","Mr.KoseYazari",g1);
        Admin k2 = new Admin("Ahmet Yilmaz","Admininiz",g1);
        Yazar k3 = new Yazar("Mehmet Yildiz","EnIyiYazar01",g2);
        Yazar k4 = new Yazar("Ayse Aslan","KraliceYazar",g2);
        Admin k5 = new Admin("Cenk Tosun","BuyukPatron",g2);
        
        Haber h1 = new Haber(1,"Adana'da esrarengiz olay",(Yazar)k1);
        Haber h2 = new Haber(5,"Gunluk vakada sasirtan artis",(Yazar)k3);
        Haber h3 = new Haber(3,"Turkiye ekonomisi yuzde 2 buyudu",(Yazar)k4);
        
        
        
        System.out.println(h1.getBaslik());
        k2.haberGuncelle(h1, "Yasaklı haber");
        System.out.println(h1.getBaslik());
         
        
       
        g1.yazarEkle(k1);
        g1.yazarListele();
        
        k5.haberEkle(h2);
        k5.haberEkle(h3);
        System.out.println("--------------------------");
        g2.haberListele();
        
        System.out.println("Silindikten sonra **********");
        k5.haberSil(h3);
        g2.haberListele();
        
        k2.bilgileriYazdir();
        k5.bilgileriYazdir();
        
        
        
    }
}
