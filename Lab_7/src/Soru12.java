
public class Soru12 {

    public static void enCokSatisMarka(int[][] matris, String[] markalar, String[] aylar) {
        for (int sutun = 0; sutun < matris[0].length; sutun++) {

            int maks = 0;
            int maksIndex = 0;

            for (int satir = 0; satir < matris.length; satir++) {
                if (matris[satir][sutun] > maks) {
                    maks = matris[satir][sutun];
                    maksIndex = satir;
                }
            }
            
            System.out.println(aylar[sutun] + " ayı içerisinde En çok satış yapan marka: " + markalar[maksIndex] + ", Satış Adedi: " + maks);
        }
    }

    public static void main(String[] args) {

        int[][] matris = {{700, 600, 650}, {900, 800, 700}, {300, 400, 350}, {500, 450, 470}, {600, 500, 480}};

        String[] markalar = {"Fiat", "Renault", "VW", "Opel", "Ford"};
        String[] aylar = {"Ocak", "Şubat", "Mart"};

        enCokSatisMarka(matris, markalar, aylar);
    }
}
