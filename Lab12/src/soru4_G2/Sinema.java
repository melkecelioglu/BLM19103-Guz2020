package kullanici;

import java.util.ArrayList;

public class Sinema {

    String ad;
    ArrayList<Seans> seansListesi;
    int seans_saati;

    Sinema(Kullanici a, Seans b) {
        this.seans_saati = b.seans_saati;
        this.seansListesi = new ArrayList<>();
    }

    void seansEkle(Seans a) {
        seansListesi.add(a);
    }

    void biletSat(Kullanici a, Seans b) {
        if (a instanceof Emekli && seans_saati > 16) {
            System.out.println("16'dan sonra emeklilere bilet satışı yapılamaz.");
        } else {
            a.biletSatinAl(b);
        }
    }
}
