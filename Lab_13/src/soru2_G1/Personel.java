
package Lab13;

public abstract class Personel implements IZamHesaplayici{
    
    private int id;
    private String adSoyad;
    private double maas;
    private int calismaYili;
    private String unvan;

    public Personel(int id, String adSoyad, double maas, int calismaYili, String unvan) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.calismaYili = calismaYili;
        this.unvan = unvan;
    }
    
    public int getId() {
        return id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public double getMaas() {
        return maas;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    
    abstract void bilgileriYazdir();
}
