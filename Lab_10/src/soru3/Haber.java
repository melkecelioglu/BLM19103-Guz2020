/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9soru3;

public class Haber {

    private Yazar yazar;
    private int id;
    private String baslik, aciklama;
    private int haberSayisi;

    public Haber(int id, String baslik, String aciklama, Yazar yazar) {
        this.id = id;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.yazar = yazar;
    }

    public String getYazarBilgisi() {

        return yazar.getad() + yazar.getsoyad();

    }

    public void setid(int p_id) {

        id = p_id;

    }

    public int getid() {

        return id;
    }

    public void setbaslik(String p_baslik) {

        baslik = p_baslik;

    }

    public String getbaslik() {

        return baslik;
    }

    public void setaciklama(String p_aciklama) {

        aciklama = p_aciklama;

    }

    public String getaciklama() {

        return aciklama;
    }

}
