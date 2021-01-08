package soru1;

/**
 * Daire.java
 *
 * @author Muhammet Alkan <malkan@fsm.edu.tr>
 * @date 06-Jan-2021, 09:21:21
 */
public class Daire extends Sekil implements IAlanHesaplayici, ICevreHesaplayici {

    private int yaricap;

    public Daire(String ad, String renk, int yaricap) {
        super(ad, renk);
        this.yaricap = yaricap;
    }

    @Override
    void bilgileriYazdir() {
        System.out.println("Dairenin adı : " + getAd());
        System.out.println("Dairenin rengi : " + getRenk());
        System.out.println("Dikdörtgenin yarıçapı : " + yaricap);
    }

    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

}
