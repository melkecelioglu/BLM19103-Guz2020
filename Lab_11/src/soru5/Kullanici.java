package LabDersi;

public class Kullanici {

    private int id;
    private String kullaniciAdi;
    private Konu[] konuListesi;
    private int konuMiktari;


    public Kullanici(int id, String kullaniciAdi) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        konuListesi = new Konu[10];
    }

    public void konuEkle(Konu gelenKonu) {
        if (konuMiktari < 10 && konuMiktari >= 0) {
            this.konuListesi[konuMiktari] = gelenKonu;
            konuMiktari++;
        } else {
            System.out.println("En fazla 10 konu edinebilirsiniz.");
        }
    }

    public void konuListele() {
        for (int i = 0; i < konuMiktari; i++) {
            System.out.println("Konu id: " + this.konuListesi[i].getId());
            System.out.println("Konu Basligi: " + this.konuListesi[i].getBaslik());
            System.out.println("Konu aciklamasi: " + this.konuListesi[i].getAciklama());
        }
    }

    public Konu[] getKonuListesi() {
        return konuListesi;
    }

    public int getKonuMiktari() {
        return konuMiktari;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
}
