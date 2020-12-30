/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biletix;

/**
 *
 * @author emin yasir corut
 */
public class Film {
    protected int id;
    protected String ad;
    protected String tur;
    protected double ucret;

    public Film(int id, String ad, String tur, double ucret) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.ucret = ucret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }
    
    
    
}
