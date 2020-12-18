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
import java.util.ArrayList;

public class Moodle {

    private int id;
    private ArrayList<Ogrenci> ogrenciListesi;

    public Moodle() {

        this.ogrenciListesi = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
    }

    public String insert(String str, int offset, String[] eklenecek) {
        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == offset) {
                for (int j = 0; j < eklenecek.length; j++) {
                    yeniStr += eklenecek[j] + "_";
                }
            } else {
                yeniStr += str.charAt(i);
            }
        }
        yeniStr += ".pdf";
        return yeniStr;
    }

    public String insert(String str, String[] eklenecek) {
        return insert(str, 0, eklenecek);
    }
}
