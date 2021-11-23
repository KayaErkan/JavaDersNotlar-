package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C01_ÝfStatements {

	public static void main(String[] args) {
		
		/* 3) Kullsnýcýdan gün ismini alýn ve hafta içi veya haftasonu olduðunu yazdýrýn
		 * örnek:gun=pazar output = "hafta sonu"
		 * gun = salý output = "hafta içi"
		 * *** String için equals methodu kullanýn
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen gün ismini giriniz...");
		
		String gunÝsmi = scan.next().toLowerCase();
		
		// bayrak kullanýmý (flag)
		int flag = 0;
		
		if(gunÝsmi.equals("pazaretesi") || gunÝsmi.equals("salý") || gunÝsmi.equals("carsamba") 
				|| gunÝsmi.equals("persembe") || gunÝsmi.equals("cuma" )) {
			
			System.out.println("Girdiginiz gun haftaici");
			flag++;
		}
		if(gunÝsmi.equals("cumartesi")  || gunÝsmi.equals("pazar"))  {
			
			System.out.println("Girdiðiniz gün hafta sonu");
			flag++;
		}
		
		// pazar ==> flag = 1 2. if body'si calisacak
		// sali ==> flag = 1  1. Ýf body'si çalýþacak
		// pezer ==> flag = 0
		
		if(flag == 0) {
			System.out.println("Lutfen gecerli bir gun ismi yaziniz");
		}
		
		
		scan.close();
		
		
		
		
		if ( 5 > 7 || 10 < 6 ) {

	        System.out.println("Elma");

	} else {

	      System.out.println("Armut");

	}
		
		
		
		

	}

}
