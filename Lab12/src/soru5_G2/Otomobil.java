/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsoru;

/**
 *
 * @author berat
 */
public class Otomobil {
    
    String marka;
    String model;
    double beygirGucu;
    double satisFiyati;
    Kullanici kullanici;
    
    public Otomobil(String marka, String model, int beygirGucu, int satisFiyati){
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
        satisFiyatiHesapla();
    }
    
    public double satisFiyatiHesapla(){
        return satisFiyati;
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

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    
   
}
