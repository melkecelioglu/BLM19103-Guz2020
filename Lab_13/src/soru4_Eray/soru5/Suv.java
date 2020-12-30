/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

/**
 *
 * @author TR
 */
public class Suv extends Otomobil implements ISatisIslemleri {

    public Suv(String marka, String model) {
        super(marka, model);
    }

    @Override
    void bilgileriYazdir() {
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Beygir gucu:" + getBeygirGucu());
        System.out.println("Kullanici: " + getKullanici());
        System.out.println("Fiyat: " + getSatisFiyati());

    }

    @Override
    public void satisFiyatiHesapla() {
        setSatisFiyati((getSatisFiyati() * 0.2) + (4 * getBeygirGucu()));
    }

}
