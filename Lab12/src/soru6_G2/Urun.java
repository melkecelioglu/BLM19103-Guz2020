package soru;

public class Urun {

    private String ad;
    private String kategori;
    private double fiyat;

    public Urun(String ad, String kategori, double fiyat) {
        this.ad = ad;
        this.kategori = kategori;
        this.fiyat = fiyat;
    }

    public void indirimUygula() {
        fiyat = fiyat * (95 / 100);
    }

    @Override
    public String toString() {
        return "Kategori: " + kategori + "\nAd: " + ad + "\nFiyat: " + fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

}
