package day02_variablesscanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// 1- kullan�c�dan iki tam say� al�p bu say�lar�n toplam,fark ve �arp�mlar�n� yazd�r�n
		
		//kullan�c�dan de�er almak i�in 3 add�m atmal�y�z
		// Scanner objesi olu�tururuz
		Scanner scan = new Scanner(System.in); 
		
		// ikinci ad�m kullan�c�dan ne istedi�imizi yazd�ral�m
		System.out.println("L�tfen iki tam say� giriniz");
		
		// 3.ad�m next metodunu kullanarak girilen de�erleri al�p olu�turaca��m�z variable lara atayal�m
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("girdi�iniz say�lar�n toplam� : " + (sayi1 + sayi2));
		System.out.println("girdi�iniz say�lar�n fark� : " + (sayi1 - sayi2));
		System.out.println("girdi�iniz say�lar�n carp�m� : " + (sayi1 * sayi2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
