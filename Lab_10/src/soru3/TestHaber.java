/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9soru3;

/**
 *
 * @author Numan
 */
public class TestHaber {

    public static void main(String[] args) {

        Yazar yazar1 = new Yazar("Ali ", "ECE");
        Yazar yazar2 = new Yazar("Okay ", "KARACAN");
        Yazar yazar3 = new Yazar("Irmak ", "KAZUK");
        Yazar yazar4 = new Yazar("Mehmet ", "DEMİRKOL");

        Haber haber1 = new Haber(1, "Robben Fener'de vol.1", "aciklama1", yazar1);
        Haber haber2 = new Haber(2, "Robben Fener'de vol.2", "aciklama2", yazar2);
        Haber haber3 = new Haber(3, "Robben Fener'de vol.3", "aciklama3", yazar3);
        Haber haber4 = new Haber(4, "Robben Fener'de vol.4", "aciklama4", yazar1);
        Haber haber5 = new Haber(5, "Robben Fener'de vol.5", "aciklama5", yazar1);
        Haber haber6 = new Haber(6, "Robben Fener'de vol.6", "aciklama6", yazar4);
        Haber haber7 = new Haber(7, "Robben Fener'de vol.7", "aciklama7", yazar2);

        Gazete gazetea = new Gazete("       Fanatik", 4);
        Gazete gazeteb = new Gazete("    Fotomaç", 4);

//        haber3.setbaslik("malibu134");
//        yazar1.setad("Numan");
//        yazar1.setsoyad("KILINÇOĞLU");
        gazetea.HaberEkle(haber1);
        gazetea.HaberEkle(haber2);
        gazetea.HaberEkle(haber3);
        gazetea.HaberEkle(haber4);

        gazeteb.HaberEkle(haber4);
        gazeteb.HaberEkle(haber5);
        gazeteb.HaberEkle(haber6);
        gazeteb.HaberEkle(haber7);

//        gazetea.haberListele();
//        yazar1.getSanatci();
//        System.out.println("----------------------------------");
//        gazetea.haberListele();
        gazetea.haberSil(haber3);
        gazetea.haberListele();
//        gazeteb.haberSil(haber7);
        gazeteb.haberListele();

    }

}
