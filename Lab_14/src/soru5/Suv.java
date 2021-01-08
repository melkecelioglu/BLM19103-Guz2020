package lab_14;

/**
 *
 * @author Erdinc
 */
public class Suv extends Otomobil implements IsatisIslemleri {

    public Suv(String marka, String model, int beygirGucu, double satisFiyati) {
        super(marka, model, beygirGucu, satisFiyati);

    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("\n****OTOMOBİL BİLGİLERİ****");
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Beygir Gücü: " + getBeygirGucu());
        System.out.println("Satış Fiyatı: " + getSatisFiyati());
        System.out.println("Kullanıcı: " + getKullanici().getAdSoyad());
    }

    @Override
    public void satisFiyatiHesapla() {

        try {
            if (getBeygirGucu() == 0) {
                throw new FiyatKontrol("Fiyat Kontrol Hatası");
            }
            setSatisFiyati(getSatisFiyati() + getSatisFiyati() * 0.20 + (4 * getBeygirGucu()));
        } catch (FiyatKontrol e) {
            System.out.println("HATA: " + e);
            setBeygirGucu(1500);
            setSatisFiyati(getSatisFiyati() + getSatisFiyati() * 0.20 + (4 * getBeygirGucu()));
        }
    }

}
