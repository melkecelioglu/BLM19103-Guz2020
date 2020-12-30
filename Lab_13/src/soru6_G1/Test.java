package lab13;

public class Test {

    public static void main(String[] args) {

        Kullanici k1 = new PremiumKullanici("Mehmet Yılmaz");
        Kullanici k2 = new StandartKullanici("Tuğba Yılmaz");

        PremiumKullanici p1 = new PremiumKullanici("Ali Aksoy");

        Urun u1 = new Urun("Buzdolabı", "elektronik", 5000);
        Urun u2 = new Urun("Fırın", "elektronik", 10000);
        Urun u3 = new Urun("televizyon", "elektronik", 6000);

        Sepet s1 = new Sepet(k2);
        Sepet s2 = new Sepet(k1);

        Telefon t1 = new Telefon("telefon", "elektronik", 3000, 2);
        t1.indirimUygula();
        Bilgisayar b1 = new Bilgisayar("Bilgisayar", "elektronik", 8000);
        b1.indirimUygula();

        s1.urunEkle(u1);
        s1.urunEkle(u2);
        s1.urunEkle(t1);
        s1.satinAl();
        k2.urunListele();
   
        System.out.println("***************************************");
        s2.urunEkle(u3);
        s2.urunEkle(b1);
        s2.satinAl();
        k1.urunListele();

    }
}
