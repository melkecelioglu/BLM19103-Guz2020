package Soru6;

/**
 *
 * @author ayza
 */
public class Urun {
    String ad;
    String kategori;
    double fiyat;

    public Urun(String ad, String kategori, double fiyat) {
        this.ad = ad;
        this.kategori = kategori;
        this.fiyat = fiyat;
    }
    
    public void indirimUygula(){
        fiyat=fiyat-(fiyat*5)/100;
    }

}
