package lab13;

import java.util.ArrayList;

public abstract class Kullanici {

    protected String adSoyad;
    protected ArrayList<Urun> urunListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        this.urunListesi = new ArrayList<>();
    }

    public abstract void urunListele();

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(ArrayList<Urun> urunListesi) {
        this.urunListesi = urunListesi;
    }

}
