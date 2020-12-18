package LabDersi;

public class sorum {

    public static void main(String[] args) {
        Duzenleyici duzenleyici = new Duzenleyici(10);

        Kullanici kullanici1 = new Kullanici(202122, "Kullanici adi");
        Kullanici kullanici2 = new Kullanici(202123, "Ad Soyad");

        Konu konu1 = new Konu(00001, "kritik hesaplamalar", "<ilginc karakterlr!?'>");
        Konu konu2 = new Konu(00002, "alisilmisin disinda artis", "ë K4r4kt£r");
        Konu konu3 = new Konu(00003, "genel bir seyler", "v315//**^$<,");

        kullanici1.konuEkle(konu1);
        kullanici1.konuEkle(konu2);
        kullanici1.konuEkle(konu3);

        kullanici2.konuEkle(konu1);
        kullanici2.konuEkle(konu3);

        duzenleyici.kullaniciEkle(kullanici1);
        duzenleyici.kullaniciEkle(kullanici2);

        Kullanici anlikKullanici;
        Konu anlikKonu;
        String donusum;
        char[] grup = {'a', 'b', 'c'};

        for (int i = 0; i < duzenleyici.getMevcutKullanici(); i++) {
            anlikKullanici = duzenleyici.getKullaniciListesi()[i];
            for (int j = 0; j < anlikKullanici.getKonuMiktari(); j++) {
                anlikKonu = anlikKullanici.getKonuListesi()[j];
                donusum = duzenleyici.replace(anlikKonu.getAciklama(), grup, '*');
                anlikKonu.setAciklama(donusum);
            }
            System.out.println(anlikKullanici.getKullaniciAdi() + " kisisinin duzenlenmis konulari: ");
            anlikKullanici.konuListele();
            System.out.println("********************************************");
        }

    }
}
