package kullanıcı;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Kullanıcı {

    private String adSoyad;
    private int yas;
    private String tcNo;
    private double bakiye;
    private Seans seans;
    private ArrayList<Seans> seansListesi = new ArrayList<Seans>();

    Kullanıcı(String adSoyad, int yas, String tcNo, double bakiye) {
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public Seans getSeans() {
        return seans;
    }

    public void setSeans(Seans seans) {
        this.seans = seans;
    }

    public ArrayList<Seans> getSeansListesi() {
        return seansListesi;
    }

    public void setSeansListesi(ArrayList<Seans> seansListesi) {
        this.seansListesi = seansListesi;
    }

    public void bilgiVer() {
        System.out.println("Ad ve soyad: " + adSoyad);
        System.out.println("Yas: " + yas);
        System.out.println("TC NO: " + tcNo);
        System.out.println("Bakiye: " + bakiye);

    }

    public void biletSatinAl(Seans seans) {
        if (bakiye > seans.getFilm().getUcret()) {

            for (int i = 0; i < getSeansListesi().size(); i++) {
                if (getSeansListesi().get(i) == null) {
                    getSeansListesi().add(seans);
                    setBakiye(getBakiye() - this.getSeansListesi().get(i).getFilm().getUcret());
                    System.out.println("yeni bakiyeniz: " + getBakiye());

                } else {
                    System.out.println("uyarı");
                }

            }
            seansListesi.add(seans);
            System.out.println(seans.getFilm().getAd() + " filmi eklendi..");
            bakiye = bakiye - seans.getFilm().getUcret();

        } else {
            System.out.println("Yetersiz Bakiye...");
        }

    }

}
