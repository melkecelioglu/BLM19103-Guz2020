
package soru4;

public class Yazar extends Kullanici implements IHaberIslemleri {

    public Yazar(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    void bilgileriYazdir() {
            System.out.println("Kullanici ad soyad: " + super.getAdSoyad());
            System.out.println("Kullanici nick: " + super.getKullanici_adi());  
            System.out.println("Kullanicinin calistigi gazete adi: " + super.getGazete().getAd());
            System.out.println("Kullanicinin calistigi gazete kurulus yili: " + super.getGazete().getKurulus_yili());
            System.out.println("-----------------------------");
    }

    @Override
    public void haberEkle(Haber h) {
        h.setYazar(this);
    }

    
}
