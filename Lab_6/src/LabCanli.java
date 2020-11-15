
import java.util.Scanner;

public class LabCanli {

    public static void main(String[] args) {

        for(int x = 1; x <= 5 ; x++) {

            for(int bosluk = (5 - x) ; bosluk >= 1 ; bosluk--) {

                System.out.print(" ");

            }

            for(int y = 1 ; y <= x ; y++) {

                System.out.print(y);

            }

            System.out.println("");   

        }
    }
}
