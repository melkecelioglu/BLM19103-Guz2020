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
public class Kullanici {
    private String adSoyad;
    private ArrayList <Otomobil> aracListesi;
    
    public Kullanici(String adSoyad){
        this.adSoyad = adSoyad;
        this.aracListesi = new ArrayList<>();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }

    public void setAracListesi(ArrayList<Otomobil> aracListesi) {
        this.aracListesi = aracListesi;
    }
    
}
