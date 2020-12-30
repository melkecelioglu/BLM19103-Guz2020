package Soru3;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Ogrenci extends Kullanici implements IOdemeIslemleri, IBiletIslemleri {

    public Ogrenci(String adSoyad, int yas, String tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Adı ve Soyadı: " + super.getAdSoyad() + "\nYasi: " + super.getYas() + "\nTC Numarasi: " + super.getTcNo() + "\nBakiyesi: " + super.getBakiye());
        System.out.println("Kullanicinin aldigi biletlerin bilgileri: ");
        for (int i = 0; i < getKullaniciSeansListesi().size(); i++) {
            System.out.print("Seans Id: " + super.getKullaniciSeansListesi().get(i).getSeansId()
                    + " Seans Saati: " + super.getKullaniciSeansListesi().get(i).getSeansSaati()
                    + " Film Id: " + super.getKullaniciSeansListesi().get(i).getFilm().getFilmId()
                    + " Film adi: " + super.getKullaniciSeansListesi().get(i).getFilm().getAd()
                    + " Film Turu: " + super.getKullaniciSeansListesi().get(i).getFilm().getTur()
                    + " Film Ucreti: " + super.getKullaniciSeansListesi().get(i).getFilm().getUcret() + "\n");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void kartOdeme(Seans s) {
        if (getYas() >= 18) {
            if (getBakiye() >= s.getFilm().getUcret() * 80 / 100) {
                satinAl(s);
            } else {
                System.out.println("Bakiye yetersiz!");
            }
        } else {
            System.out.println("Ogrencinin yasi kucuk. Kartla odeme yapamaz!");
        }
    }

    @Override
    public void nakitOdeme(Seans s) {
        if (getBakiye() >= s.getFilm().getUcret() * 80 / 100) {
            satinAl(s);
        } 
        else {
            System.out.println("Bakiye yetersiz!");
        }
    }

    @Override
    public void satinAl(Seans p) {
        getKullaniciSeansListesi().add(p);
        setBakiye(getBakiye() - p.getFilm().getUcret() * 80 / 100);
        System.out.println(p.getFilm().getAd() + " filmi eklendi!");
    }
}
