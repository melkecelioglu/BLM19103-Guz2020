/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author Tz Group
 */
public class Telefon extends Urun implements IIndirimIslemleri {
private int hatsayisi;

    public Telefon(String ad, String kategori, double fiyat, int hatsayisi) {
        super(ad, kategori, fiyat);
        this.hatsayisi = hatsayisi;
    }
   

    
   

    @Override
    public void indirimUygula() {
        setFiyat(getFiyat() * 0.9);
        if(getHatsayisi() > 1){
            setFiyat(getFiyat() * 0.95);
        }
    }
    
    public int getHatsayisi() {
        return hatsayisi;
    }
}
