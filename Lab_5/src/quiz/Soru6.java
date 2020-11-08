
package quiz;

public class Soru6 {
    
    public static String moveCharToEnd(String str){
        String sonuc = "";
        String unlu_harfler = "";
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'ı' 
               || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'ö'
               || str.charAt(i) == 'u' || str.charAt(i) == 'ü'){
                
                unlu_harfler += str.charAt(i);
                continue;
            }
            
            sonuc += str.charAt(i);
        }
        
        return sonuc.concat(unlu_harfler);
    }
    
    public static void main(String[] args){
        String s = moveCharToEnd("Fatih Sultan Mehmet");
        System.out.println(s);
    }
}
