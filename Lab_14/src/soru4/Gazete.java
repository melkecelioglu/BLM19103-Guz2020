/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author melikekecelioglu
 */
public class Gazete {

    protected String ad;
    protected int kurulus_yil;
    protected Haber[] haberListesi = new Haber[10];
    protected Kullanici[] kullaniciListesi = new Kullanici[5];

    void yazarEkle(Kullanici k) {

        boolean dolu = true;

        for (int i = 0; i < kullaniciListesi.length; i++) {
            if (kullaniciListesi[i] == null) {
                kullaniciListesi[i] = k;
                dolu = false;
                break;
            }
        }

        try {
            if (dolu == true) {
                kullaniciListesi = Arrays.copyOf(kullaniciListesi, kullaniciListesi.length * 2);
                throw new BoyutTasmaHatasi("Dizi Boyutu Aşıldı.");

            }

        } catch (BoyutTasmaHatasi e) {
            System.out.println(e);
        }

    }
    
    void haberEkle(Haber h) {

        boolean dolu = true;

        for (int i = 0; i < haberListesi.length; i++) {
            if (haberListesi[i] == null) {
                haberListesi[i] = h;
                dolu = false;
                break;
            }
        }

        try {
            if (dolu == true) {
                haberListesi = Arrays.copyOf(haberListesi, haberListesi.length * 2);
                throw new BoyutTasmaHatasi("Dizi Boyutu Aşıldı.");

            }

        } catch (BoyutTasmaHatasi e) {
            System.out.println(e);
        }

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulus_yil() {
        return kurulus_yil;
    }

    public void setKurulus_yil(int kurulus_yil) {
        this.kurulus_yil = kurulus_yil;
    }

    public Haber[] getHaberListesi() {
        return haberListesi;
    }

    public void setHaberListesi(Haber[] haberListesi) {
        this.haberListesi = haberListesi;
    }

    public Kullanici[] getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void setKullaniciListesi(Kullanici[] kullaniciListesi) {
        this.kullaniciListesi = kullaniciListesi;
    }

    public Gazete(String ad, int kurulus_yil) {
        this.ad = ad;
        this.kurulus_yil = kurulus_yil;
    }

    void yazarListele() {

        for (int i = 0; i < kullaniciListesi.length; i++) {
            try {
                if (kullaniciListesi[i] == null) {
                    throw new NullElemanKontrol(i + ". indeks null");
                } else {
                    System.out.println("" + kullaniciListesi[i].adSoyad);
                    System.out.println("" + kullaniciListesi[i].kullanici_adi);
                    System.out.println("" + kullaniciListesi[i].gazete.getAd());
                    System.out.println("-----------------------");
                }
            } catch (NullElemanKontrol e) {
                System.out.println(e);
            }

        }

    }

    void haberListele() {
        for (int i = 0; i < haberListesi.length; i++) {
            if (haberListesi[i] != null) {
                System.out.println(i + "'ci haberin basligi:  " + haberListesi[i].baslik);
                System.out.println(i + "'ci haberin numarasi: " + haberListesi[i].haberNo);
                System.out.println(i + "'ci haberin aciklamasi: " + haberListesi[i].aciklama);
                System.out.println(i + "'ci haberin yazari: " + haberListesi[i].yazar.getAdSoyad());
            }
        }
    }

}
