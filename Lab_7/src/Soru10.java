
public class Soru10 {
    
    public static int [] satisToplamiHesapla(int[][] matris) {
        int[] aylikToplamlar = new int[3];
        for (int sutun = 0; sutun < matris[0].length; sutun++) {
            int toplam = 0;
            for (int satir = 0; satir < matris.length; satir++) {
                aylikToplamlar[sutun] += matris[satir][sutun];
            }
        }
        
        return aylikToplamlar;
    }
    
    public static void main(String[] args) {
        
        int[][] matris = {{700, 600, 650}, {900, 800, 700}, {300, 400, 350}, {500, 450, 470},{600, 500, 480}};
        
        String[] markalar = {"Fiat", "Renault", "VW", "Opel", "Ford"};
        String[] aylar = {"Ocak", "Şubat", "Mart"};
        
        
        int[] aylikToplamlar = satisToplamiHesapla(matris);
        for (int i = 0; i < aylikToplamlar.length; i++) {
            System.out.println(aylar[i] + " : " + aylikToplamlar[i]);
        }
    }
}
