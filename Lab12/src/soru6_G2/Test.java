package soru;

public class Test {

    public static void main(String[] args) {
        Telefon telefon1 = new Telefon("iPhone", 5500, 1);
        Telefon telefon2 = new Telefon("Samsung", 4000, 2);
        Bilgisayar bilgisayar1 = new Bilgisayar("Mac", 8000);
        Bilgisayar bilgisayar2 = new Bilgisayar("Lenovo", 4000);
        Kullanici yusuf = new Kullanici("Yusuf Kaya");
        Sepet sepet1 = new Sepet(yusuf);
        telefon1.indirimUygula();
        bilgisayar1.indirimUygula();
        sepet1.urunEkle(telefon1);
        sepet1.urunEkle(telefon2);
        sepet1.urunEkle(bilgisayar1);
        sepet1.urunEkle(bilgisayar2);
        sepet1.satinAl();
        yusuf.urunListele();
        int telefonSayisi = 0;
        int bilgisayarSayisi = 0;
        for (Urun urun : yusuf.getUrunListesi()) {
            if (urun instanceof Telefon) {
                telefonSayisi++;
            }
            if (urun instanceof Bilgisayar) {
                bilgisayarSayisi++;
            }
        }
        System.out.println("Bilgisayar Sayisi: " + bilgisayarSayisi + "\nTelefon Sayisi: " + telefonSayisi);

    }

}
