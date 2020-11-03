
/**
 * @file Soru2.java
 * @date Oct 28, 2020 , 09:28:15
 * @author Muhammet Alkan
 */
public class Soru2 {

    public static void main(String[] args) {

        int rastgeleSayi;               // 1-100 aralığında sayılar üretilecek
        int min = Integer.MAX_VALUE;    // min = 101 veya daha büyük (aralık dışında seçilmeli)
        int max = Integer.MIN_VALUE;    // max = 0 veya daha küçük (aralık dışında seçilmeli)

        for (int i = 0; i < 10; i++) {
            rastgeleSayi = (int) (Math.random() * 100 + 1); // 1 den 100 e kadar
            System.out.println(rastgeleSayi);

            min = Math.min(rastgeleSayi, min);
            max = Math.max(rastgeleSayi, max);
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
}
