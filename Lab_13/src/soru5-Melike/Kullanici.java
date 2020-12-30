/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Kullanici {
    protected String adSoyad;
    protected ArrayList<Otomobil>aracListesi=new ArrayList<Otomobil>();
    protected ArrayList<Otomobil>ozellikListesi=new ArrayList<Otomobil>();

    public Kullanici() {
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

    public ArrayList<Otomobil> getOzellikListesi() {
        return ozellikListesi;
    }

    public void setOzellikListesi(ArrayList<Otomobil> ozellikListesi) {
        this.ozellikListesi = ozellikListesi;
    }
    
    
    
}
