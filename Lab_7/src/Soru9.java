
public class Soru9 {
    
    public static int [] satisToplamiHesapla(int[][] matris) {
        int[] markaToplam = new int[5];
        for (int i = 0; i < matris.length; i++) {
            int toplam = 0;
            for (int j = 0; j < matris[i].length; j++) {
                markaToplam[i] += matris[i][j];
            }
        }
        
        return markaToplam;
    }
    
    public static void main(String[] args) {
        
        int[][] matris = {{700, 600, 650}, {900, 800, 700}, {300, 400, 350}, {500, 450, 470},{600, 500, 480}};
        
        String[] markalar = {"Fiat", "Renault", "VW", "Opel", "Ford"};
        String[] aylar = {"Ocak", "Şubat", "Mart"};
        
        
        int[] aylikToplamlar = satisToplamiHesapla(matris);
        for (int i = 0; i < aylikToplamlar.length; i++) {
            System.out.println(markalar[i] + " : " + aylikToplamlar[i]);
        }
    }
}
