
public class S9 {
    
    public static int rastgeleDeger(){
        return (int) (Math.random() * 3);
    }
    
    public static void oyYuzdeleriHesapla(int [] oySayilari, String[] partiler){
        for (int i = 0; i < partiler.length; i++) {
            System.out.println(partiler[i] + " Partisi Oy Oranı: %" + oySayilari[i] / 100.0);
        }
        
    }
    
    public static void main(String[] args) {
        
        String[] partiler = {"A", "B", "C"};
        int[] oySayilari = new int[partiler.length];
        
        for (int i = 0; i < 100; i++) {
            oySayilari[rastgeleDeger()]++;
        }
        
        oyYuzdeleriHesapla(oySayilari, partiler);
    }
}
