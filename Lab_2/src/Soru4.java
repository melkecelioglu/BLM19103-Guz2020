class Soru4{
	public static void main(String[] args){
		int sayi1 = 3;
		int sayi2 = 4;
		int sayi3 = 5;
		System.out.print(++sayi1 + sayi2 * sayi1 > sayi3 * (sayi2 + sayi1) || (sayi2 - sayi1 < ++sayi3));

		// 1 - Soldan sağa doğru ilk parantez içi işlem yapılır: (sayi2 + sayi1) = 7
		// Yeni Hal: ++sayi1 + sayi2 * sayi1 > sayi3 * 7 || (sayi2 - sayi1 < ++sayi3)
		// 2 - Sondaki parantez içi işlem yapılır; önce ++ işlemi, sonra - işlemi, sonra < işlemi:
		// Yeni Hal: ++sayi1 + sayi2 * sayi1 > sayi3 * 7 || (sayi2 - sayi1 < 6)
		// Yeni Hal: ++sayi1 + sayi2 * sayi1 > sayi3 * 7 || (1 < 6)
		// Yeni Hal: ++sayi1 + sayi2 * sayi1 > sayi3 * 7 || True
		// 3 - ++ işlemi gerçekleştirilir:
		// Yeni Hal: 4 + sayi2 * sayi1 > sayi3 * 7 || True
		// 4 - * işlemi gerçekleştirilir:
		// Yeni Hal: 4 + 16 > sayi3 * 7 || True
		// 5 - * işlemi gerçekleştirilir:
		// Yeni Hal: 4 + 16 > 42 || True
		// 6 - + işlemi gerçekleştirilir:
		// Yeni Hal: 20 > 35 ||True
		// 7 - > işlemi gerçekleştirilir:
		// Yeni Hal: False || True
		// 8 - || işlemi gerçekleştirilir:
		// Çıktı: True 
		

	}
}