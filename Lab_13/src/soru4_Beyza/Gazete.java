/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru4;

import java.util.ArrayList;

/**
 *
 * @author ayza
 */
public class Gazete {

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulusYil() {
        return kurulusYil;
    }

    public void setKurulusYil(int kurulusYil) {
        this.kurulusYil = kurulusYil;
    }

    public ArrayList<Kullanici> getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void setKullaniciListesi(ArrayList<Kullanici> kullaniciListesi) {
        this.kullaniciListesi = kullaniciListesi;
    }

    public ArrayList<Haber> getHaberListesi() {
        return haberListesi;
    }

    public void setHaberListesi(ArrayList<Haber> haberListesi) {
        this.haberListesi = haberListesi;
    }
    private String ad;
    private int kurulusYil;
    private ArrayList<Kullanici> kullaniciListesi = new ArrayList<>();
    private ArrayList<Haber> haberListesi = new ArrayList<>();

    public Gazete(String ad, int kurulusYil) {
        this.ad = ad;
        this.kurulusYil = kurulusYil;
    }

    public void yazarEkle(Kullanici kullanici) {
        getKullaniciListesi().add(kullanici);
    }

    public void yazarListele() {
        for (int i = 0; i < getKullaniciListesi().size(); i++) {
            System.out.println("Ad Soyad: " + getKullaniciListesi().get(i).getAdSoyad());
            System.out.println("Kullanici adi: "+ getKullaniciListesi().get(i).getKullaniciAdi());
            
        }
    }
    
    public void haberListele(){
        for (int i = 0; i < getHaberListesi().size(); i++) {
            System.out.println("Aciklama: "+getHaberListesi().get(i).getAciklama());
            System.out.println("Baslik: "+getHaberListesi().get(i).getBaslik());
            System.out.println("Haber no: "+getHaberListesi().get(i).getHaberNo());
            System.out.println("Yazar: "+getHaberListesi().get(i).getYazar());         
        }
    }

}
