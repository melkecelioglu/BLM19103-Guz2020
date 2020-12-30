/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Gazete {

    protected String ad;
    protected int kurulus_yil;
    protected ArrayList<Haber> haberListesi = new ArrayList<Haber>();
    protected ArrayList<Kullanici> kullaniciListesi = new ArrayList<Kullanici>();

    void yazarEkle(Kullanici k) {
        kullaniciListesi.add(k);
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

    public ArrayList<Haber> getHaberListesi() {
        return haberListesi;
    }

    public void setHaberListesi(ArrayList<Haber> haberListesi) {
        this.haberListesi = haberListesi;
    }

    public ArrayList<Kullanici> getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void setKullaniciListesi(ArrayList<Kullanici> kullaniciListesi) {
        this.kullaniciListesi = kullaniciListesi;
    }
    


    public Gazete(String ad, int kurulus_yil) {
        this.ad = ad;
        this.kurulus_yil = kurulus_yil;
    }
    
    void yazarListele() {
        for (int i = 0; i < kullaniciListesi.size(); i++) {
            System.out.println("" + kullaniciListesi.get(i).adSoyad);
            System.out.println("" + kullaniciListesi.get(i).kullanici_adi);
            System.out.println("" + kullaniciListesi.get(i).gazete);
        }

    }

    void haberListele() {
        for (int i = 0; i < haberListesi.size(); i++) {
            System.out.println(i + "'ci haberin basligi:  " + haberListesi.get(i).baslik);
            System.out.println(i + "'ci haberin numarasi: " + haberListesi.get(i).haberNo);
            System.out.println(i + "'ci haberin aciklamasi: " + haberListesi.get(i).aciklama);
            System.out.println(i + "'ci haberin yazari: " + haberListesi.get(i).yazar);
        }
    }

}
