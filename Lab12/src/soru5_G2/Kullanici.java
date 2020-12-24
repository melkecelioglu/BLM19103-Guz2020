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
public class Kullanici {
    
    String adSoyad;
    ArrayList<Otomobil> aracListesi;
    
    public Kullanici(String adSoyad){
        
        this.adSoyad = adSoyad;
        aracListesi = new ArrayList<>();
        
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAracListesi(ArrayList<Otomobil> aracListesi) {
        this.aracListesi = aracListesi;
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }
    
    
    
    public void aracListele(){
        System.out.println(getAdSoyad()+"'in Araclari:");
        for(int i=0;i<aracListesi.size();i++){
            System.out.println("Marka: " + aracListesi.get(i).getMarka()+"/ Model: "+aracListesi.get(i).getModel()+"/ Beygir Gücü: "+ aracListesi.get(i).getBeygirGucu()+ "/ Satış Fiyatı: " + aracListesi.get(i).getSatisFiyati());
        }
    }
    
}

