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
public class Admin extends Kullanici implements IHaberIslemleri, IYetkiIslemleri {
    
    int haberGuncelleSayisi;
    int haberSilinmeSayisi;

    public Admin(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Ad Soyad: " + getAdSoyad());
        System.out.println("Kullanici adi: " + getKullanici_adi());
        System.out.println("Gazete: " + getGazete().getAd());
        System.out.println("Haber silinme sayisi: " + haberSilinmeSayisi);
        System.out.println("Haber guncelleme sayisi: " + haberGuncelleSayisi);
    }

    @Override
    public void haberEkle(Haber h) {
        if (h.getYazar() != null) {
            getGazete().getHaberListesi().add(h);

        }

    }

    @Override
    public void haberSil(Haber h) {
        haberSilinmeSayisi++;
        getGazete().getHaberListesi().remove(h);

    }

    @Override
    public void haberGuncelle(Haber h, String icerik) {
        for (int i = 0; i < getGazete().getHaberListesi().size(); i++) {
            if (getGazete().getHaberListesi().get(i) == h) {
                getGazete().getHaberListesi().get(i).setAciklama(icerik);
                haberGuncelleSayisi++;

            }

        }

    }

}
