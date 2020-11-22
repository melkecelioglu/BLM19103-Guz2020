
public class Soru4 {
    
    public static int satirTopla(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
          toplam += dizi[i];
        }
        return toplam;
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
        
        int minimumSatir = 0;
        int minimumDeger = Integer.MAX_VALUE;
        
        for (int i = 0; i < matris.length; i++) {
            int satirToplam = 0;
            for (int j = 0; j < matris[i].length; j++) {
               satirToplam = satirTopla(matris[i]);
            }
            
            if(satirToplam < minimumDeger){
                minimumDeger = satirToplam;
                minimumSatir = i;
            }
        }
        
        System.out.println("En kötü not alan öğrenci:" + minimumSatir);
    }
}
