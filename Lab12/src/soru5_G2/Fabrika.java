/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsoru;

import java.util.ArrayList;

/**
 *
 * @author berat
 */
public class Fabrika {

    String id;
    int kurulusYili;
    ArrayList otoListesi;

    public Fabrika(String id, int kurulusYili) {
        this.id = id;
        this.kurulusYili = kurulusYili;
        otoListesi = new ArrayList<>();
    }

    public Otomobil otoUret(String Marka, String Model, int beygirGucu, int satisFiyati) {
        double x = Math.random();
        int a = 0;
        if (x > 0.5) {
            a = 1;
        }
        if (a == 1) {
            Otomobil oto1 = new Sedan(Marka, Model, beygirGucu, satisFiyati);
            otoListesi.add(oto1);
            return oto1;
        } else {
            Otomobil oto2 = new SUV(Marka, Model, beygirGucu, satisFiyati);
            otoListesi.add(oto2);
            return oto2;
        }
    }

    public void otoSat(Otomobil oto, Kullanici kul) {
        kul.getAracListesi().add(oto);
        otoListesi.remove(oto);
    }
    
    public void otoSayisi(){
        int x = otoListesi.size();
        System.out.println("Fabrikadaki toplam araba sayisi: "+x);
        int counterSUV = 0;
        for(Object o : otoListesi){
            if(o instanceof SUV){
                counterSUV++;
            } else{
                
            }
        }
    }
    
    
}
