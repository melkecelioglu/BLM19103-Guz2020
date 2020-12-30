/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

public class Dikdortgen extends Sekil implements IAlanHesaplayici, ICevreHesaplayici{

    private int kisa_kenar;
    private int uzun_kenar;
    
    public Dikdortgen(String ad, String renk) {
        super(ad, renk);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Ad: " + getAd() + ", Renk: " + getRenk() + ", Kısa Kenar:"  + kisa_kenar + ", Uzun Kenar: " + uzun_kenar);
    }

    @Override
    public double alanHesapla() {
        return kisa_kenar * uzun_kenar;
    }

    @Override
    public double cevreHesapla() {
        return 2*kisa_kenar + 2*uzun_kenar;
    }
    
}
