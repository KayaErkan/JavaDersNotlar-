package day06_relationalOperators_ifStatement;

import java.util.Scanner;

public class C04_ÝfStatements03 {

	public static void main(String[] args) {
		//Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin 
	    //Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe” ilkHarf=S output = “Sali”
	    //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen istediðiniz gün isminin ilk harfini giriniz");
		
		char harf = scan.next().toLowerCase().charAt(0); // tek karakkteri char olalrak da alabiliriz
		     // Ancak char primitive dir ve methodlarý yoktur bunun için String  olarak almayý tercih ettik
		
		if(harf == 'p') {
			System.out.println("Pazartesi, Perþembe , veya pazar");
		}
		
		if(harf == 's') {
			System.out.println(" Sali");
		}
		if(harf == 'c') {
			System.out.println("carsamba , cuma veya cumartesi");
		}
		
		if(harf != 'p' && harf!= 's' && harf != 'c') {
			System.out.println("Lütfen geçerli bir harf giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
