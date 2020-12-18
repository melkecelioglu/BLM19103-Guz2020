package soru5;

public class Egitmen {
    
    String ad;
    String soyad;
    int dersSayisi;
    String[] dersListesi;

    public Egitmen(String g_ad, String g_soyad) {
        ad = g_ad;
        soyad = g_soyad;
    }
    
    public String stringeCevir(){
        return ad + " " + soyad;
    }
    
    public void dersListele(){
        System.out.println("Eğitmen: " + ad + " " + soyad + " verdiği ders listesi:");
        for (int i = 0; i < dersSayisi; i++) {
            System.out.println(dersListesi[i]);
        }
    }
    
}
