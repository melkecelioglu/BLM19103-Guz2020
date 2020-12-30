
package Lab13;

import java.util.ArrayList;

public class Muhendis extends Personel implements IZamHesaplayici, IYetki{

    private ArrayList<Personel> ekipListesi;
    
    public Muhendis(int id, String adSoyad, double maas, int calismaYili,String unvan){
        super(id, adSoyad, maas, calismaYili, unvan);
        ekipListesi = new ArrayList<>();
    }
    
    @Override
    void bilgileriYazdir() {
        System.out.println("Id:  " + super.getId());
        System.out.println("Ad Soyad: " + super.getAdSoyad());
        System.out.println("Maaş: " + super.getMaas());
        System.out.println("Çalışma Yılı: " + super.getCalismaYili());
        System.out.println("Unvan: " + super.getUnvan());
        
        System.out.println("**********Ekip Listesi Bilgileri**********");
        for (int i = 0; i < ekipListesi.size(); i++) {
            System.out.println("Id:  " + ekipListesi.get(i).getId());
            System.out.println("Ad Soyad: " + ekipListesi.get(i).getAdSoyad());
            System.out.println("Maaş: " + ekipListesi.get(i).getMaas());
            System.out.println("Çalışma Yılı: " + ekipListesi.get(i).getCalismaYili());
            System.out.println("Unvan: " + ekipListesi.get(i).getUnvan());
        }
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        for (int i = 0; i < ekipListesi.size(); i++) {
            if (ekipListesi.get(i) instanceof Isci) {
                isciSayisi++;
            }
            if (ekipListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;
            }
        }
        System.out.println("İşçi Sayısı: " + isciSayisi);
        System.out.println("Stajyer Sayısı: " + stajyerSayisi);
    }

    @Override
    public void zamHesapla() {
        setMaas(getMaas() * 1.20);
    }

    @Override
    public void personelEkle(Personel p) {
        if (p instanceof Isci || p instanceof Stajyer) {
            ekipListesi.add(p);
        }
    }
    
}
