package day18_doWhileLoopScope;

import java.util.Scanner;

public class C02_DowhileLoop01 {

	public static void main(String[] args) {
		// kullan�c�dan iki pozitif say� isteyin
		// kullan�c� negatif say� girdi�inde
		// girilen negatif say�lar� yok say�p yeniden deger isteyin
		// kullan�c� dogru giris yapt�g�nda "well done" ve say�lar�n carp�m�n� yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen iki pozitif tam say� giriniz");
		
		// do while ile bir tur kazanm�� oluyoruz
		
		int sayi1 = 5;
		int sayi2 = 10;
		
		do {
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			if (sayi1 > 0 && sayi2 > 0) {
				System.out.println("well done \ngirilen say�lar�n carp�m� : " + (sayi1 * sayi2));
			} else {
				System.out.println("l�tfen iki pozitif tam say� girin");
			}
		}
		while (sayi1 <= 0 || sayi2 <= 0);
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
