package day02_variablesscanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		
		// 6- kullanýcýdan ismini ve soyismini alýp
		// aralarýnda bir boþluk oluþturarak aþaðýdaki þekilde yazdýrýn
		// Ýsim - soyisim : Mehmet Bulutluoz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Ýsminizi Giriniz");
		
		String name = scan.next();
		
		System.out.println("Lütfenn Soyisminizi Giriniz");
		
		String surname = scan.next();
		
		// Ýsim - soyisim : +Mehmet+  +Bulutluoz
		System.out.println("Ýsim - Soyisim : " + name + " " + surname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
