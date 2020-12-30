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
public class Admin extends Kullanici implements IHaberIslemleri,IYetkiIslemleri{

    public Admin(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Kullanıcı adı soyadı: " + super.getAdSoyad());
        System.out.println("Kullanıcı adı: " + super.getKullanici_adi());
    }

    @Override
    public void haberEkle(Haber h) {
       
        if(h.getYazar() != null){
            super.getGazete().getHaberListesi().add(h);
        }
    }

    @Override
    public void haberSil(Haber h) {
        super.getGazete().getHaberListesi().remove(h);
    }

    @Override
    public void haberGuncelle(Haber h, String icerik) {
        h.setAciklama(icerik);
    }
    
    
   
}
