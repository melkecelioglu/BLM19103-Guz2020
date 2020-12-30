package soru5;

import java.util.ArrayList;

public class Suv extends Otomobil implements ISatis›slemleri {
  
	public Suv(String marka, String model, int beygirgucu, int satisfiyat) {
		super(marka, model, beygirgucu, satisfiyat);
		// TODO Auto-generated constructor stub
	}
//	public Suv(String marka, String model) {
//		// TODO Auto-generated constructor stub
//		super(marka, model);
//		 
//		satisfiyatihesapla();
//		
//	}




	@Override
	public void bilgileriyazdir() {
		// TODO Auto-generated method stub
		System.out.println(marka);
		System.out.println(model);
		System.out.println(beygirgucu);
		System.out.println(satisfiyat);
	}

	@Override
	public void satisfiyatihesapla() {
		// TODO Auto-generated method stub
		satisfiyat=(int) (satisfiyat *0.20+(4*beygirgucu));
		
	}

}
