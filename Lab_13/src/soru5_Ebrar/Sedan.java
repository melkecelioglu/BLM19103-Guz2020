/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarct2;

import java.util.ArrayList;

/**
 *
 * @author ebrar
 */
public class Sedan extends Otomobil implements ISatisIslemleri, IModifiyeIslemleri {

    protected ArrayList<String> ozellikListesi;

    public Sedan(String marka, String model, int satisFiyati, int beygirGucu) {
        super(marka, model, satisFiyati, beygirGucu);
        ozellikListesi = new ArrayList<>();
    }

    public void bilgileriYazdir() {
        System.out.println("\n--OTOMOBİL BİLGİLERİ--");
        System.out.println("otomobilin markası: " + getMarka());
        System.out.println("otomobilin modeli: " + getModel());
        System.out.println("otomobilin beygir gücü: " + getBeygirGucu());
        for (int i = 0; i < ozellikListesi.size(); i++) {
            System.out.println("Özellik: " + ozellikListesi.get(i));

        }
    }

    @Override
    public void satisFiyatiHesapla() {
        satisFiyati += satisFiyati * 0.15 + (beygirGucu * 4);
        System.out.println(marka + " " + model + " Sedan Satış Fiyatı= " + satisFiyati);

    }

    @Override
    public void navigasyonEkle() {

        ozellikListesi.add("Navigasyon");
        satisFiyati += 2500;
        System.out.println("\n" + marka + " " + model + " Yeni satış fiyatı: " + satisFiyati);

    }

    @Override
    public void parkSensoruEkle() {
        ozellikListesi.add("Park Sensörü");
        satisFiyati += 1200;
        System.out.println("\n" + marka + " " + model + " Yeni satış fiyatı: " + satisFiyati);

    }

}
