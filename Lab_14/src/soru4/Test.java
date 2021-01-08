package soru4;

/**
 *
 * @author melikekecelioglu
 */
public class Test {

    public static void main(String[] args) {

        Gazete g1 = new Gazete("Uzaylı", 1900);
        Gazete g2 = new Gazete("Oburgazete", 1990);
        Admin ad1 = new Admin("Mehmet Son", "m.son1234", g2);

        Yazar y1 = new Yazar("Dogukan Ozhan", "dozhan", g2);
        Haber h = new Haber(06, "GUNUN CARPICI BASLIKLARI", "Sizin icin en ozel haberleri derledik..", y1);
        y1.haberEkle(h);
        y1.bilgileriYazdir();

        Yazar y2 = new Yazar("Test Yazar 1", "dozhan", g2);
        Yazar y3 = new Yazar("Test Yazar 2", "dozhan", g2);
        Yazar y4 = new Yazar("Test Yazar 3", "dozhan", g2);
        Yazar y5 = new Yazar("Test Yazar 4", "dozhan", g2);
        Yazar y6 = new Yazar("Test Yazar 5", "dozhan", g2);

        g2.yazarEkle(y1);
        g2.yazarEkle(y2);
        g2.yazarEkle(y3);
        g2.yazarEkle(y4);
        g2.yazarEkle(y5);
        g2.yazarEkle(y6); // Hata Fırlat
        ad1.haberGuncelle(h, "YENİ İÇERİK"); // Hata Fırlat
        System.out.println("Haberler:");
        System.out.println("-------------");
        g2.haberListele();
        System.out.println("Kullanıcılar:");
        System.out.println("-------------");
        g2.yazarListele();
        System.out.println("" + h.getAciklama());
        System.out.println("---------------");

    }

}
