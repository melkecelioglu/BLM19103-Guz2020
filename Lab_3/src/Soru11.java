
public class Soru11 {

    public static void main(String[] args) {

        int n = 5;

        int faktoriyel = 1;
        int sayac = 1;
        while (n >= sayac) {
            faktoriyel *= sayac;
            System.out.println(sayac + "! = " + faktoriyel);
            sayac++;
        }

    }
}
