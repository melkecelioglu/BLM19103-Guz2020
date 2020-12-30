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
public class Sepet  {
    private Kullanıcı sepetSahibi;
    private ArrayList<Urun>urunListesi;
    
    public Sepet(Kullanıcı sepetSahibi){
        this.sepetSahibi = sepetSahibi;
        this.urunListesi = new ArrayList<>();
        
    }
    
    public void urunEkle(Urun urun){
        getUrunListesi().add(urun);
    }
    
    public void satınAl(){
        if(getSepetSahibi() instanceof PremiumKullanici){
            getSepetSahibi().primeKullan(getUrunListesi().size());
    }
        for (int i = 0; i < getUrunListesi().size(); i++) {
            getSepetSahibi().getUrunListesi().add(getUrunListesi().get(i));
        }
       
        urunListesi.removeAll(urunListesi);
        
    }
    
    
    
     public void sepettekiUrunYazdırma(){
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println("Alınan Ürün adı: " + urunListesi.get(i).getAd());
            System.out.println("Katagori adı: " + urunListesi.get(i).getKategori());
            System.out.println("Ürün fiyatı: " + urunListesi.get(i).getFiyat());
        }
    }

    public Kullanıcı getSepetSahibi() {
        return sepetSahibi;
    }

    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }
    
    
}
