package kalitim;

import java.util.ArrayList;

public class Kullanici {

    protected String adSoyad;
    protected ArrayList<Otomobil> aracListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        aracListesi = new ArrayList<>();
    }

    public void aracListele(String kullanici) {
        for (int i = 0; i < aracListesi.size(); i++) {

            System.out.println("\n-" + kullanici + "'a ait Aracın Özellikleri-");
            System.out.println("Marka= " + aracListesi.get(i).getMarka() + "\nModel= " + aracListesi.get(i).getModel() + "\nBeygir Gücü= " + aracListesi.get(i).beygirGucu);
        }
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }

    public void setAracListesi(ArrayList<Otomobil> aracListesi) {
        this.aracListesi = aracListesi;
    }

}
