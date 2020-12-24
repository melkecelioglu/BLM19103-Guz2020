package kalitim;

public class Otomobil {

    protected String marka;
    protected String model;
    protected int beygirGucu;
    protected double satisFiyati;
    protected Kullanici kullanici;

    public Otomobil(String marka, String model, double satisFiyati, int beygirGucu) {
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
        this.satisFiyati = satisFiyati;
        satisFiyatiHesapla();

    }

    public double satisFiyatiHesapla() {
        return satisFiyati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

}
