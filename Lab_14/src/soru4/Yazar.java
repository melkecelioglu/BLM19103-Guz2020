/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Yazar extends Kullanici implements IHaberIslemleri {
    
    void bilgileriYazdir() {
        System.out.println("----Kullanici Bilgileri----");
        System.out.println("Yazar ad soyad: " + adSoyad);
        System.out.println("Yazar id: " + kullanici_adi);
        System.out.println("Gazete: "+ gazete.getAd());
        System.out.println("----------------------------");
    }

    public void haberEkle(Haber h) {
        h.setYazar(this);
    }

    public Yazar(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }
    

    
    
    
}
