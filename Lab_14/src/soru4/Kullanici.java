/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

/**
 *
 * @author melikekecelioglu
 */
public abstract class Kullanici {

    protected String adSoyad;
    protected String kullanici_adi;
    protected Gazete gazete;

    abstract void bilgileriYazdir();

    public Kullanici(String adSoyad, String kullanici_adi, Gazete gazete) {
        this.adSoyad = adSoyad;
        this.kullanici_adi = kullanici_adi;
        this.gazete = gazete;
    }

    public Kullanici() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

}
