
package soru2;

public class Test {
    public static void main(String[] args) {
        Muhendis p1 = new Muhendis("Talha Dereyurt",3000,5,"Muhendis");
        Isci p2 = new Isci("Ahmet Yilmaz",2000,2,"Isci");
        Stajyer p3 = new Stajyer("Cenk Korkmaz",1000,1,"Stajyer");
        
        Fabrika f1 = new Fabrika("Mehmet Bey Fabrikalari");
        
        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        
       int[] personeller =  f1.personelSay();
        System.out.println("Muhendis: " + personeller[0]);
        System.out.println("Isci: " + personeller[1]);
        System.out.println("Stajyer: " + personeller[2]);
        
        f1.yillikZamYap();
        
        p1.zamHesapla();
        
        p1.personelEkle(p3);
        p1.personelEkle(p2);
        
        p3.zamHesapla();
        p2.zamHesapla();
        
        
        p1.bilgileriYazdir();
        p2.bilgileriYazdir();
        f1.bilgileriYazdir();
    }
    
}
