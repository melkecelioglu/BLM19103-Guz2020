package kalitim;

import java.util.ArrayList;

public class Fabrika {

    protected int id;
    protected int kurulusYili;
    protected ArrayList<Otomobil> otoListesi;

    public Fabrika(int id, int kurulusYili) {
        this.id = id;
        this.kurulusYili = kurulusYili;
        otoListesi = new ArrayList<>();

    }

    public Otomobil otoUret(String marka, String model, int fiyat, int beygirGucu) {
        int y = 1 + (int) (Math.random() * 2);

        if (y == 1) {

            Suv suv = new Suv(marka, model, fiyat, beygirGucu);
            otoListesi.add(suv);

            return suv;
        }
        if (y == 2) {

            Sedan sedan = new Sedan(marka, model, fiyat, beygirGucu);
            otoListesi.add(sedan);

            return sedan;
        }
        return null;
    }

    public void otoSat(Kullanici kullanici, Otomobil otomobil) {
        otoListesi.remove(otomobil);
//        System.out.println("\n" + otomobil.marka + " " + otomobil.model + " " + kullanici.getAdSoyad() + "'a Satıldı.");
        kullanici.aracListesi.add(otomobil);

    }

    public void OtoSayiListesi() {
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < otoListesi.size(); i++) {
            if (otoListesi.get(i) instanceof Suv) {
                toplam1++;
            } else if (otoListesi.get(i) instanceof Sedan) {
                toplam2++;
            }
           
        }
          System.out.println("\nFabrikadaki toplam Suv sayısı= " + toplam1 + "\nFabrikadaki toplam Sedan sayısı= " + toplam2);
    }

    public ArrayList<Otomobil> getOtoListesi() {
        return otoListesi;
    }

    public void setOtoListesi(ArrayList<Otomobil> otoListesi) {
        this.otoListesi = otoListesi;
    }


}
