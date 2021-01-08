package soru1;

/**
 * Sekil.java
 *
 * @author Muhammet Alkan <malkan@fsm.edu.tr>
 * @date 06-Jan-2021, 09:20:01
 */
public abstract class Sekil {

    private String ad, renk;

    public Sekil(String ad, String renk) {
        this.ad = ad;
        this.renk = renk;
    }

    abstract void bilgileriYazdir();

    public String getAd() {
        return ad;
    }

    public String getRenk() {
        return renk;
    }
    
    
}
