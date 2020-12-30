/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru5;

import java.util.ArrayList;

/**
 *
 * @author dikzu
 */
public class Sedan extends Otomobil implements ISatisIslemleri, IModifiyeIslemleri {

    private ArrayList<String> ozellikListesi;

    public Sedan(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici) {
        super(marka, model, beygirGucu, satisFiyati, kullanici);
        this.ozellikListesi = new ArrayList<>();
    }

    public Sedan(String marka, String model, int beygirGucu) {
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
        System.out.println("Arabanın özellikleri:");
        for (int i = 0; i < this.ozellikListesi.size(); i++) {
            System.out.println(this.ozellikListesi.get(i));
        }
    }

    @Override
    public void satisFiyatiHesapla() {
        double yeni_fiyat = (super.getSatisFiyati() * 0.15) + (4 * super.getBeygirGucu());
        super.setSatisFiyati(yeni_fiyat);
    }

    @Override
    public void navigasyonEkle() {
        this.ozellikListesi.add("Navigasyon");
        super.setSatisFiyati(super.getSatisFiyati() + 2500);
    }

    @Override
    public void parkSensoruEkle() {
        this.ozellikListesi.add("Park sensörü");
        super.setSatisFiyati(super.getSatisFiyati() + 1200);
    }

}
