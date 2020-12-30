/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author talha
 */
public class Isci extends Personel implements IZamHesaplayici{

    public Isci(String adSoyad, double maas, int calismaYili, String unvan) {
        super(adSoyad, maas, calismaYili, unvan);
    }

    @Override
    void bilgileriYazdir() {
        
        System.out.println("Persoenl ad ve soyad: " + getAdSoyad());
        System.out.println("Personel maasi: " + getMaas());
        System.out.println("Personel calisma yili: " + getCalismaYili());
        System.out.println("Personel unvan: " + getUnvan());
        System.out.println("-------------------");
    
}

    @Override
    public void zamHesapla() {
        setMaas(getMaas()*1.15);
    }
}
