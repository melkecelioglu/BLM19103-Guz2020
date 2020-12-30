/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.ArrayList;

/**
 *
 * @author TR
 */
public class Gazete {

    private String ad;
    private int kurulus_yili;
    private ArrayList<Kullanici> kullaniciListesi;
    private ArrayList<Haber> haberListesi;

    public Gazete(String ad, int kurulus_yili) {
        this.ad = ad;
        this.kurulus_yili = kurulus_yili;
        this.kullaniciListesi = new ArrayList<>();
        this.haberListesi = new ArrayList<>();
    }

    void yazarEkle(Kullanici yazar) {
        kullaniciListesi.add(yazar);
    }

    void yazarListele() {
        for (int i = 0; i < kullaniciListesi.size(); i++) {
            System.out.println("Ad soyad: " + kullaniciListesi.get(i).getAdSoyad());
            System.out.println("Kullanici adi: " + kullaniciListesi.get(i).getKullanici_adi());

        }
    }

    void haberListele() {
        for (int i = 0; i < haberListesi.size(); i++) {
            System.out.println("Haber no: " + haberListesi.get(i).getHaberNo());
            System.out.println("Baslik: " + haberListesi.get(i).getBaslik());
            System.out.println("Aciklama: " + haberListesi.get(i).getAciklama());
            System.out.println("Yazar: " + haberListesi.get(i).getYazar().getAdSoyad());

        }

    }

    public ArrayList<Haber> getHaberListesi() {
        return haberListesi;
    }

    public void setHaberListesi(ArrayList<Haber> haberListesi) {
        this.haberListesi = haberListesi;
    }

    public String getAd() {
        return ad;
    }
    
    
    
    

}
