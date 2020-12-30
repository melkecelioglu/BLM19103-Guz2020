
package soru4;

public class Admin extends Kullanici implements IHaberIslemleri, IYetkiIslemleri{
        int silinenHaber = 0;
        int guncellenenHaber = 0;
        
    public Admin(String adSoyad, String kullanici_adi, Gazete gazete) {
        super(adSoyad, kullanici_adi, gazete);
    }

    @Override
    void bilgileriYazdir() {
            System.out.println("Kullanici ad soyad: " + super.getAdSoyad());
            System.out.println("Kullanici nick: " + super.getKullanici_adi());
            System.out.println("Kullanicinin calistigi gazete adi: " + super.getGazete().getAd());
            System.out.println("Kullanicinin calistigi gazete kurulus yili: " + super.getGazete().getKurulus_yili());
            System.out.println("Kac haber silindi: " + silinenHaber);
            System.out.println("Kac haber güncellendi: "  + guncellenenHaber);
            System.out.println("-----------------------------");
    }

    @Override
    public void haberEkle(Haber h) {
        if(h.getYazar() != null) {
            getGazete().getHaberListesi().add(h);
        }
    }

    @Override
    public void haberSil(Haber h) {
        getGazete().getHaberListesi().remove(h);
        silinenHaber++;
    }

    @Override
    public void haberGuncelle(Haber h, String icerik) {
        h.setBaslik(icerik);
        guncellenenHaber++;
    }
    
}
