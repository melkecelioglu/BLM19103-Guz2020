package quiz;

public class S4 {

    public static void main(String[] args) {

        int[][] matris = {{1, 3, 5}, {2, 4, 6}, {7, 8, 9}};

        int altUcgenToplam = 0;
        int ustUcgenToplam = 0;

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[0].length; sutun++) {
                if (sutun < satir) {
                    altUcgenToplam += matris[satir][sutun];
                } else if (satir < sutun) {
                    ustUcgenToplam += matris[satir][sutun];
                }
            }

        }
        
        System.out.println("Alt Üçgen Toplamı: " + altUcgenToplam);
        System.out.println("Üst Üçgen Toplamı: " + ustUcgenToplam);
    }

}
