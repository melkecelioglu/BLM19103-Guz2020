
package soru1;

import java.util.ArrayList;

public class Fabrika {
    
    private int id;
    private String isim;
    private int arabaSayisi;
    private ArrayList<Araba> arabaListesi;

    public Fabrika(int id, String isim) {
        this.id = id;
        this.isim = isim;
        this.arabaListesi = new ArrayList<>();
    }
    
    public void arabaEkle(Araba araba){
        this.arabaListesi.add(araba);
    }
    
    public int[] split(String str){
        return split(str, '/');
    }
    
    public int[] split(String str, char chr){
        int[] dizi = new int[3];
        
        String sonuc = "";
        int indeks = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr){
                dizi[indeks++] = Integer.parseInt(sonuc);
                sonuc = "";
                continue;
            }
            
            sonuc += str.charAt(i);
        }
        
        dizi[indeks++] = Integer.parseInt(sonuc);
        
        return dizi;
    }

    public ArrayList<Araba> getArabaListesi() {
        return arabaListesi;
    }
    
    
    
}
