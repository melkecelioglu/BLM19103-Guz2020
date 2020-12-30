/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

public class Test {

    public static void main(String[] args) {
        Fabrika f = new Fabrika(1234, "A");
        Personel s1 = new Stajyer(1546, "Ebrar Derindağ", 2000, 1, "Stajyer");
        Personel i1 = new Isci(265444, "Aykut Sakin", 3500, 5, "Görevli");
        Personel s2 = new Stajyer(4578, "Esma Bilek", 2200, 2, "Stajyer 2");
        Personel m1 = new Muhendis(9877, "Mehtap Ak", 4500, 5, "Mühendis");
        Personel m2 = new Muhendis(9877, "Ahmet Gül", 4200, 6, "Mühendis");
        f.personelEkle(m2);
        f.personelEkle(m1);
        f.personelEkle(s2);
        f.personelEkle(i1);
        f.personelEkle(s1);
        f.bilgileriYazdir();
        f.yillikZamYap();
        f.personelSay();

    }

}
