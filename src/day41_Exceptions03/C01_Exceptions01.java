package day41_Exceptions03;

import java.util.Scanner;

public class C01_Exceptions01 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan yas�n� girmesini isteyin.
		 Kodunuzu kullan�c� s�f�rdan kucuk bir say� girerse
		 Exception verecek �ekilde yaz�n.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen yas�n�z� giriniz");
		int yas = scan.nextInt();
		
		if (yas > 0) {
			System.out.println("girdiginiz yas : " + yas);
		}else {
			throw new IllegalArgumentException();
		} 
		System.out.println("kod bloke olmam�s");
		
		/*
		 java ya bir exception throw etmek i�in throw ve new keyword'leri kullan�l�r
		 */
		
		/*
		 bu sekildee yaz�l�rsa java exception throw eder ama
		 kodumuz da bloke olmus olur.
		 bloke olmas�n� engellemek isterseniz ;
		 kodu try-catch ile surround yapabiliriz
		 */
		
		
	/* Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen yas�n�z� giriniz");
		int yas = scan.nextInt();
		
		try {
		if (yas > 0) {
			System.out.println("girdiginiz yas : " + yas);
		}else {
			throw new IllegalArgumentException();
		}
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("kod bloke olmam�s");
		
	*/
		
		
		
		
		
		
		
		
	}

}
