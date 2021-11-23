package day08_ternaryoperator;

import java.util.Scanner;

public class C05_Ternary03 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir sayý isteyin ve sayýnýn mutlak deðerini yazdýrýn
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir sayý giriniz");
		
		double sayi1 = scan.nextDouble(); 
		
		System.out.println(sayi1 >= 0 ? sayi1 : -1*sayi1);
		
		// if ile yapmak isteseydik
		
		if(sayi1 > 0 ) {
			System.out.println("Girdiðiniz sayýnýn mutlak deðeri : " + sayi1);
		}else {
			System.out.println("Girdiðiniz sayýnýn mutlak dðeri : " + -sayi1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
