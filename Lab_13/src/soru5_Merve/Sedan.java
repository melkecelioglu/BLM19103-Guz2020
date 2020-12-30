package soru5;

import java.util.ArrayList;

public class Sedan extends Otomobil implements ISatis›slemleri,IModifiyeIslemleri {
	ArrayList<String>ozlist=new ArrayList<String>();
	public Sedan(String marka, String model, int beygirgucu, int satisfiyat) {
		super(marka, model,beygirgucu,satisfiyat);
		satisfiyatihesapla();
	}

	public Sedan(String marka, String model) {
		// TODO Auto-generated constructor stub
		super(marka, model);
		//Sedan a =new Sedan(marka,model);
		satisfiyatihesapla();
	}

	@Override
	public void bilgileriyazdir() {
		// TODO Auto-generated method stub
		System.out.println(marka);
		System.out.println(model);
		System.out.println(beygirgucu);
		System.out.println(satisfiyat);
		for(int i =0;i<ozlist.size();i++) {
			
				System.out.println(ozlist.get(i));
				//System.out.println(ozlist.add(marka));
			
		}
		
		
		
	}

	@Override
	public void satisfiyatihesapla() {
		// TODO Auto-generated method stub
		satisfiyat=(int) (satisfiyat *0.15+(4*beygirgucu));
		System.out.println(model+"Satis fiyati"+satisfiyat);
	}

	@Override
	public void navigasyonekle() {
		// TODO Auto-generated method stub
		ozlist.add("Navigasyon");
		satisfiyat+=2500;
		System.out.println(marka+model+"satis fiyati "+satisfiyat);
	}

	@Override
	public void parksensoruekle() {
		// TODO Auto-generated method stub
		ozlist.add("parksensoru");
		satisfiyat+=1200;
		System.out.println(marka+model+"satis fiyati "+satisfiyat);
	}
	

}
