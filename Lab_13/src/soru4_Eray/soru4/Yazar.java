/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

/**
 *
 * @author TR
 */
public class Yazar extends Kullanici implements IHaberIslemleri{

    public Yazar(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Ad Soyad: " + getAdSoyad());
        System.out.println("Kullanici adi: " + getKullanici_adi());
        System.out.println("Gazete: " + getGazete().getAd());
        
    }

    @Override
    public void haberEkle(Haber h) {
       h.setYazar(this);
    }
    
}
