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
public abstract class Kullanici implements IBiletIslemleri,IOdemeIslemleri{
    protected String adSoyad;
    protected int yas;
    protected int tcNo;
    protected double bakiye;
    protected ArrayList<Seans>seansListesi;

    public Kullanici(String adSoyad, int yas, int tcNo, double bakiye) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.tcNo = tcNo;
        this.bakiye = bakiye;
        this.seansListesi=new ArrayList<>();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
     public abstract void bilgileriYazdir();
    
    public void satinAl(Seans s){
    
    
    }

    @Override
    public void kartOdeme(Seans s) {
        
    }

    @Override
    public void nakitOdeme(Seans s) {
        
    }
    
    
    
}
