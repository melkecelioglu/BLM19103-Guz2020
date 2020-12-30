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
public class Yazar extends Kullanici implements IHaberIslemleri{

    public Yazar(String adSoyad, String kullaniciAdi,Gazete gazete) {
        super(adSoyad, kullaniciAdi,gazete);
    }
    @Override
    public void bilgileriYazdir(){
        System.out.println("Kullanici ad soyad: "+ getAdSoyad());
        System.out.println("Kullanicinin kullanici adi: "+getKullaniciAdi());
        System.out.println("Gazete: "+getGazete().getAd());
        
    }
    
    public void haberEkle(Haber h){
      h.setYazar(this);
    }
    
}
