package soru1;

/**
 * Test.java
 *
 * @author Muhammet Alkan <malkan@fsm.edu.tr>
 * @date 06-Jan-2021, 09:30:28
 */
public class Test {

    public static void main(String[] args) {
        Sekil[] sekilListesi = new Sekil[10];

        sekilListesi[0] = new Daire("Daire1", "siyah", 5);
        sekilListesi[1] = new Daire("Daire2", "beyaz", 10);
        sekilListesi[2] = new Dikdortgen("Dikdörtgen1", "kahverengi", 4, 5);
        sekilListesi[3] = new Dikdortgen("Dikdörtgen2", "mavi", 14, 25);

        for (int i = 0; i < sekilListesi.length; i++) {
            try {
                if (sekilListesi[i] == null) {
                    throw new NullElemanKontrol(i + ". eleman null !!");
                }
                sekilListesi[i].bilgileriYazdir();
                System.out.println("---");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("bitti");
    }
}
