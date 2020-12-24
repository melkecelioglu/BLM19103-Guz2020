/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

public class Daire extends Sekil{

    private int yaricap;

    public Daire(String ad, String renk) {
        super(ad, renk);
    }
    
    public Daire(String ad, String renk, int yaricap) {
        super(ad, renk);
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }
    
    
    
}
