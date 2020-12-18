package quiz;

public class S3 {

    public static int usHesapla(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc = sonuc * taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int[][] matris = {{2, 4, 6}, {5, 7, 3}, {1, 3, 2}};

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                matris[satir][sutun] = usHesapla(matris[satir][sutun], satir + 1);
            }
        }

        // Matrisi Ekrana Yazdırma
        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                System.out.print(matris[satir][sutun] + " ");
            }
            System.out.println();
        }

    }
}
