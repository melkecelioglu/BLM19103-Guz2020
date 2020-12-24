package kullanici;

public class Ogrenci extends Kullanici {

    Ogrenci(String adSoyad, int yas, int tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);

    }

    void biletSatinAl(Seans a) {
        if (bakiye > a.film.ucret) {
            super.biletSatinAl(a);
            bakiye -= (a.film.ucret * 80) / 100;
        } else {
            System.out.println("Bakiye yetersiz!");
        }
    }

}
