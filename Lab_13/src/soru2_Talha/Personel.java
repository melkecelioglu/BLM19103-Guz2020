
package soru2;

public abstract class Personel {
    private int id;
    private String adSoyad;
    private double maas;
    private int calismaYili;
    private String unvan;
    
    public Personel(String adSoyad, double maas, int calismaYili, String unvan){
        this.adSoyad = adSoyad;
        this.calismaYili = calismaYili;
        this.maas = maas;
        this.unvan = unvan;
    }
    
    abstract void bilgileriYazdir();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
     public void zamHesapla() {
    }
}
