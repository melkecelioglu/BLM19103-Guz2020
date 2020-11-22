
public class Soru11 {

    public static void enCokSatisAy(int[][] matris, String[] markalar, String[] aylar) {
        for (int satir = 0; satir < matris.length; satir++) {

            int maks = 0;
            int maksIndex = 0;

            for (int sutun = 0; sutun < matris[0].length; sutun++) {
                if (matris[satir][sutun] > maks) {
                    maks = matris[satir][sutun];
                    maksIndex = sutun;
                }
            }
            
            System.out.println(markalar[satir] + " için En çok satış yapılan ay: " + aylar[maksIndex] + ", Satış Adedi: " + maks);
        }
    }

    public static void main(String[] args) {

        int[][] matris = {{700, 600, 650}, {900, 800, 700}, {300, 400, 350}, {500, 450, 470}, {600, 500, 480}};

        String[] markalar = {"Fiat", "Renault", "VW", "Opel", "Ford"};
        String[] aylar = {"Ocak", "Şubat", "Mart"};

        enCokSatisAy(matris, markalar, aylar);
    }
}
