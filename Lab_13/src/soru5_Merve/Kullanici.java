package soru5;

import java.util.ArrayList;

public abstract class Kullanici {
	protected String adSoyad;
	ArrayList<Otomobil>araclist=new ArrayList<>();
	
	
public Kullanici(String adsoyad) {
	this.adSoyad=adsoyad;
}
}
