package lab_14;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Erdinc
 */
public class Fabrika {

    private int id;
    private int kurulusYili;
    private Otomobil[] otoListesi = new Otomobil[5];

    public Fabrika(int id, int kurulusYili) {
        this.id = id;
        this.kurulusYili = kurulusYili;
    }

    public Otomobil otoUret(String marka, String model, int beygirGucu, double satisFiyati) {
        Random random = new Random();
        int ozellik = random.nextInt(2);
        boolean listeDoluMu = true;
        for (int i = 0; i < otoListesi.length; i++) {
            if (otoListesi[i] == null) {
                listeDoluMu = false;
                break;
            }
        }
        try {
            if (listeDoluMu == true) {
                throw new BoyutTasmaHatasi("Boyut Taşma Hatası alındı");
            }
            if (ozellik == 1) {
                Suv suv = new Suv(marka, model, beygirGucu, satisFiyati);
                suv.satisFiyatiHesapla();
                for (int i = 0; i < otoListesi.length; i++) {
                    if (otoListesi[i] == null) {
                        otoListesi[i] = suv;
                        break;
                    }
                }
                return suv;
            } else {
                Sedan sedan = new Sedan(marka, model, beygirGucu, satisFiyati);
                sedan.satisFiyatiHesapla();
                for (int i = 0; i < otoListesi.length; i++) {
                    if (otoListesi[i] == null) {
                        otoListesi[i] = sedan;
                        break;
                    }
                }
                return sedan;
            }
        } catch (BoyutTasmaHatasi e) {
            System.out.println("HATA: " + e);
            otoListesi = Arrays.copyOf(otoListesi, otoListesi.length * 2);
        }
        return null;
    }

    public void otoSat(Kullanici kullanici, Otomobil otomobil) {
        try {
            for (int j = 0; j < kullanici.getAracListesi().length; j++) {
                if (kullanici.getAracListesi()[j] == otomobil) {
                    throw new TekrarKontrol("Bu araç zaten satılmak istenen kullanıcıya ait");
                }

            }
            for (int i = 0; i < kullanici.getAracListesi().length; i++) {
                if (kullanici.getAracListesi()[i] == null) {
                    kullanici.getAracListesi()[i] = otomobil;
                    break;
                }
            }
            otomobil.setKullanici(kullanici);

        } catch (TekrarKontrol e) {
            System.out.println(e);
        }
        
       
    }

    public void modifiyeEt(Otomobil otomobil) {
        if (otomobil instanceof Sedan) {
            Random random = new Random();
            int ozellik = random.nextInt(3);
            switch (ozellik) {

                case 0:
                    ((Sedan) otomobil).navigasyonEkle();
                    break;
                case 1:
                    ((Sedan) otomobil).parkSensoruEkle();
                    break;
                case 2:
                    ((Sedan) otomobil).parkSensoruEkle();
                    ((Sedan) otomobil).navigasyonEkle();
                    break;
                default:
                    System.out.println("özellik yok");
                    break;
            }
        } else {
            System.out.println("Bu Aracın Modifiye Özelliği Yoktur");
        }
    }

    public Otomobil[] getOtoListesi() {
        return otoListesi;
    }

}
