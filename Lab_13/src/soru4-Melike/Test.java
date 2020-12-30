package soru4;

/**
 *
 * @author melikekecelioglu
 */
public class Test {

    public static void main(String[] args) {

        Gazete g1 = new Gazete("Uzaylı", 1900);
        Admin ad1 = new Admin("Mehmet Son", "m.son1234", g1);
        Gazete g2 = new Gazete("Oburgazete", 1990);
        Yazar y1 = new Yazar("Dogukan Ozhan", "dozhan", g2);
        y1.bilgileriYazdir();
        Haber h = new Haber(06, "GUNUN CARPICI BASLIKLARI", "Sizin icin en ozel haberleri derledik..", y1);
        y1.haberEkle(h);
        System.out.println("---------------");
        y1.bilgileriYazdir();
        System.out.println("---------------");
        g1.yazarEkle(y1);
        g2.yazarEkle(y1);
        g2.haberListele();
        g2.yazarListele();
        System.out.println("" + h.getAciklama());
        System.out.println("---------------");
        g2.yazarListele();
        ad1.haberEkle(h);
        ad1.haberGuncelle(h, "hello");

    }

}
