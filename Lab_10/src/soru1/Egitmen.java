package soru1;

/**
 *
 * @author Muhammet
 */
public class Egitmen {

    private String ad;
    private String soyad;
    private Ders[] dersListesi;

    public Egitmen(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        dersListesi = new Ders[3];
    }

    void dersListele() {
        for (int i = 0; i < dersListesi.length; i++) {
            if (dersListesi[i] != null) {
                System.out.println(dersListesi[i].getId() + " : " + dersListesi[i].getAd());
            }
        }
    }

    public String getTamAd() {
        return ad + " " + soyad;
    }

    void dersEkle(Ders yeniDers) {
        for (int i = 0; i < dersListesi.length; i++) {
            if (dersListesi[i] == null) {
                dersListesi[i] = yeniDers;
                break;
            }
        }
    }
}
