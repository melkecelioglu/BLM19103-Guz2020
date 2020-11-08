
public class Soru1 {

    public static void aralikYazdir(int baslangic, int bitis){
        for (int i = baslangic; i < bitis; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        aralikYazdir(5, 10);
    }
    
}
