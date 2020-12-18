/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.ArrayList;

public class Kullanici {

    private int id;
    private String kullanici_adi;
    private ArrayList<Yorum> yorum_listesi;

    public Kullanici(int id, String kullanici_adi) {
        this.id = id;
        this.kullanici_adi = kullanici_adi;
        this.yorum_listesi = new ArrayList<>();
    }

    public ArrayList<Yorum> getYorum_listesi() {
        return yorum_listesi;
    }

    public void yorumYap(Yorum yorum) {
        yorum_listesi.add(yorum);
    }

    public void yorumListele() {
        for (int i = 0; i < yorum_listesi.size(); i++) {
            System.out.println("Yorum İçerik:" + yorum_listesi.get(i).getIcerik());
        }
    }

}
