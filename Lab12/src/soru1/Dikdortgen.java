/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

/**
 *
 * @author zekikus
 */
public class Dikdortgen extends Sekil {

    private int kisa_kenar;
    private int uzun_kenar;

    public Dikdortgen(String ad, String renk) {
        super(ad, renk);
    }

    public Dikdortgen(String ad, String renk, int kisa_kenar, int uzun_kenar) {
        super(ad, renk);
        this.kisa_kenar = kisa_kenar;
        this.uzun_kenar = uzun_kenar;
    }

    @Override
    public double alanHesapla() {
        return kisa_kenar * uzun_kenar;
    }

    public int getKisa_kenar() {
        return kisa_kenar;
    }

    public int getUzun_kenar() {
        return uzun_kenar;
    }

}
