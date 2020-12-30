/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ebrar
 */
public abstract class Personel {

    protected int id;
    protected String adSoyad;
    protected int maas;
    protected int calismaYili;
    protected String unvan;

    public Personel(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.calismaYili = calismaYili;
        this.unvan = unvan;
    }

    public abstract void bilgileriYazdir();

    public abstract void zamHesapla();

}
