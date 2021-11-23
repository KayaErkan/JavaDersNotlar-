package day18_doWhileLoopScope;

import java.util.Scanner;

public class C02_DowhileLoop01 {

	public static void main(String[] args) {
		// kullanýcýdan iki pozitif sayý isteyin
		// kullanýcý negatif sayý girdiðinde
		// girilen negatif sayýlarý yok sayýp yeniden deger isteyin
		// kullanýcý dogru giris yaptýgýnda "well done" ve sayýlarýn carpýmýný yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen iki pozitif tam sayý giriniz");
		
		// do while ile bir tur kazanmýþ oluyoruz
		
		int sayi1 = 5;
		int sayi2 = 10;
		
		do {
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done \ngirilen sayýlarýn carpýmý : " + (sayi1 * sayi2));
			} else {
				System.out.println("lütfen iki pozitif tam sayý girin");
			}
		}
		while (sayi1 <= 0 || sayi2 <= 0);
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
