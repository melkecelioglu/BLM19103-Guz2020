/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soru4;

/**
 *
 * @author ayza
 */
public abstract class Kullanici {

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public Gazete getGazete() {
        return gazete;
    }

    public void setGazete(Gazete gazete) {
        this.gazete = gazete;
    }
    private String adSoyad;
    private String kullaniciAdi;
    private Gazete gazete;

    public Kullanici(String adSoyad, String kullaniciAdi,Gazete gazete) {
        this.adSoyad = adSoyad;
        this.kullaniciAdi = kullaniciAdi;
        this.gazete=gazete;
    }
    
    public abstract void bilgileriYazdir(); 
}
