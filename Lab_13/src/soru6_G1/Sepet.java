package lab13;

import java.util.ArrayList;

public class Sepet {

    protected Kullanici sepetSahibi;
    protected ArrayList<Urun> urunListesi;

    public Sepet(Kullanici sepetSahibi) {
        this.sepetSahibi = sepetSahibi;
        this.urunListesi = new ArrayList<>();
    }

    void urunEkle(Urun urun) {
        urunListesi.add(urun);
    }

    void satinAl() {
        sepetSahibi.urunListesi.addAll(urunListesi);

        if (sepetSahibi instanceof PremiumKullanici) {
            ((PremiumKullanici)sepetSahibi).primeKullan(urunListesi.size());
        }
        urunListesi.clear();
    }
}
