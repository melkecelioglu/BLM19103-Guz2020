package kalitim;

public class Sedan extends Otomobil {

    public Sedan(String marka, String model, double satisFiyati, int beygirGucu) {
        super(marka, model, satisFiyati, beygirGucu);
    }

    @Override
    public double satisFiyatiHesapla() {

        satisFiyati += satisFiyati * 0.15 + (beygirGucu * 4);
        System.out.println(marka + " " + model + " Sedan Satış Fiyatı= " + satisFiyati);
        return satisFiyati;
    }
}
