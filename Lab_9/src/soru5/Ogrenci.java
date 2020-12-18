package soru5;

public class Ogrenci {
    
    int no;
    String ad;
    String soyad;
    int dersSayisi;
    String[] dersListesi;

    public Ogrenci(int g_no, String g_ad, String g_soyad) {
        no = g_no;
        ad = g_ad;
        soyad = g_soyad;
        dersListesi = new String[3];
    }
    
    public String stringeCevir(){
        return no + " " + ad + " " + soyad;
    }
    
    public void dersEkle(Ders ders){
        dersListesi[dersSayisi] = ders.stringeCevir();
        dersSayisi++;
        ders.ogrenciEkle(this);
    }
    
    public void dersListele(){
        System.out.println("Öğrenci: " + ad + " " + soyad + " aldığı ders listesi:");
        for (int i = 0; i < dersSayisi; i++) {
            System.out.println(dersListesi[i]);
        }
    }
    
}
