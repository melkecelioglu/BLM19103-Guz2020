package kullanıcı;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Ogrenci extends Kullanıcı {

    private ArrayList<Seans> seansListesi = new ArrayList<Seans>();

    public Ogrenci(String adSoyad, int yas, String tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);

    }

    @Override
    public void biletSatinAl(Seans seans) {

        if (getBakiye() > seans.getFilm().getUcret()) {
            getSeansListesi().add(seans);
            System.out.println(seans.getFilm().getAd() + "filmi eklendi.. ");
            setBakiye(getBakiye() - (seans.getFilm().getUcret() * 0.80));

        } else {
            System.out.println("Yetersiz bakiye");
        }

    }

}
