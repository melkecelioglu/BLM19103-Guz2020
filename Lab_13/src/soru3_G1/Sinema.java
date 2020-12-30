/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biletix;

import java.util.ArrayList;

/**
 *
 * @author emin yasir corut
 */
public class Sinema {
    protected String ad;
    protected ArrayList<Seans>seansListesi;

    public Sinema(String ad) {
        this.ad = ad;
        this.seansListesi =new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Seans> getSeansListesi() {
        return seansListesi;
    }

    public void setSeansListesi(ArrayList<Seans> seansListesi) {
        this.seansListesi = seansListesi;
    }
    
    void seansEkle(Seans s){
    this.seansListesi.add(s);
    
    }
    
    void biletSat(Kullanici k,Seans s){
    int a=(int) (Math.random()*2);
        if (a==1) {
            k.kartOdeme(s);
        }else{
        k.nakitOdeme(s);
        }
    }
    
}
