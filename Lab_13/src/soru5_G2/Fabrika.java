package Soru5;

import java.util.ArrayList;
import java.util.Random;

public class Fabrika {
    private int id;
    private int kurulusYili;
    private ArrayList<Otomobil> otoListesi;

    public Fabrika(int id, int kurulusYili) {
        this.id = id;
        this.kurulusYili = kurulusYili;
        otoListesi = new ArrayList<>();
    }
    
    public Otomobil otoUret(String marka, String model, int beygirGucu, double satisFiyati) {
        Random random = new Random();
        int x = random.nextInt(2);
        
        if(x == 1) {
            Suv suv = new Suv(marka, model, beygirGucu, satisFiyati);
            suv.satisFiyatiHesapla();
            otoListesi.add(suv);
            return suv;
        }
        else {
            Sedan sedan = new Sedan(marka, model, beygirGucu, satisFiyati);
            sedan.satisFiyatiHesapla();
            otoListesi.add(sedan);
            return sedan;
        }
    }
    
    public void otoSat(Kullanici kullanici,Otomobil otomobil) {
        boolean otoVarMi = false;
        for(int x = 0 ; x < otoListesi.size() ; x++) {
            if(otoListesi.get(x) == otomobil) {
                otoVarMi = true;
            }
        }
        
        if(otoVarMi) {
            otoListesi.remove(otomobil);
            kullanici.getAracListesi().add(otomobil);
            otomobil.setKullanici(kullanici);
        }
        else {
            System.out.println("Araç Listesinde Böyle Bir Araç Yok...");
        }
    }
    
    public void modifiyeEt(Otomobil otomobil) {
        if(otomobil instanceof Sedan) {
            Random random = new Random();
            int x = random.nextInt(4);
            
            if(x == 0) {
                ((Sedan) otomobil).navigasyonEkle();
            }
            else if(x == 1) {
                ((Sedan) otomobil).parkSensoruEkle();
            }
            else if(x == 3) {
                ((Sedan) otomobil).parkSensoruEkle();
                ((Sedan) otomobil).navigasyonEkle();
            }
        }
        else {
            System.out.println("Bu Araç Modifiye Edilemez...");
        }
    }

    public ArrayList<Otomobil> getOtoListesi() {
        return otoListesi;
    }
    
    
}
