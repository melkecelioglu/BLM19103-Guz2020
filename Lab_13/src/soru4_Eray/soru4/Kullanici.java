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
public abstract class Kullanici {
    
    private String adSoyad;
    private String kullanici_adi;
    private Gazete gazete;

    public Kullanici(String adSoyad, String kullanici_adi, Gazete gazete) {
        this.adSoyad = adSoyad;
        this.kullanici_adi = kullanici_adi;
        this.gazete = gazete;
    }
    
    public abstract void bilgileriYazdir();

    public String getAdSoyad() {
        return adSoyad;
    }

    public Gazete getGazete() {
        return gazete;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }
    
    
    
}
