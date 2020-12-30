/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

/**
 *
 * @author melikekecelioglu
 */
public class Sedan extends Otomobil implements IModifiyeIslemleri,ISatisIslemleri{

    @Override
    void bilgileriYazdir() {
         System.out.println("Marka: "+this.marka);
        System.out.println("Model: "+this.model);
        System.out.println("Bygir Gucu:"+this.beygirGucu);
        System.out.println("Satis fiyati: "+this.satisFiyati);
        System.out.println("Kullanici: "+this.kullanici);
        System.out.println("");
    }

    @Override
    public void navigasyonEkle() {
        ozellikListesi.add(this);
         this.satisFiyati=satisFiyati+2500;
        
   }

    @Override
    public void parkSensoruEkle() {
        ozellikListesi.add(this);
        this.satisFiyati=satisFiyati+1200;
   }

    @Override
    public void satisFiyatiHesapla() {
        this.satisFiyati=satisFiyati*20/100+(4*beygirGucu);
    }
    
}
