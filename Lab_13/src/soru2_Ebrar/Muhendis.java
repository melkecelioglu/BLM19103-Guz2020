/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.ArrayList;

/**
 *
 * @author ebrar
 */
public class Muhendis extends Personel implements IYetki, IZamHesaplayici {

    protected ArrayList<Personel> ekipListesi;

    public Muhendis(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
        ekipListesi = new ArrayList<>();

    }

    @Override
    public void bilgileriYazdir() {
        int toplamIsci = 0;
        int toplamStajyer = 0;
        
//        System.out.println("----PERSONEL BİLGİLERİ----");
//        System.out.println("Personel unvan: " + unvan);
//        System.out.println("Personel id: " + id);
//        System.out.println("Personel Ad Soyad: " + adSoyad);
//        System.out.println("Personel Çalışma Yılı: " + calismaYili);
//        System.out.println("Personel Maaş: " + maas);
//        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < ekipListesi.size(); i++) {
//            System.out.println("----PERSONEL BİLGİLERİ----");
//            System.out.println("Personel unvan: " + ekipListesi.get(i).getUnvan());
//            System.out.println("Personel id: " + ekipListesi.get(i).getId());
//            System.out.println("Personel Ad Soyad: " + ekipListesi.get(i).getAdSoyad());
//            System.out.println("Personel Çalışma Yılı: " + ekipListesi.get(i).getAdSoyad());
//            System.out.println("Personel Maaş: " + ekipListesi.get(i).getMaas());
            if (ekipListesi.get(i) instanceof Isci) {
                toplamIsci++;
            }
            if (ekipListesi.get(i) instanceof Stajyer) {
                toplamStajyer++;
            }
            System.out.println("Toplam İşçi: " + toplamIsci);
            System.out.println("Toplam Stajyer: " + toplamStajyer);
        }

    }

    @Override
    public void zamHesapla() {
        int yeniMaas = maas * 20 / 100 + maas;
        System.out.println( "\n" + adSoyad + " isimli mühendisin yeni maaşı: " + yeniMaas);

    }

    public void personelEkle(Personel personel) {
        if (!(personel instanceof Muhendis)) {
            ekipListesi.add(personel);

        }
    }
}
