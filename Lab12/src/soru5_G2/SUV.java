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
public class SUV extends Otomobil {
    
    int cekisGucu;
    double vergi_bedeli = 0.20;
    
    public SUV(String marka, String model, int beygirGucu, int satisFiyati) {
        super(marka, model, beygirGucu, satisFiyati);
    }
    
    @Override
    public double satisFiyatiHesapla(){
        satisFiyati += satisFiyati * vergi_bedeli + 4* beygirGucu;
        return satisFiyati;
    }
    
    
}
