
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeki
 */
public class Soru8 {

    public static char randomCharacter(char a, char b){
        return (char)(a + (Math.random() * (b-a)));
    }
    
    public static int randomNumber(){
        return (int)(Math.random() * 10 + 1);
    }  
    
    public static void main(String[] args){
        
        String password = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                password += randomCharacter('A','Z');
            else
                password += randomNumber();
        }
        
        System.out.println(password);
       
    }
    
}
