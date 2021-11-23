package day03_datacasting_increment;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		
		// 7- Kullanýcýdan ismini alýp baþ harfiini yazýnýz?
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen adýnýzý giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		// scan.next bize ilk kelimeyi getirir 
		// devamýna .charAt(0) dediðimizde o kelimenin ilk harfini getirecektir.
		// ilk harfinni derken java indexte onu 0 olarak tanýmlaro yüzden java da index 0 dan baþlar herzaman!
		
		System.out.println("girdiðiniz kelimenin ilk harfi : " + ilkHarf);
		
		scan.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
