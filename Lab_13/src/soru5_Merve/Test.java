package soru5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kullanici []k=new Kullanici[1];
	//	k[0]=new K("kaan bosnak");
  
   Suv a2 =new Suv("bmv", "kgt", 567, 12000);
   Sedan sedan=new Sedan("honda","jpslþd",89985,67999);
   Sedan s1=new Sedan("honda","jpsd",885,67000);
   Fabrika f1=new Fabrika();


 //Otomobil suv1= f1.otoUret("A", "B");
 
 
 Otomobil otosed = f1.otoUret("Toyota", "Sedan",678,12000);

 
 Otomobil otoseda = f1.otoUret("Honda", "Sedan",567,89007);
 a2.bilgileriyazdir();

f1.modifiyeEt(otoseda);
f1.otolistesi();
f1.modifiyeEt(otosed);
	}

}
