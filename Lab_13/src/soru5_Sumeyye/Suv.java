/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru5;

/**
 *
 * @author dikzu
 */
public class Suv extends Otomobil implements ISatisIslemleri {

    public Suv(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici) {
        super(marka, model, beygirGucu, satisFiyati, kullanici);
    }

    public Suv(String marka, String model, int beygirGucu) {
        super(marka, model, beygirGucu);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Arabanın markası: " + super.getMarka());
        System.out.println("Arabanın modeli: " + super.getModel());
        System.out.println("Arabanın beygir gücü: " + super.getBeygirGucu());
        System.out.println("Arabanın fiyatı: " + super.getSatisFiyati());
        if (super.getKullanici() != null) {
            System.out.println("Arabanın kullanıcısı: " + super.getKullanici().getAdSoyad());
        }
    }

    @Override
    public void satisFiyatiHesapla() {
        double yeni_fiyat = (super.getSatisFiyati() * 0.20) + (4 * super.getBeygirGucu());
        super.setSatisFiyati(yeni_fiyat);
    }

}
