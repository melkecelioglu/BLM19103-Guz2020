package Lab13;

import java.util.ArrayList;

public class Fabrika {

    private int id;
    private String ad;
    private ArrayList<Personel> personelListesi;

    public Fabrika(int id, String ad) {
        this.id = id;
        this.ad = ad;
        this.personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void yillikZamYap() {
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).zamHesapla();
        }
    }

    public void bilgileriYazdir() {
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).bilgileriYazdir();
        }
    }

    public void personelSay() {
        int muhendisSayisi = 0;
        int isciSayisi = 0;
        int stajyerSayisi = 0;

        for (int i = 0; i < personelListesi.size(); i++) {
            if (personelListesi.get(i) instanceof Muhendis) {
                muhendisSayisi++;
            }
            if (personelListesi.get(i) instanceof Isci) {
                isciSayisi++;
            }
            if (personelListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;
            }
        }

        System.out.println("Mühendis Sayısı: " + muhendisSayisi);
        System.out.println("İşçi Sayısı: " + isciSayisi);
        System.out.println("Stajyer Sayısı: " + stajyerSayisi);
    }
}
