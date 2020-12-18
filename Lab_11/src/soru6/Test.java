/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author beyza
 */
public class Test {

    public static void main(String[] args) {

        Moodle moodle = new Moodle();
        Ogrenci o1 = new Ogrenci(1232, "Ahmet", "Yılmaz");
        Odev odev1 = new Odev(12335, "ödev1", o1);

        o1.odevEkle(odev1);
        moodle.ogrenciEkle(o1);

        for (int i = 0; i < moodle.getOgrenciListesi().size(); i++) {
            Ogrenci ogr = moodle.getOgrenciListesi().get(i);
            for (int j = 0; j < ogr.getOdevListesi().size(); j++) {
                    Odev odev = ogr.getOdevListesi().get(j);
                    String[] eklenecekBilgiler = {String.valueOf(ogr.getId()), odev.getIsim()};
                    String yeniDosyaAdi = moodle.insert(odev.getDosyaAdi(), eklenecekBilgiler);
                    odev.setDosyaAdi(yeniDosyaAdi);
            }
            ogr.odevListele();
        }
    }
}
