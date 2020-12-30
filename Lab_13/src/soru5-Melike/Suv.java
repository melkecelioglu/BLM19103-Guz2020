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
public class Suv extends Otomobil implements IModifiyeIslemleri,ISatisIslemleri{

    @Override
    void bilgileriYazdir() {
         System.out.println("Marka: "+this.marka);
        System.out.println("Model: "+this.model);
        System.out.println("Bygir Gucu:"+this.beygirGucu);
        System.out.println("Satis fiyati: "+this.satisFiyati);
        System.out.println("Kullanici: "+this.kullanici);
        
    }

    @Override
    public void navigasyonEkle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void parkSensoruEkle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void satisFiyatiHesapla() {
        this.satisFiyati=satisFiyati*15/100+(4*beygirGucu);
   }
    
}
