
package soru4;

public class Test {
    
    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika();
    
        Sofor sofor1 = new Sofor("Ahmet", "Yılmaz");
        Sofor sofor2 = new Sofor("Ayşe", "Yıldız");

        Araba araba1 = fabrika.arabaUret("Fiat", "Beyaz", sofor1);
        Araba araba2 = fabrika.arabaUret("Hyundai", "Gri", sofor2);

        System.out.println(fabrika.ayniMi(araba1, araba2));
        
        //araba1.soforDegistir(sofor2);
        
        //fabrika.arabaBoya(araba1, "Mavi");
        //System.out.println(araba1.getRenk());
        
    }
    
}
