
public class Soru10 {
    public static void main(String[] args){
        
        int sayi = 7;
        
        int ilk_bit, ikinci_bit, ucuncu_bit;
        
        // Mevcut sayının ikiye bölümünden kalan bize ilk biti verir
        ilk_bit = sayi % 2;
        // Bir sonraki biti elde etmek için sayı ikiye bölünerek azaltılır
        sayi = sayi / 2;
        // Sayının ikiye bölümünden kalan bize ikinci biti verir
        ikinci_bit = sayi % 2;
        // En son biti elde etmek için sayı ikiye bölünür
        ucuncu_bit = sayi / 2;
        
        System.out.println("Sayının İkilik Karşılığı: " + ucuncu_bit + "" + ikinci_bit + "" + ilk_bit);
    }
}
