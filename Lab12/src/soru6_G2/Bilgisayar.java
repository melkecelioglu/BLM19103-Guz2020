package soru;

public class Bilgisayar extends Urun {

    public Bilgisayar(String ad, int fiyat) {
        super(ad, "Bilgisayar", fiyat);
    }

    @Override
    public void indirimUygula() {
        double indirimliFiyat = getFiyat() * (0.80);
        setFiyat(indirimliFiyat);
    }
}
