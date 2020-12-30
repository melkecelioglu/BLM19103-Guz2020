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
public class Admin extends Kullanici implements IHaberIslemleri, IYetkiIslemleri {
    
    public Admin(String adSoyad, String kullaniciAdi, Gazete gazete) {
        super(adSoyad, kullaniciAdi, gazete);
    }


    public void bilgileriYazdir() {
        System.out.println("Kullanici ad soyad: " + getAdSoyad());
        System.out.println("Kullanicinin kullanici adi: " + getKullaniciAdi());
        System.out.println("Gazete: " + getGazete().getAd());
    }
    
    public void haberEkle(Haber h) {
        if (h.getYazar() != null) {
            getGazete().getHaberListesi().add(h);
        }
    }

    public void haberSil(Haber h) {
        getGazete().getHaberListesi().remove(h);
    }
    
    public void haberGuncelle(Haber h, String icerik) {
        for (int i = 0; i < getGazete().getHaberListesi().size(); i++) {
            if (getGazete().getHaberListesi().get(i) == h) {
                getGazete().getHaberListesi().get(i).setAciklama(icerik);               
            }     
        }
    }
}
