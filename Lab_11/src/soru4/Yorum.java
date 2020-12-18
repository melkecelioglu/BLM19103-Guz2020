/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

/**
 *
 * @author zekikus
 */
public class Yorum {

    private int id;
    private String icerik;
    private Kullanici kullanici;

    public Yorum(String icerik) {
        this.icerik = icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getIcerik() {
        return icerik;
    }

}
