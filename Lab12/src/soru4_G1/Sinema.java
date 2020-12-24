package kullanıcı;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Sinema {

    private String ad;
    private ArrayList<Seans> seansListesi = new ArrayList<Seans>();
    private int seans_saati;

    public Sinema(String ad) {
        this.ad = ad;
        

    }

    public void seansEkle(Seans seans) {
        getSeansListesi().add(seans);
    }

    public void biletSat(Kullanıcı kullanici1, Seans seans1) {
            if (kullanici1 instanceof Emekli && seans1.getSeans_saati()> 16) {
                System.out.println("16'dan sonra Emeklilere bilet satisi yapilmaz..");
            } else if (kullanici1 instanceof Ogrenci) {
                kullanici1.biletSatinAl(seans1);
                System.out.println("ogrenci aliyor..");

            } else if (seans1.getSeans_saati() < 16) {
                kullanici1.biletSatinAl(seans1);
            } else {
                
                
            }
        

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Seans> getSeansListesi() {
        return seansListesi;
    }

    public void setSeansListesi(ArrayList<Seans> seansListesi) {
        this.seansListesi = seansListesi;
    }

    public int getSeans_saati() {
        return seans_saati;
    }

    public void setSeans_saati(int seans_saati) {
        this.seans_saati = seans_saati;
    }

}
