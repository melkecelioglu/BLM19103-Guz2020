/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

/**
 *
 * @author TR
 */
public abstract class Otomobil {

    private String marka;
    private String model;
    private int beygirGucu = 200;
    private double satisFiyati = 2000;
    private Kullanici kullanici;

    public Otomobil(String marka, String model) {
        this.marka = marka;
        this.model = model;

    }

    abstract void bilgileriYazdir();

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }
    
    

}
