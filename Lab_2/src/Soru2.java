class Soru2{
	public static void main(String[] args){
		int sayi1 = 5;
		int sayi2 = 6;
		int sayi3;

		sayi3 = ++sayi2 * sayi1 / sayi2 + sayi2;
		System.out.print("Sonuç:" + sayi3);

		// 1 - ++sayi2 işlemi yapılır, sayi2 = 7
		// 2 - * işlemi yapılır = sayi2 * sayi1 = 7 * 5 = 35
		// 3 - / işlemi yapılır = 35 / sayi2 = 35 / 7 = 5
		// 4 - + işlemi yapılır = 5 + sayi2 = 5 + 7 = 12
	}
}