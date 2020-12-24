package soru;

import java.util.ArrayList;

public class Kullanici {

    private String adSoyad;
    private ArrayList<Urun> urunListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        urunListesi = new ArrayList<Urun>();
    }

    public void urunListele() {
        int i = 1;
        for (Urun urun : urunListesi) {
            System.out.println(i +". Urun");
            System.out.println(urun.toString());
            i++;
        }
    }

    public void urunListesiEkle(ArrayList<Urun> urunListesi) {
        this.urunListesi.addAll(urunListesi);
    }

    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }
    

}
