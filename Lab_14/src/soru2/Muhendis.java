package soru2;

import java.util.Arrays;

public class Muhendis extends Personel implements IYetki, IZamHesaplayici {

    private Personel[] ekipListesi;

    public Muhendis(int id, String adSoyad, int maas, int calısmaYılı, String unvan) {
        super(id, adSoyad, maas, calısmaYılı, unvan);
        this.ekipListesi = new Personel[5];
    }

    @Override
    public void bilgileriYazdir() {
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        System.out.println("id: " + super.getId());
        System.out.println("adSoyad: " + super.getAdSoyad());
        System.out.println("maas: " + super.getMaas());
        System.out.println("calısma yılı: " + super.getCalismaYili());
        System.out.println("unvan: " + super.getUnvan());
        System.out.println("-----------------");

        System.out.println("ekip listesi :");
        for (int i = 0; i < ekipListesi.length; i++) {
            if (ekipListesi[i] != null) {

                System.out.println("Ekipteki id: " + ekipListesi[i].getId());
                System.out.println("Ekipteki adi ve soyadi: " + ekipListesi[i].getAdSoyad());
                System.out.println("Ekipteki maasi " + ekipListesi[i].getMaas());
                System.out.println("Ekipteki calisma yili " + ekipListesi[i].getCalismaYili());
                System.out.println("Ekipteki unvani " + ekipListesi[i].getUnvan());
                System.out.println("-----------------");
                if (ekipListesi[i] instanceof Isci) {
                    isciSayisi++;
                } else if (ekipListesi[i] instanceof Stajyer) {
                    stajyerSayisi++;
                }
            }

        }
        System.out.println("Ekipteki isci sayisi = " + isciSayisi);
        System.out.println("Ekipteki stajyer sayisi = " + stajyerSayisi);
        System.out.println("--------------------");

    }

    @Override
    public void zamHesapla() {
        try {
            if (getMaas() * 1.2 < 20000) {
                setMaas(getMaas() * 1.2);

            } else if (getMaas() * 1.2 >= 20000) {
                setMaas(20000);
                throw new SinirKontrol();

            }
        } catch (SinirKontrol e) {
            System.out.println(e);

        }

    }

    @Override
    public void personelEkle(Personel p) {
        boolean dolu = true;
        if (p instanceof Isci || p instanceof Stajyer) {
            for (int i = 0; i < ekipListesi.length; i++) {
                if (ekipListesi[i] == null) {
                    ekipListesi[i] = p;
                    dolu = false;
                    break;
                }
            }
        }
        try {
            if (dolu == true) {
                throw new BoyutTasmaHatasi();
            }

        } catch (BoyutTasmaHatasi e) {
            System.out.println(e);
            ekipListesi = Arrays.copyOf(ekipListesi, ekipListesi.length * 2);

        }

    }

    public Personel[] getEkipListesi() {
        return ekipListesi;
    }

}
