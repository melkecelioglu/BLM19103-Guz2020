package Soru3;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Emekli extends Kullanici implements IOdemeIslemleri, IBiletIslemleri {

    private int kartSayisi, nakitSayisi;
    
    public Emekli(String adSoyad, int yas, String tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Adı ve Soyadı: " + super.getAdSoyad() + "\nYasi: " + super.getYas() + "\nTC Numarasi: " + super.getTcNo() + "\nBakiyesi: " + super.getBakiye());
        System.out.println("Kullanicinin aldigi biletlerin bilgileri: ");
        for (int i = 0; i < super.getKullaniciSeansListesi().size(); i++) {
            System.out.print("Seans Id: " + super.getKullaniciSeansListesi().get(i).getSeansId() 
                    + " Seans Saati: " + super.getKullaniciSeansListesi().get(i).getSeansSaati()
                    + " Film Id: " + super.getKullaniciSeansListesi().get(i).getFilm().getFilmId() 
                    + " Film adi: " + super.getKullaniciSeansListesi().get(i).getFilm().getAd()
                    + " Film Turu: " + super.getKullaniciSeansListesi().get(i).getFilm().getTur() 
                    + " Film Ucreti: " + super.getKullaniciSeansListesi().get(i).getFilm().getUcret() + "\n");
        }
        System.out.println("Kart ile alinan bilet sayisi: " + kartSayisi + " Nakit ile alinan bilet sayisi: " + nakitSayisi);
        System.out.println("-----------------------------------------------------------------------------------------------------------------");    }

    @Override
    public void kartOdeme(Seans s) {
        if (super.getBakiye() >= s.getFilm().getUcret() * 85 / 100) {
            satinAl(s);
            kartSayisi++;
        }
        else {
            System.out.println("Bakiye yetersiz!");
        }
    }

    @Override
    public void nakitOdeme(Seans s) {
        if (super.getBakiye() >= s.getFilm().getUcret() * 85 / 100){
            satinAl(s);
            setBakiye(getBakiye() + s.getFilm().getUcret() / 100);
            nakitSayisi++;
        }
        else {
            System.out.println("Bakiye yetersiz!");
        }
    }

    @Override
    public void satinAl(Seans p) {
        getKullaniciSeansListesi().add(p);
        setBakiye(getBakiye() - p.getFilm().getUcret() * 85 / 100);
        System.out.println(p.getFilm().getAd() + " filmi eklendi!");
    }
}


