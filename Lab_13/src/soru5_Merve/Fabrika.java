package soru5;

import java.util.ArrayList;

public class Fabrika {
	protected int id;
	protected int yil;
	protected ArrayList<Otomobil> otolist = new ArrayList<>();

	public Fabrika(int id, int yil) {
		this.id = id;
		this.yil = yil;
	}

	public Fabrika() {
		// TODO Auto-generated constructor stub
	}

	public Otomobil otoUret(String marka, String model,int bey,int fiy) {

		double r = Math.random();
		int o = 0;
		if (r > 0) {
			o = 1;
		}
		if (o == 1) {
			Otomobil oto1 = new Sedan(marka, model,bey,fiy);

			otolist.add(oto1);

			return oto1;
		} else {
			Otomobil oto2 = new Suv(marka, model,bey,fiy);
			otolist.add(oto2);
			return oto2;
		}

	}

	public void otolistesi() {
		int suv = 0;
		int sedan = 0;
		for (int i = 0; i < otolist.size(); i++) {
			if (otolist.get(i) instanceof Suv) {

				suv++;

			} else if (otolist.get(i) instanceof Sedan) {
				sedan++;
			}
		}
		System.out.println("sedan sayisi: " + sedan);
		System.out.println("suv syisi " + suv);
	}

	public void otosat(Kullanici k, Otomobil o) {
		otolist.remove(o);
		k.araclist.add(o);
	}

	public void modifiyeEt(Otomobil oto) {
		int k = (int) (Math.random() * 4);
		
		
	        if (oto instanceof Sedan) {
	        	switch(k) {
	    		case 0:

	    			((Sedan) oto).navigasyonekle();
	    		
	    		case 1:
	    			((Sedan) oto).parksensoruekle();

	    		
	    		case 3: {
	    			((Sedan) oto).navigasyonekle();
	    			((Sedan) oto).parksensoruekle();
	    		}
	    		}    
	        }

		
	}
}
