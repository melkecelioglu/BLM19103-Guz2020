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
public class Bilgisayar extends Urun implements IIndirimIslemleri{
    
    public Bilgisayar(String ad, String kategori, double fiyat) {
        super(ad, kategori, fiyat);
    }

    @Override
    public void indirimUygula() {
        setFiyat(getFiyat() * 0.8);
    }
    
    
}
