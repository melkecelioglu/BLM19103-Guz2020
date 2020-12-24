package Soru6;

/**
 *
 * @author ayza
 */
public class Telefon extends Urun {

    int hatSayisi;

    public Telefon(int hatSayisi, String ad, String kategori, double fiyat) {
        super(ad, kategori, fiyat);
        this.hatSayisi = hatSayisi;
    }

    @Override
    public void indirimUygula() {
        if (hatSayisi > 1) {
            fiyat = fiyat - (fiyat * 10) / 100 - (fiyat * 5) / 100;
        } else {
            fiyat = fiyat - (fiyat * 10) / 100;
        }
    }
}
