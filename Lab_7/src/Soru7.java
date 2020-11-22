
public class Soru7 {

    public static int cevapKontrol(char[] ogrenciCevaplar, char[] cevapAnahtari) {
        int dogruSayisi = 0;
        for (int soru = 0; soru < ogrenciCevaplar.length; soru++) {
            if (ogrenciCevaplar[soru] == cevapAnahtari[soru]) {
                dogruSayisi++;
            }
        }
        
        return dogruSayisi;
    }

    public static void main(String[] args) {
        char[][] ogrenciCevaplari = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < ogrenciCevaplari.length; i++) {
            
            System.out.println("Öğrenci " + i + " Doğru Sayısı: " + cevapKontrol(ogrenciCevaplari[i], cevapAnahtari));
        }
    }
}
