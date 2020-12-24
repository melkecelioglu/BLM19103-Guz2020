package Soru6;

/**
 *
 * @author ayza
 */
public class Test {

    public static void main(String[] args) {

        Urun urun1 = new Urun("Televizyon", "Teknoloji", 12000);
        Urun urun2 = new Urun("Kulaklik", "Teknoloji", 245);
        Urun urun3 = new Urun("TV Unitesi", "Mobilya", 600);

        Kullanici kullanici1 = new Kullanici("Eylul Yilmaz");
        Kullanici kullanici2 = new Kullanici("Ali Ata");
        Kullanici kullanici3 = new Kullanici("Ayse Yildiz");

        Sepet sepet1 = new Sepet(kullanici1);
        Sepet sepet2 = new Sepet(kullanici2);
        Sepet sepet3 = new Sepet(kullanici3);

        Urun bilgisayar1 = new Bilgisayar("Casper", "Dizustu", 8000);
        Urun bilgisayar2 = new Bilgisayar("Asus", "Dizustu", 7000);
        Urun bilgisayar3 = new Bilgisayar("Macbook", "Dizustu", 10000);

        Urun telefon1 = new Telefon(2, "Iphone", "Akilli", 8000);
        Urun telefon2 = new Telefon(1, "Samsung", "Akilli", 5000);
        Urun telefon3 = new Telefon(3, "Huawei", "Akilli", 4000);

        sepet1.UrunEkle(urun2);
        sepet3.UrunEkle(urun1);
        sepet2.UrunEkle(urun3);
        System.out.println("----");
        sepet1.UrunListele();
        System.out.println("----");
        sepet2.UrunListele();
        System.out.println("----");
        sepet3.UrunListele();
        System.out.println("----");

        System.out.println("Sepet sahibinin adı: " + kullanici1.adSoyad);
        System.out.println(urun1.ad + " fiyati: " + urun1.fiyat);
        urun1.indirimUygula();
        System.out.println("Indirimli fiyati: " + urun1.fiyat);
        System.out.println("----");

        System.out.println("Sepet sahibinin adi: " + kullanici2.adSoyad);
        System.out.println(urun2.ad + " fiyati: " + urun2.fiyat);
        urun2.indirimUygula();
        System.out.println("Indirimli fiyati: " + urun2.fiyat);
        System.out.println("----");

        System.out.println("Sepet sahibinin adi: " + kullanici3.adSoyad);
        System.out.println(urun3.ad + " fiyati: " + urun3.fiyat);
        urun3.indirimUygula();
        System.out.println("Indirimli fiyati: " + urun3.fiyat);
        System.out.println("----");
        
        
        System.out.println(bilgisayar1.ad + " fiyati: " + bilgisayar1.fiyat);
        bilgisayar1.indirimUygula();
        System.out.println("Indirimli fiyati: " + bilgisayar1.fiyat);
        System.out.println("----");

        System.out.println(bilgisayar2.ad + " fiyati: " + bilgisayar2.fiyat);
        bilgisayar2.indirimUygula();
        System.out.println("Indirimli fiyati: " + bilgisayar2.fiyat);
        System.out.println("----");

        System.out.println(bilgisayar3.ad + " fiyati: " + bilgisayar3.fiyat);
        bilgisayar3.indirimUygula();
        System.out.println("Indirimli fiyati: " + bilgisayar3.fiyat);
        System.out.println("----");

        System.out.println(telefon1.ad + " fiyati: " + telefon1.fiyat);
        telefon1.indirimUygula();
        System.out.println("Indirimli fiyati: " + telefon1.fiyat);
        System.out.println("----");
        
        System.out.println(telefon2.ad + " fiyati: " + telefon2.fiyat);
        telefon2.indirimUygula();
        System.out.println("Indirim fiyati: " + telefon2.fiyat);
        System.out.println("----");
        
        System.out.println(telefon3.ad + " fiyati: " + telefon3.fiyat);
        telefon3.indirimUygula();
        System.out.println("Indirimli fiyati: " + telefon3.fiyat);
        System.out.println("----");

        sepet1.UrunListele();
        System.out.println("");
        sepet1.UrunEkle(urun3);
        sepet1.satinAl();
        System.out.println("Urun sepete eklenip satin alindi.");
        System.out.println("");
        sepet1.UrunListele();
    }
}
