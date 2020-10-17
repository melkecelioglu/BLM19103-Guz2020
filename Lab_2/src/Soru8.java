
public class Soru8 {
    public static void main(String[] args){
        
        // İki adet karakter değeri belirlenir
        char ilk_harf = 'b';
        char ikinci_harf = 'f';
        
        // Her karakterin sayısal bir değeri vardır. İnternetten ASCII Table olarak aratılabilir
        // Bu sayısal değer ilgili karakterin integere kast edilmesiyle, yani çevrilmesiyle elde edilir.
        // Karakterlerin sayısal değerleri arasındaki fark bize aradaki harf sayısını verir.
        int harf_sayisi = (int) ikinci_harf - (int) ilk_harf - 1; // c d e
        
        System.out.println(ilk_harf + " ve " + ikinci_harf + " arasında " + harf_sayisi + " adet harf var.");
                 
    }
}
