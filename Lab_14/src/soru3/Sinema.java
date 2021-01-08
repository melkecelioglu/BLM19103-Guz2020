package Soru3;

public class Sinema {

    private String ad;
    private Seans[] seansListesi;

    public Sinema(String ad) {
        this.ad = ad;
        this.seansListesi = new Seans[5];
    }

    public void seansEkle(Seans seans) {
        for (int i = 0; i < seansListesi.length; i++) {
            if (seansListesi[i] == null) {
                seansListesi[i] = seans;

            }
        }
    }

    public void seansSil(Seans seans) {
        boolean kontrol = true;
        for (int i = 0; i < seansListesi.length; i++) {
            if (seansListesi[i] == seans) {
                seansListesi[i] = null;
                kontrol = false;
            }
        }
        try {
            if (kontrol) {
                seansEkle(seans);
                throw new NesneKontrol("Nesne bulunamadi");
            }
        } catch (NesneKontrol exception) {
            System.out.println(exception);
        }
    }

    public void biletSat(Kullanici kullanici, Seans seans) {
        System.out.println(seans.getSeansSaati());
        try {
            if (seans.getSeansSaati() < 10 || seans.getSeansSaati() > 23) {

                seansSil(seans);
                throw new SaatKontrol("Saat bilgisi yanlis");
            }
            int sayi = (int) (Math.random() * 2);
            if (sayi == 1) {
                kullanici.kartOdeme(seans);
            } else {
                kullanici.nakitOdeme(seans);
            }
        } catch (SaatKontrol exception) {
            System.out.println(exception);
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Seans[] getSeansListesi() {
        return seansListesi;
    }
}
