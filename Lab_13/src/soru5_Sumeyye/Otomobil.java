/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru5;

/**
 *
 * @author dikzu
 */
public abstract class Otomobil {
    private String marka;
    private String model;
    private int beygirGucu;
    private double satisFiyati;
    private Kullanici kullanici;
    
    public Otomobil(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici){
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
        this.kullanici = kullanici;
    }
    
    public Otomobil(String marka, String model, int beygirGucu){
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
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

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
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
    
    public abstract void bilgileriYazdir();
    
}
