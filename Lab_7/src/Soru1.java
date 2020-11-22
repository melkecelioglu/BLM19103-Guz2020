
public class Soru1 {
    public static void main(String[] args) {
        int[][] matris = {{23,5,23},{54,13,65},{3, 84, 43}, {76, 13, 10}, {95, 56, 75}};
        
        int sutunSayisi = matris[0].length;
        int satirSayisi = matris.length;
        
        int toplam = 0;
        // Sütun Toplamı
        for (int i = 0; i < sutunSayisi; i++) {
            toplam = 0;
            for (int j = 0; j < satirSayisi; j++) {
                toplam += matris[j][i];
            }
            System.out.println(i + ".Sütun Toplamı:" + toplam);
        }
        
        System.out.println("----------");
        
        // Satır Toplamı
        for (int i = 0; i < satirSayisi; i++) {
            toplam = 0;
            for (int j = 0; j < sutunSayisi; j++) {
                toplam += matris[i][j];
            }
            System.out.println(i + ".Satır Toplamı:" + toplam);
        }
    }
}
