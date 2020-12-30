package Soru3;

import java.util.ArrayList;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public abstract class Kullanici {
    private String adSoyad, tcNo;
    private int yas;
    private double bakiye;
    private ArrayList <Seans> kullaniciSeansListesi;

    public Kullanici(String adSoyad, int yas, String tcNo, double bakiye) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.tcNo = tcNo;
        this.bakiye = bakiye;
        this.kullaniciSeansListesi = new ArrayList <> ();
    }
    
    public abstract void bilgileriYazdir();
    
    public abstract void nakitOdeme(Seans s);
    
    public abstract void kartOdeme(Seans s);
    
    public String getAdSoyad() {
        return adSoyad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getTcNo() {
        return tcNo;
    }

    public int getYas() {
        return yas;
    }
    
    public ArrayList<Seans> getKullaniciSeansListesi() {
        return kullaniciSeansListesi;
    }
    
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    
}