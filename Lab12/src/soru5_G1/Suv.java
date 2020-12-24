package kalitim;

public class Suv extends Otomobil {

    private int cekisGucu;

    public Suv(String marka, String model, double satisFiyati, int beygirGucu) {
        super(marka, model, satisFiyati, beygirGucu);
    }

    @Override
    public double satisFiyatiHesapla() {
        satisFiyati += satisFiyati * 0.20 + (beygirGucu * 4);
        System.out.println(marka + " " + model + " Suv Satış Fiyatı= " + satisFiyati);
        return satisFiyati;

    }

}
