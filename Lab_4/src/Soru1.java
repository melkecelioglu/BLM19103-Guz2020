
/**
 * @file Soru1.java
 * @date Oct 28, 2020 , 09:08:05
 * @author Muhammet Alkan
 */
public class Soru1 {

    public static void main(String[] args) {

        // Math.random() : 0 dahil 1 e kadar
        int rastgeleSayi;
        int toplam = 0;

        for (int i = 0; i < 10; i++) {
            rastgeleSayi = (int) (Math.random() * 100 + 1); // 1 den 100 e
            System.out.println(rastgeleSayi);

            toplam += rastgeleSayi;
        }

        System.out.println("Toplam : " + toplam);
    }
}
