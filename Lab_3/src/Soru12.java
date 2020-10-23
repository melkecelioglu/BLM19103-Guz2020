
public class Soru12 {

    public static void main(String[] args) {
        int tekSayilarinToplami = 0;
        int ciftSayilarinToplami = 0;
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                ciftSayilarinToplami += i;
            } else {
                tekSayilarinToplami += i;
            }
        }

        System.out.println("Çift Sayıların Toplamı: " + ciftSayilarinToplami);
        System.out.println("Tek Sayıların Toplamı: " + tekSayilarinToplami);
    }
}
