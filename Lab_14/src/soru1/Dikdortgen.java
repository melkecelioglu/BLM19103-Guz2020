package soru1;

/**
 * Dikdortgen.java
 *
 * @author Muhammet Alkan <malkan@fsm.edu.tr>
 * @date 06-Jan-2021, 09:22:07
 */
public class Dikdortgen extends Sekil implements IAlanHesaplayici, ICevreHesaplayici {

    private int kisaKenar, uzunKenar;

    public Dikdortgen(String ad, String renk, int kisaKenar, int uzunKenar) {
        super(ad, renk);
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    void bilgileriYazdir() {
        System.out.println("Dikdörtgenin adı : " + super.getAd());
        System.out.println("Dikdörtgenin rengi : " + getRenk());
        System.out.println("Dikdörtgenin kısa kenarı : " + kisaKenar);
        System.out.println("Dikdörtgenin uzun kenarı : " + uzunKenar);
    }

    @Override
    public double alanHesapla() {
        return kisaKenar * uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (kisaKenar + uzunKenar);
    }

}
