
package soru5;

public class Ders {
    
    int id;
    String ad;
    Egitmen egitmen;
    int ogrenciSayisi;
    String[] ogrenciListesi;

    public Ders(int g_id, String g_ad, Egitmen g_egitmen) {
        id = g_id;
        ad = g_ad;
        egitmen = g_egitmen;
        egitmen.dersSayisi++;
        ogrenciListesi = new String[10];
    }
    
    public String stringeCevir(){
        return id + " " + ad;
    }
    
    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciListesi[ogrenciSayisi] = ogrenci.stringeCevir();
        ogrenciSayisi++;
        ogrenci.dersEkle(this);
    }
    
    public void dersBilgisi(){
        System.out.println("Dersin Eğitmeni: " + egitmen.ad + " " + egitmen.soyad);
        System.out.println("Dersi Alan Öğrenci Listesi:");
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println(ogrenciListesi[i]);
        }
    }
    
    
}
