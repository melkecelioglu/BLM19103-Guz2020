/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ebrar
 */
public class Stajyer extends Personel implements IZamHesaplayici {

    public Stajyer(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("----PERSONEL BİLGİLERİ----");
        System.out.println("Personel unvan: " + unvan);
        System.out.println("Personel id: " + id);
        System.out.println("Personel Ad Soyad: " + adSoyad);
        System.out.println("Personel Çalışma Yılı: " + calismaYili);
        System.out.println("Personel Maaş: " + maas);
        System.out.println("-----------------------------------------");
    }

    @Override
    public void zamHesapla() {
        System.out.println("\n" + adSoyad + " isimli stajyere zam yapılmadı! Stajyerin güncel maaşı: " + maas);

    }

}
