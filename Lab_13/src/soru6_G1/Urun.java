package lab13;

public class Urun {

    protected String ad;
    protected String kategori;
    protected double fiyat;

    public Urun(String ad, String kategori, double fiyat) {
        this.ad = ad;
        this.kategori = kategori;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

}
