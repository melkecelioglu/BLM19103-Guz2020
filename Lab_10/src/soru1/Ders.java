package soru1;

/**
 *
 * @author Muhammet
 */
public class Ders {

    private String id;
    private String ad;
    private Egitmen egitmen;
    private int ogrenciSayisi;
    private Ogrenci[] ogrenciListesi;

    public Ders(String id, String ad, Egitmen egitmen) {
        this.id = id;
        this.ad = ad;
        this.egitmen = egitmen;
        egitmen.dersEkle(this);
        
        ogrenciListesi = new Ogrenci[25];
    }

    public String getAd() {
        return ad;
    }

    public String getId() {
        return id;
    }

    void ogrenciEkle(Ogrenci yeniOgrenci) {
        for (int i = 0; i < ogrenciListesi.length; i++) {
            if (ogrenciListesi[i] == null) {
                ogrenciListesi[i] = yeniOgrenci;
                ogrenciSayisi++;
                break;
            }
        }
    }

    void dersBilgisi() {
        System.out.println("Eğitmen: " + egitmen.getTamAd());

        for (int i = 0; i < ogrenciListesi.length; i++) {
            if (ogrenciListesi[i] != null) {
                System.out.println(ogrenciListesi[i].getNo() + " : " + ogrenciListesi[i].getTamAd());
            }
        }
    }
}
