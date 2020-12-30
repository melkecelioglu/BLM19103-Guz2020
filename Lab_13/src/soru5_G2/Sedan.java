package Soru5;

import java.util.ArrayList;

public class Sedan extends Otomobil implements ISatisIslemleri,IModifiyeIslemleri{
    private ArrayList<String> ozellikListesi;
    
    private boolean navigasyonEklendiMi;
    private boolean parkSensoruEklendiMi;
    
    public Sedan(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici) {
        super(marka, model, beygirGucu, satisFiyati, kullanici);
        ozellikListesi = new ArrayList<>();
        navigasyonEklendiMi = false;
        parkSensoruEklendiMi = false;
        kullanici.getAracListesi().add(this);
    }
    
    public Sedan(String marka, String model, int beygirGucu, double satisFiyati) {
        super(marka, model, beygirGucu, satisFiyati);
        ozellikListesi = new ArrayList<>();
        navigasyonEklendiMi = false;
        parkSensoruEklendiMi = false;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Marka: "+getMarka());
        System.out.println("Model: "+getModel());
        System.out.println("Beygir Gücü: "+getBeygirGucu());
        System.out.println("Satış Fiyatı: "+getSatisFiyati());
        System.out.println("Kullanıcı: "+getKullanici().getAdSoyad());
        System.out.println("Özellik Listesi: "+ozellikListesi);
    }

    @Override
    public void satisFiyatiHesapla() {
        setSatisFiyati(getSatisFiyati()*0.15+(4*getBeygirGucu()));
    }

    @Override
    public void navigasyonEkle() {
        if(navigasyonEklendiMi) {
            System.out.println("Bu Aracın Zaten Bir Navigasyonu Var...");
        }
        else {
            ozellikListesi.add("Navigasyon");
            setSatisFiyati(getSatisFiyati()+2500);
            navigasyonEklendiMi = true;
        }
    }

    @Override
    public void parkSensoruEkle() {
        if(parkSensoruEklendiMi) {
            System.out.println("Bu Aracın Zaten Bir Park Sensörü Var...");
        }
        else {
            ozellikListesi.add("Park Sensörü");
            setSatisFiyati(getSatisFiyati()+1200);
            parkSensoruEklendiMi = true;
        }
    }     
}
