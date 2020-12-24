package kullanici;

import java.util.ArrayList;

public class Kullanici {

    String adSoyad;
    int yas;
    int tcNo;
    double bakiye;
    ArrayList<Seans> seansListesi;

    public Kullanici(String adSoyad, int yas, int tcNo, double bakiye) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.tcNo = tcNo;
        this.bakiye = bakiye;
        this.seansListesi = new ArrayList<>();
    }

    void bilgiVer() {
        System.out.println(adSoyad);
        System.out.println(yas);
        System.out.println(tcNo);
        System.out.println(bakiye);
    }

    void biletSatinAl(Seans a) {
        seansListesi.add(a);
        System.out.println(a.film.ad + " filmi eklendi");

    }
   
}
