/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru5;

import java.util.ArrayList;

/**
 *
 * @author dikzu
 */
public class Fabrika {
    private int id;
    private int kurulusYili;
    private ArrayList <Otomobil> otoListesi; 
    
    public Fabrika (int id, int kurulus_yili){
        this.id = id;
        this.kurulusYili = kurulus_yili;
        this.otoListesi = new ArrayList<>();
    }
     
    public void otoUret(String marka, String model,int beygirGucu){
        double x = Math.random();
        if(x > 0.5){
            Suv suv = new Suv(marka, model, beygirGucu);
            this.otoListesi.add(suv);
            suv.satisFiyatiHesapla();
            
        }
        else{
            Sedan sedan = new Sedan (marka, model, beygirGucu);
            this.otoListesi.add(sedan);
            sedan.satisFiyatiHesapla();
           
        }
    }
    
    public void otoSat(Kullanici kul, Otomobil oto){
        this.otoListesi.remove(oto);
        kul.getAracListesi().add(oto);
        oto.setKullanici(kul);
    }
    
    public void modifiyeEt(Otomobil oto){
        if(oto instanceof Sedan){
            int a = (int) (Math.random() * 3);
            if(a == 0){
                ((Sedan) oto).navigasyonEkle();
            }
            else if(a == 1){
                ((Sedan) oto).parkSensoruEkle();
                
            }else {
                ((Sedan) oto).parkSensoruEkle();
                ((Sedan) oto).navigasyonEkle();
            }
        }
    }
    
    public void otoListele(){
        for (int i = 0; i < this.otoListesi.size(); i++) {
            this.otoListesi.get(i).bilgileriYazdir();
        }
    }
}
