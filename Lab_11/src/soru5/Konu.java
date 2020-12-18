package LabDersi;

public class Konu {

    private int id;
    private String baslik;
    private String aciklama;
    private Kullanici kullanici;

    public Konu(int id, String baslik, String aciklama) {
        this.id = id;
        this.baslik = baslik;
        this.aciklama = aciklama;
    }

    public int getId() {
        return id;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

}
