package Soru3;

import java.util.ArrayList;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Sinema {
    private String ad;
    private ArrayList <Seans> sinemaSeansListesi;

    public Sinema(String ad) {
        this.ad = ad;
        this.sinemaSeansListesi = new ArrayList <> ();
    }

    public String getAd() {
        return ad;
    }

    public ArrayList<Seans> getSinemaSeansListesi() {
        return sinemaSeansListesi;
    }
    
    public void seansEkle (Seans seans) {
        sinemaSeansListesi.add(seans);
    }
    
    public void biletSat (Kullanici kullanici, Seans seans) {
        int birYaDaSifir = (int)(Math.random() * 2);
        if (birYaDaSifir == 1) {
            kullanici.kartOdeme(seans);
        }
        else {
            kullanici.nakitOdeme(seans);
        }
    }
}