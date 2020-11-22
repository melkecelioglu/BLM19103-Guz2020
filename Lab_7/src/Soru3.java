
public class Soru3 {
    
    public static void elemanFrekansHesapla(int [][] matris){
         int[] tekrarDizisi = new int[11];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                tekrarDizisi[matris[i][j]]++;
            }
        }
        
        for (int i = 0; i < tekrarDizisi.length; i++) {
            System.out.println(i + " Matriste " + tekrarDizisi[i] + " defa geçer.");
        }
    }
    
    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int[][] matris = new int[N][M];
        
        int aralik = 10 - 1 + 1;
        System.out.print("\nMatris:\n");
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matris[i][j] = 1 + (int)(Math.random() * aralik);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        
        elemanFrekansHesapla(matris);
    }
}
