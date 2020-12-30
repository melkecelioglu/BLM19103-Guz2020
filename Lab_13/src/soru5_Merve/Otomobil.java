package soru5;

public abstract class Otomobil  {
	protected String marka;
	protected String model;
	protected int beygirgucu;
	protected int satisfiyat;
	protected Kullanici k;
	public Otomobil(String marka,String model,int beygirgucu,int satisfiyat) {
		this.beygirgucu=beygirgucu;
		this.marka=marka;
		this.model=model;
		this.satisfiyat=satisfiyat;
	
	}
	public Otomobil (String marka, String model) {
		this.marka=marka;
		this.model=model;
	}
	
	public abstract void bilgileriyazdir();
		
	

}
