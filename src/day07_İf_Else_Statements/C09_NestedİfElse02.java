package day07_�f_Else_Statements;

import java.util.Scanner;

public class C09_Nested�fElse02 {

	public static void main(String[] args) {

		// Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin.
		// Ilk harf A ise �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		// Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin.
		// Ilk harf z ise �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen sifre giriniz...");
		
		char sifre�lkHarf = scan.next().charAt(0);
		
		if(sifre�lkHarf >= 'a' && sifre�lkHarf <= 'z') { // k�c�k harf
			
			if(sifre�lkHarf == 'z') {
				System.out.println("ge�erli �ifre");
			}else {
				System.out.println("ge�ersiz harf");
			}
			
			
		}else if(sifre�lkHarf >= 'A' && sifre�lkHarf <= 'Z') { // b�y�k harf
			
			if(sifre�lkHarf == 'A') {
				System.out.println("ge�erli �ifre");
			}else {
				System.out.println("ge�ersiz harf");
			}
		}else {// yanl�� giri�
			System.out.println("Sifrenin ilk karakteri harf olmal�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
