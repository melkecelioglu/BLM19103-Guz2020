/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public abstract class Otomobil {
    protected String marka;
    protected String model;
    protected double beygirGucu;
    protected double satisFiyati;
    protected Kullanici kullanici;
     protected ArrayList<Otomobil>ozellikListesi=new ArrayList<Otomobil>();

    public Otomobil() {
       
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(double beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public ArrayList<Otomobil> getOzellikListesi() {
        return ozellikListesi;
    }

    public void setOzellikListesi(ArrayList<Otomobil> ozellikListesi) {
        this.ozellikListesi = ozellikListesi;
    }
    
    
    
  abstract void bilgileriYazdir();
            
    
}
