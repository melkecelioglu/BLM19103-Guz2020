package lab13;

public class Bilgisayar extends Urun implements IIndirimIslemleri {

    public Bilgisayar(String ad, String kategori, double fiyat) {
        super(ad, kategori, fiyat);
    }

    @Override
    public void indirimUygula() {
        setFiyat(getFiyat() - (getFiyat() * 20) / 100);
    }
}
