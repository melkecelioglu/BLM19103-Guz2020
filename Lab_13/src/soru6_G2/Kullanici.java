/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.ArrayList;

/**
 *
 * @author Tz Group
 */
public abstract class Kullanıcı {
    private String ad;
    private String soyad;
    private ArrayList<Urun>urunListesi;

    public Kullanıcı(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.urunListesi = new ArrayList<>();
    }
    
    public void urunListele(){
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println("Alınan Ürün adı: " + urunListesi.get(i).getAd());
            System.out.println("Katagori adı: " + urunListesi.get(i).getKategori());
            System.out.println("Ürün fiyatı: " + urunListesi.get(i).getFiyat());
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(ArrayList<Urun> urunListesi) {
        this.urunListesi = urunListesi;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void primeKullan(int urunSayisi){
      
    }
    
    
    
    
   }
