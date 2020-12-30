package Soru5;

import java.util.ArrayList;

public class Kullanici {
    private String adSoyad;
    private ArrayList<Otomobil> aracListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        aracListesi = new ArrayList<>();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }
   
    
    
    
}
