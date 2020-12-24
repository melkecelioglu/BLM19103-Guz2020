package kullanici;

public class Emekli extends Kullanici {

    Emekli(String adSoyad, int yas, int tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);
    }

    void biletSatinAl(Seans a) {
        if (bakiye > a.film.ucret) {
            super.biletSatinAl(a);
            bakiye -= (a.film.ucret * 85) / 100;
        } else {
            System.out.println("Bakiye yetersiz!");
        }
    }
}
