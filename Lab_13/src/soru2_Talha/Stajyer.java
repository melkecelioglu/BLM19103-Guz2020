
package soru2;

public class Stajyer extends Personel implements IZamHesaplayici{

    public Stajyer(String adSoyad, double maas, int calismaYili, String unvan) {
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
    }
    
}
