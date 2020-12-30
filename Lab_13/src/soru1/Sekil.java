/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

public abstract class Sekil {
    
    private String ad;
    private String renk;

    public Sekil(String ad, String renk) {
        this.ad = ad;
        this.renk = renk;
    }

    public String getAd() {
        return ad;
    }

    public String getRenk() {
        return renk;
    }
    
    public abstract void bilgileriYazdir();
    
}
