
package soru5;

/**
 *
 * @author yakari
 */
public class Konu {

    private int id;
    private String baslik;
    private Mesaj[] mesajListesi;

    public Konu() {
        this(0, "Konu başlığı girilmedi");
        //this(id, baslik);
    }

    public Konu(int id, String baslik) {
        mesajListesi = new Mesaj[5];
        this.id = id;
        this.baslik = baslik;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Mesaj[] getMesajListesi() {
        return mesajListesi;
    }

    public void setMesajListesi(Mesaj[] mesajListesi) {
        this.mesajListesi = mesajListesi;
    }

    void mesajListele() {

        for (int i = 0; i < mesajListesi.length; i++) {
            if (mesajListesi[i] != null && mesajListesi[i].getKullanici() != null) {
                System.out.print("mesaj_id: " + mesajListesi[i].getId() + " ");
                System.out.print("metin: " + mesajListesi[i].getMetin() + " ");
                System.out.print("karakter sayısı: " + mesajListesi[i].getKarakterSayisi() + " ");
                System.out.print("kullanici_id: " + mesajListesi[i].getKullanici().getId() + " ");
                System.out.print("kullanici_ad: " + mesajListesi[i].getKullanici().getAd() + " ");
                System.out.print("kullanici_soyad: " + mesajListesi[i].getKullanici().getSoyad() + " ");
                System.out.print("nickName: " + mesajListesi[i].getKullanici().getKullaniciAdi() + " \n");
            } else {
                System.out.println(i + ".indis null");
            }
        }

    }

    void mesajEkle(Mesaj mesaj) {
        for (int i = 0; i < mesajListesi.length; i++) {
            if (mesajListesi[i] == null) {
                mesajListesi[i] = mesaj;
                break;
            }
        }

    }

    void mesajSil(Mesaj mesaj) {
        for (int i = 0; i < mesajListesi.length; i++) {
            if (mesajListesi[i] == mesaj) {
                mesajListesi[i] = null;
                break;
            }
        }
    }

}
