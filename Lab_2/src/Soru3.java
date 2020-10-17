class Soru3{
	public static void main(String[] args){
		int sayi = 3;
		System.out.print(++sayi + 4 * 3 > 5 * (4 + 3) && (4 - 3 > 5));

		// 1 - Soldan sağa doğru ilk parantez içi işlem yapılır: (4 + 3) = 7
		// Yeni Hal: ++3 + 4 * 3 > 5 * 7 && (4 - 3 > 5)
		// 2 - Sondaki parantez içi işem yapılır; önce - işlemi, sonra > işlemi:
		// Yeni Hal: ++3 + 4 * 3 > 5 * 7 && (1 > 5)
		// Yeni Hal: ++3 + 4 * 3 > 5 * 7 && False
		// 3 - ++ işlemi gerçekleştirilir:
		// Yeni Hal: 4 + 4 * 3 > 5 * 7 && False
		// 4 - * işlemi gerçekleştirilir:
		// Yeni Hal: 4 + 12 > 5 * 7 && False
		// 5 - * işlemi gerçekleştirilir:
		// Yeni Hal: 4 + 12 > 35 && False
		// 6 - + işlemi gerçekleştirilir:
		// Yeni Hal: 16 > 35 && False
		// 7 - > işlemi gerçekleştirilir:
		// Yeni Hal: False && False
		// 8 - && işlemi gerçekleştirilir:
		// Çıktı: False
		

	}
}