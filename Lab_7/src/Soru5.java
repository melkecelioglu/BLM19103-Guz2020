
public class Soru5 {

    public static void transpozHesapla(int[][] matris) {
        
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;
        
        int[][] transpoze = new int[sutunSayisi][satirSayisi];
        for (int satir = 0; satir < satirSayisi; satir++) {
            for (int sutun = 0; sutun < sutunSayisi; sutun++) {
                transpoze[sutun][satir] = matris[satir][sutun];
            }
        }
        
        for (int[] satir : transpoze) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 3;
        int[][] matris = new int[N][M];

        int aralik = 100 - 1 + 1;
        System.out.print("\nMatris:\n");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matris[i][j] = 1 + (int) (Math.random() * aralik);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---------");
        
        transpozHesapla(matris);

    }

}
