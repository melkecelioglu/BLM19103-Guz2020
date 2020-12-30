/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

public class Daire extends Sekil implements IAlanHesaplayici, ICevreHesaplayici{

    private int yaricap;
    
    public Daire(String ad, String renk) {
        super(ad, renk);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Ad: " + getAd() + ", Renk: " + getRenk() + ", Yarıçap:"  + yaricap);
    }

    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
    
}
