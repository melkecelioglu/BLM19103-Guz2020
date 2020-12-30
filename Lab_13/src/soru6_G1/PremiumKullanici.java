package lab13;

public class PremiumKullanici extends Kullanici implements IUyeFirsatIslemleri {

    protected int puanDegeri;

    public PremiumKullanici(String adSoyad) {
        super(adSoyad);
    }

    @Override
    public void urunListele() {
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(adSoyad + " 'a ait ürünün özellikleri");
            System.out.print("Ürün adı: " + urunListesi.get(i).getAd());
            System.out.print("  | Ürün Fiyatı: " + urunListesi.get(i).getFiyat());
            System.out.println("  | Ürün Kategorisi: " + urunListesi.get(i).getKategori());

        }
        System.out.println("Puan değeri:" + puanDegeri);
    }

    @Override
    public int primeKullan(int urunSayisi) {

        puanDegeri = urunSayisi * 5;
        return puanDegeri;
    }

}
