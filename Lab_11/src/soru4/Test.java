/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

/**
 *
 * @author zekikus
 */
public class Test {

    public static void main(String[] args) {

        WebSite site = new WebSite("A Sitesi"); // isim: A Sitesi
        Kullanici k1 = new Kullanici(12345, "blm_deneme"); // id: 12345, kullanici_adi: blm_deneme 
        Yorum y1 = new Yorum("<Tehlikeli Yorum>");
        Yorum y2 = new Yorum("Yasak K4r4kt£r");
        k1.yorumYap(y1); // Kullanıcının yorumListesine bu yorum eklendi
        k1.yorumYap(y2); // Kullanıcının yorumListesine bu yorum eklendi
        site.kullaniciEkle(k1); // Sitenin kullaniciListesine bu kullanıcı eklendi
        
        // Düzenleme Metotlarımızı Çağırıyoruz.
        for (int i = 0; i < site.getKullaniciListesi().size(); i++) {
            Kullanici kullanici = site.getKullaniciListesi().get(i); // i. kullanıcıyı getir 
            
            for (int j = 0; j < kullanici.getYorum_listesi().size(); j++) {
               
                Yorum yorum = kullanici.getYorum_listesi().get(j); // Kullanıcının j. yorumunu getir
                char[] yasakliKarakterler = {'<', '>', '4', '£'};
                String duzenlenmis_icerik = site.delete(yorum.getIcerik(), yasakliKarakterler); // Tehlikeli Yorum 
                // Set metodu ile "j. indeksteki" yorumun icerik bilgisi yenisi ile değiştirilir.
                yorum.setIcerik(duzenlenmis_icerik);
            }
            kullanici.yorumListele(); // Tehlikeli Yorum // Yasak Krktr

        }

    }
}
