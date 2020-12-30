/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author beyza
 */
public class Yazar extends Kullanici implements IHaberIslemleri{

    public Yazar(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Kullanıcı adı soyadı: " + super.getAdSoyad());
        System.out.println("Kullanıcı adı: " + super.getKullanici_adi());
    }

    @Override
    public void haberEkle(Haber h) {
        h.setYazar(this);
    }
    
}
