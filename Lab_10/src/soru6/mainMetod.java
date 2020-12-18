package lab;

public class mainMetod {

    public static void main(String[] args) {
        Kullanici ben = new Kullanici(100, "Muhammed Ali", "Gulcemal", "IcleeKofte", 3);
        Sanatci sanatci = new Sanatci(1, "Aleyna ", "Tilki");
        Sanatci sanatci2 = new Sanatci(2, "Diamond ", "Eyes");
        Muzik muzik = new Muzik(100, "Sen Olsan Bari", sanatci);
        Muzik muzik2 = new Muzik(101, "Everything", sanatci2);
        Muzik muzik3 = new Muzik(102, "Bu Benim Masalim ", sanatci);
        Muzik muzik4 = new Muzik(103, "Silinen Yerine Eklemelik Sarki", sanatci2);
        ben.muzikEkle(muzik);
        ben.muzikEkle(muzik2);
        ben.muzikEkle(muzik3);
        ben.muzikEkle(muzik4);
        ben.muzikListele();
        ben.muzikSil(muzik);
        System.out.println("Kullanici'nin idsi: " + ben.getId() + "\nKullanici'nin adi: " + ben.getAd() + "\nKullanici'nin soyadi: " + ben.getSoyad() + "\nKullanici'nin kullaniciadi: " + ben.getKullanici_adi());
        System.out.println("--------------------------");
        muzik3.setSanatci(sanatci2);
        ben.muzikEkle(muzik4);
        muzik2.setIsim("Flutter");
        ben.muzikListele();
        ben.setId(2);
        ben.setAd("Mahmut");
        ben.setSoyad("Kemal");
        ben.setKullanici_adi("Bimu224");
        System.out.println("Kullanici'nin idsi: " + ben.getId() + "\nKullanici'nin adi: " + ben.getAd() + "\nKullanici'nin soyadi: " + ben.getSoyad() + "\nKullanici'nin kullaniciadi: " + ben.getKullanici_adi());

    }

}
