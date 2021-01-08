package soru2;

import java.util.Arrays;

public class Fabrika {

    private int id;
    private String ad;
    private Personel[] personelListesi;

    public Fabrika(String ad) {
        this.ad = ad;
        this.personelListesi = new Personel[10];
    }

    public void personelEkle(Personel p) {
        boolean dolu = true;

        for (int i = 0; i < personelListesi.length; i++) {
            if (personelListesi[i] == null) {
                personelListesi[i] = p;
                dolu = false;
                break;
            }
        }

        try {
            if (dolu == true) {
                personelListesi = Arrays.copyOf(personelListesi, personelListesi.length * 2);
                throw new BoyutTasmaHatasi();

            }

        } catch (BoyutTasmaHatasi e) {
            System.out.println(e);
        }

    }

    public void yillikZamYap() {
        for (int i = 0; i < personelListesi.length; i++) {
            if (personelListesi[i] != null) {
                personelListesi[i].zamHesapla();
            }
        }
    }

    public void bilgileriYazdir() {
        for (int i = 0; i < personelListesi.length; i++) {

            try {
                if (personelListesi[i] == null) {
                    throw new NullElemanKontrol();
                } else if (personelListesi[i] != null) {
                    personelListesi[i].bilgileriYazdir();

                }

            } catch (NullElemanKontrol e) {
                System.out.println(e);
            }
        }
    }

    public int[] personelSay() {
        int[] personelSayisi = new int[3];
        for (int i = 0; i < personelListesi.length; i++) {
            if (personelListesi[i] instanceof Muhendis) {
                personelSayisi[0] += 1;
            } else if (personelListesi[i] instanceof Isci) {
                personelSayisi[1] += 1;
            } else if (personelListesi[i] instanceof Stajyer) {
                personelSayisi[2] += 1;
            }
        }
        return personelSayisi;
    }
}
