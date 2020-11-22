
public class Soru2 {
    
    public static int[][] rastgeleMatrisOlustur(int N, int M, int baslangic, int bitis){
        int[][] matris = new int[N][M];
        
        int aralik = bitis - baslangic + 1;
        System.out.print("\nMatris:\n");
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matris[i][j] = baslangic + (int)(Math.random() * aralik);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        return matris;
    }
    
    public static void main(String[] args) {
        
        int N = 5;
        int M = 5;
        int[][] matris = new int[N][M];
        
        int aralik = 100 - 1 + 1;
        System.out.print("\nMatris:\n");
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matris[i][j] = 1 + (int)(Math.random() * aralik);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        
        int sutunSayisi = matris[0].length;
        int satirSayisi = matris.length;
        double[] dizi = new double[satirSayisi];
        
        for (int i = 0; i < satirSayisi ; i++) {
            double toplam = 0;
            for (int j = 0; j < sutunSayisi; j++) {
                toplam += matris[i][j];
            }
            dizi[i] = toplam / sutunSayisi;
        }
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i + ".Satırdaki Değerlerin Ortalaması:" + dizi[i]);
        }
    }
}
