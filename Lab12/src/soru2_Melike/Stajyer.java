/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author melikekecelioglu
 */
public class Stajyer extends Personel{
     public Stajyer(int id, String adSoyad, double maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }
    @Override
        public void zamYap() {
        setMaas(getMaas());
    }
}
