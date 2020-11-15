
package quiz;

public class S3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 0;
            for (int j = 5; j >= 1; j--) { 
                if(j <= i){
                    System.out.print(++k);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");  
        }
    }
}
