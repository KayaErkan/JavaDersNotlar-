package day13_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		// kullan�c�dan 2 tamsay� al�n 
		// bu say�lar�n toplamlar�n� ve �arpimlar��n� 
		// iki ayr� method da hesaplay�p yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 2 tam say� giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		// Method olu�turman�n kolay yolu
		// method ismini ve parametrelerini yaz�n (method call)
		toplama (sayi1,sayi2);
		
		carpma (sayi1,sayi2);
		carpma (sayi1+3,sayi2*2);
		
		sayi1 = 20;
		sayi2 = 15;
		
		toplama(sayi1 , sayi2); // 20+15=35
		carpma (sayi1 , sayi2); // 300
		
		sayi2=40;
		toplama (sayi1 , sayi2); // 20 + 40 = 60  
		
		// sonuc olarak uygulaman�zda tekrar tekrar kullanman�z gereken kod bloklar� i�in
		// her seferinde yeniden yazmak yerine , bu blo�u bir methodta yaz�p
		// ihtiyac�m�z oldu�u her seferde cag�rmak dahha mant�kl�d�r
	}

	 // bir method sadece konsolda bir �eyler yazd��racaksa return type olarak void yaz�l�r
	 // bu durumda return keywordune ihtiyac ollmaz 
	 // ve method bize bir sonuc D�ND�RMEZ!!!!!
	 // bir sonuc d�nd�rmesini istiyorsak return type'n� void yapmam�z gerek

	public static void carpma(int sayi1 , int sayi2) {
		System.out.println("Girilen say�lar�n carp�m� : " + sayi1 * sayi2);
		
	}



	public static void toplama(int sayi1, int sayi2) {
		System.out.println("girilen say�lar�n toplam� : " + (sayi1 + sayi2));
		
	}

}
