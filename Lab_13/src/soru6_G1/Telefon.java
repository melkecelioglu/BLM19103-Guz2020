package lab13;

public class Telefon extends Urun implements IIndirimIslemleri {

    private int hatSayisi;

    public Telefon(String ad, String kategori, double fiyat) {
        super(ad, kategori, fiyat);
    }

    public Telefon(String ad, String kategori, double fiyat, int hatSayisi) {
        super(ad, kategori, fiyat);
        this.hatSayisi = hatSayisi;
    }

    @Override
    public void indirimUygula() {
        setFiyat(getFiyat() - (getFiyat() * 10) / 100);
        if (hatSayisi > 1) {
            setFiyat(getFiyat() - (getFiyat() * 5) / 100);
        }
    }

}
