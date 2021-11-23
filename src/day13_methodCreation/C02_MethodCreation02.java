package day13_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tamsayý alýn 
		// bu sayýlarýn toplamlarýný ve çarpimlarýýný 
		// iki ayrý method da hesaplayýp yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 2 tam sayý giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		// Method oluþturmanýn kolay yolu
		// method ismini ve parametrelerini yazýn (method call)
		toplama (sayi1,sayi2);
		
		carpma (sayi1,sayi2);
		carpma (sayi1+3,sayi2*2);
		
		sayi1 = 20;
		sayi2 = 15;
		
		toplama(sayi1 , sayi2); // 20+15=35
		carpma (sayi1 , sayi2); // 300
		
		sayi2=40;
		toplama (sayi1 , sayi2); // 20 + 40 = 60  
		
		// sonuc olarak uygulamanýzda tekrar tekrar kullanmanýz gereken kod bloklarý için
		// her seferinde yeniden yazmak yerine , bu bloðu bir methodta yazýp
		// ihtiyacýmýz olduðu her seferde cagýrmak dahha mantýklýdýr
	}

	 // bir method sadece konsolda bir þeyler yazdýýracaksa return type olarak void yazýlýr
	 // bu durumda return keywordune ihtiyac ollmaz 
	 // ve method bize bir sonuc DÖNDÜRMEZ!!!!!
	 // bir sonuc döndürmesini istiyorsak return type'ný void yapmamýz gerek

	public static void carpma(int sayi1 , int sayi2) {
		System.out.println("Girilen sayýlarýn carpýmý : " + sayi1 * sayi2);
		
	}



	public static void toplama(int sayi1, int sayi2) {
		System.out.println("girilen sayýlarýn toplamý : " + (sayi1 + sayi2));
		
	}

}
