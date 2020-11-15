
public class S2 {
    
    public static void zamYap(double [] maaslar){
        for (int i = 0; i < maaslar.length; i++) {
            if(maaslar[i] < 2000){
                maaslar[i] += (maaslar[i] * 0.1);
            }
        }
        
        System.out.println("Yeni Maaşlar...");
        System.out.println("---------------");
        for (int i = 0; i < maaslar.length; i++) {
            System.out.println(maaslar[i]);
        }
    }
    
    public static void main(String[] args) {
        double[] maaslar = {5000, 1950, 1800, 3000, 3500, 1200};
        
        zamYap(maaslar);
     }
}
