/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarct2;

import java.util.ArrayList;

/**
 *
 * @author ebrar
 */
public abstract class Otomobil {

    protected String marka;
    protected String model;
    protected int beygirGucu;
    protected int satisFiyati;
    protected Kullanici kullanici;

    public Otomobil(String marka, String model, int satisFiyati, int beygirGucu) {
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
        satisFiyatiHesapla();

    }

    public void satisFiyatiHesapla() {

    }

    abstract void bilgileriYazdir();

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public int getSatisFiyati() {
        return satisFiyati;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

}
