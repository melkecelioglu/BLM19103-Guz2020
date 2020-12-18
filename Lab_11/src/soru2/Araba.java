package soru1;

public class Araba {

    private int id;
    private String model;
    private Uretici uretici;
    private String uretim_tarihi;
    private int ay;
    private int gun;
    private int yil;

    public Araba(int id, String model, String uretim_tarihi) {
        this.id = id;
        this.model = model;
        this.uretim_tarihi = uretim_tarihi;
    }

    public void bilgiVer() {
        System.out.println("Id: " + id + ", model: " + model + ", üretici adı: " + uretici.getAd()
                + ", gün:" + gun + ", ay: " + ay + ", yil: " + yil);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Uretici getUretici() {
        return uretici;
    }

    public void setUretici(Uretici uretici) {
        this.uretici = uretici;
    }

    public String getUretim_tarihi() {
        return uretim_tarihi;
    }

    public void setUretim_tarihi(String uretim_tarihi) {
        this.uretim_tarihi = uretim_tarihi;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

}
