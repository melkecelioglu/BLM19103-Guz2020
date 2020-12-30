package Soru5;

public class Suv extends Otomobil implements ISatisIslemleri{
    public Suv(String marka, String model, int beygirGucu, double satisFiyati, Kullanici kullanici) {
        super(marka, model, beygirGucu, satisFiyati, kullanici);
        kullanici.getAracListesi().add(this);
    }
    public Suv(String marka, String model, int beygirGucu, double satisFiyati) {
        super(marka, model, beygirGucu, satisFiyati);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Marka: "+getMarka());
        System.out.println("Model: "+getModel());
        System.out.println("Beygir Gücü: "+getBeygirGucu());
        System.out.println("Satış Fiyatı: "+getSatisFiyati());
        System.out.println("Kullanıcı: "+getKullanici().getAdSoyad());
    }

    @Override
    public void satisFiyatiHesapla() {
        setSatisFiyati(getSatisFiyati()*0.20+(4*getBeygirGucu()));
    }  
}
