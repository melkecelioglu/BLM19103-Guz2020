/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.ArrayList;

/**
 *
 * @author TR
 */
public class Kullanici {
    
    private String adSoyad;
    private ArrayList <Otomobil> aracListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        this.aracListesi = new ArrayList<>();
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }
    
    
    
    
    
    
    
}
