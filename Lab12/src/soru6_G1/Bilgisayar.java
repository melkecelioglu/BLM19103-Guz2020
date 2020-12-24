package Soru6;

/**
 *
 * @author ayza
 */
public class Bilgisayar extends Urun {
    

    public Bilgisayar(String ad, String kategori, double fiyat) {
        super(ad, kategori, fiyat);
    }
    
    @Override
    public void indirimUygula(){
        fiyat=fiyat-(fiyat*20)/100;
    }
}
