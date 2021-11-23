package day02_variablesscanner;

import java.util.Scanner;

public class C05_ScannerHomeWork2 {

	public static void main(String[] args) {
		
		// 3- kullanýcýdan yarý çap isteyip çemberin çevresini ve dairenin alanýný hesaplayýn?
		
		// çember:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Çemberin çapýný giriniz");

		int cemberinCapý = scan.nextInt();
		System.out.println("Çemberin Çevresi = " + (3.14 * cemberinCapý ));
		
		System.out.println("Dairenin yarý çapýný giriniz");
		int daireYarýÇap = scan.nextInt();
		
		System.out.println("Dairenin Alaný = " + (3.14*daireYarýÇap*daireYarýÇap ));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
