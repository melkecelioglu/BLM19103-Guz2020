package lab12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beyza
 */
import java.util.ArrayList;
public class Gazete {
    
    private String ad;
    private int kurulus_yil;
    private ArrayList<Kullanici>kullaniciListesi;
    private ArrayList<Haber>haberListesi;

    public Gazete(String ad, int kurulus_yil) {
        this.ad = ad;
        this.kurulus_yil = kurulus_yil;
        this.kullaniciListesi = new ArrayList<>();
        this.haberListesi = new ArrayList<>();
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
    
    public void yazarEkle(Kullanici kullanici){
        kullaniciListesi.add(kullanici);
    }
    
    public void yazarListele(){
        for(int i =0;i<kullaniciListesi.size();i++){
            System.out.println("Kullanıcı adı soyadı: " + kullaniciListesi.get(i).getAdSoyad());
            System.out.println("Kullanıcı adı: " + kullaniciListesi.get(i).getKullanici_adi());
            
        }
    }
    public void haberListele(){
        for(int i=0;i<haberListesi.size();i++){
            System.out.println("Haber başlığı: " + haberListesi.get(i).getBaslik());
            System.out.println("Haber açıklaması: " + haberListesi.get(i).getAciklama());
            System.out.println("Haber no: " + haberListesi.get(i).getHaberNo());
            System.out.println("Haber yazarı: " + haberListesi.get(i).getYazar().getAdSoyad());
        }
    }
    
}
