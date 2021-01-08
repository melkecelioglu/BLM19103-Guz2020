package soru4;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Admin extends Kullanici implements IHaberIslemleri {

    public Admin(String adSoyad, String kullanici_adi, Gazete gazete) {
//        super(adSoyad, kullanici_adi, gazete);
        this.adSoyad = adSoyad;
        this.kullanici_adi = kullanici_adi;
        this.gazete = gazete;
    }

    void bilgileriYazdir() {
        System.out.println("");
        System.out.println("----Kullanici Bilgileri----");
        System.out.println("Admin ad soyad: " + adSoyad);
        System.out.println("Admin id: " + kullanici_adi);
        System.out.println("Gazete: " + gazete);
        System.out.println("-----------------------------------------");
        System.out.println("haber silidi...");
        System.out.println("güncelledigi bilgiler....");
    }

    public void haberEkle(Haber h) {
        gazete.haberEkle(h);

    }

    void haberGuncelle(Haber h, String icerik){
        boolean varMi = false;

        for (int i = 0; i < gazete.haberListesi.length; i++) {
            if (gazete.haberListesi[i] != null && gazete.haberListesi[i] == h) {
                gazete.haberListesi[i].setAciklama(icerik);
                varMi = true;
            }
        }

        try {
            if (varMi == false) {
                haberEkle(h);
                throw new TekrarKontrol("Haber mevcut değil.");
            }
        } catch (TekrarKontrol e) {
            System.out.println(e);
        }

    }

}
