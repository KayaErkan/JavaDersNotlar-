package day06_relationalOperators_ifStatement;

import java.util.Scanner;

public class C03_ÝfStatements02 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayi isteyin ve sayýnýn tek veya çift olduðunu yazdýrýn
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		int girilenSayi = scan.nextInt();
		
		if(girilenSayi %2 == 0) {
			System.out.println("Girdiðiniz sayý çift");
		}
		
		if(girilenSayi %2 == 1) {
			System.out.println("Girdiðiniz sayý tek");
		}
		
		if (girilenSayi < 0 ) {
			System.out.println("Lütfen pozitif bir tamsayý girin");
		}
		
		
		
		
		
		
		
		
		

	}

}
