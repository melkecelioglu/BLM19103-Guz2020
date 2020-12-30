package Soru5;

public abstract class Otomobil {
    private String marka;
    private String model;
    private int beygirGucu;
    private double satisFiyati;
    private Kullanici kullanici;

    public Otomobil(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici) {
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
        this.kullanici = kullanici;
    }
    
    public Otomobil(String marka, String model, int beygirGucu, double satisFiyati) {
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
    }
    
    public abstract void bilgileriYazdir();

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }
    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
    

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }
    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }
    
    
    
    
    
    
}
