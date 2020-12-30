/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarct2;

/**
 *
 * @author ebrar
 */
public class Suv extends Otomobil implements ISatisIslemleri {

    public Suv(String marka, String model, int satisFiyati, int beygirGucu) {
        super(marka, model, satisFiyati, beygirGucu);
    }

    public void bilgileriYazdir() {
        System.out.println("\n--OTOMOBİL BİLGİLERİ--");
        System.out.println("otomobilin markası: " + getMarka());
        System.out.println("otomobilin modeli: " + getModel());
        System.out.println("otomobilin beygir gücü: " + getBeygirGucu());
    }

    @Override
    public void satisFiyatiHesapla() {
        satisFiyati += satisFiyati * 0.20 + (beygirGucu * 4);
        System.out.println(marka + " " + model + " Suv Satış Fiyatı= " + satisFiyati);
    }

}
