package soru;

import java.util.ArrayList;

public class Sepet {

    private Kullanici sepetSahibi;
    private ArrayList<Urun> urunListesi = new ArrayList<Urun>();

    public Sepet(Kullanici sepetSahibi) {
        this.sepetSahibi = sepetSahibi;
    }

    public void urunEkle(Urun urun) {
        urunListesi.add(urun);
    }

    public void satinAl() {
        sepetSahibi.urunListesiEkle(urunListesi);
        urunListesi.clear();
    }
}
