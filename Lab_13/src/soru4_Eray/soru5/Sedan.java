/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.ArrayList;

/**
 *
 * @author TR
 */
public class Sedan extends Otomobil implements ISatisIslemleri, IModifiyeIslemleri {
    
    private ArrayList<String> ozellikListesi;
    
    public Sedan(String marka, String model) {
        super(marka, model);
        ozellikListesi = new ArrayList<>();
    }
    
    @Override
    void bilgileriYazdir() {
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Beygir gucu:" + getBeygirGucu());
        System.out.println("Kullanici: " + getKullanici());
        System.out.println("Fiyat: " + getSatisFiyati());
        for (int i = 0; i < ozellikListesi.size(); i++) {
            System.out.println(ozellikListesi.get(i));
            
        }
    }
    
    @Override
    public void satisFiyatiHesapla() {
        setSatisFiyati((getSatisFiyati() * 0.15) + (4 * getBeygirGucu()));
        
    }
    
    @Override
    public void navigasyonEkle() {
        String n = "Navigasyon";
        ozellikListesi.add(n);
        setSatisFiyati(getSatisFiyati() + 2500);
        
    }
    
    @Override
    public void parkSensoruEkle() {
        String p = "Park Sensoru";
        ozellikListesi.add(p);
        setSatisFiyati(getSatisFiyati() + 1200);
        
    }
}
