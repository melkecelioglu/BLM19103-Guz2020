package soru2;

public abstract class Personel {

    private int id;
    private String adSoyad;
    private double maas;
    private int calısmaYılı;
    private String unvan;

    public Personel(int id, String adSoyad, int maas, int calısmaYılı, String unvan) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.calısmaYılı = calısmaYılı;
        this.unvan = unvan;
    }

    public abstract void bilgileriYazdir();

    public String getAdSoyad() {
        return adSoyad;
    }

    public int getCalismaYili() {
        return calısmaYılı;
    }

    public int getId() {
        return id;
    }

    public double getMaas() {
        return maas;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setMaas(double maas) {
        this.maas = maas;

    }

    /**
     *
     * @throws SinirKontrol
     */
    public void zamHesapla() {
        
    }

}
