package soru;

public class Telefon extends Urun {

    private int hatSayisi;

    public Telefon(String ad, int fiyat, int hatSayisi) {
        super(ad, "Telefon", fiyat);
        this.hatSayisi = hatSayisi;
    }

    @Override
    public void indirimUygula() {
        double indirimliFiyat = getFiyat() * (0.90);
        setFiyat(indirimliFiyat);
        if (hatSayisi > 1) {
            indirimliFiyat = getFiyat() * (0.95);
            setFiyat(indirimliFiyat);
        }
    }

}
