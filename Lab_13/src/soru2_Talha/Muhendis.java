package soru2;

import java.util.ArrayList;

public class Muhendis extends Personel implements IYetki, IZamHesaplayici{

    private ArrayList<Personel> ekipListesi;

    public Muhendis(String adSoyad, double maas, int calismaYili, String unvan) {
        super(adSoyad, maas, calismaYili, unvan);
        this.ekipListesi = new ArrayList<>();
    }

    @Override
    void bilgileriYazdir() {
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        
        System.out.println("Persoenl ad ve soyad: " + getAdSoyad());
        System.out.println("Personel maasi: " + getMaas());
        System.out.println("Personel calisma yili: " + getCalismaYili());
        System.out.println("Personel unvan: " + getUnvan());
        System.out.println("-------------------");
        System.out.println("Ekipteki kisiler: ");
        for (int i = 0; i < ekipListesi.size(); i++) {
            System.out.println("Ekipteki  adi ve soyadi: " + ekipListesi.get(i).getAdSoyad());
            System.out.println("Ekipteki maasi " + ekipListesi.get(i).getMaas());
            System.out.println("Ekipteki calisma yili " + ekipListesi.get(i).getCalismaYili());
            System.out.println("Ekipteki unvani " + ekipListesi.get(i).getUnvan());
            System.out.println("-----------------");

            if (ekipListesi.get(i) instanceof Isci) {
                isciSayisi++;
            } else if (ekipListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;
            }
        }
        System.out.println("Ekipteki isci sayisi = " + isciSayisi);
        System.out.println("Ekipteki stajyer sayisi = " + stajyerSayisi);
        System.out.println("--------------------");
    }
     @Override
    public void zamHesapla() {
        setMaas(getMaas()*1.2);
    }
    @Override
    public void personelEkle(Personel p){
        if(p instanceof Isci || p instanceof Stajyer) {
            ekipListesi.add(p);
        }
    }

}
