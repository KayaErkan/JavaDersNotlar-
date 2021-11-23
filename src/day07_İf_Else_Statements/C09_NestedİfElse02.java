package day07_›f_Else_Statements;

import java.util.Scanner;

public class C09_Nested›fElse02 {

	public static void main(String[] args) {

		// Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise ìAî olup olmadigini kontrol edin.
		// Ilk harf A ise ìGecerli Sifreî degilse ìGecersiz Sifreî yazdirin.
		// Eger ilk harf kucuk harf ise ìzî olup olmadigini kontrol edin.
		// Ilk harf z ise ìGecerli Sifreî degilse ìGecersiz Sifreî yazdirin
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L¸tfen sifre giriniz...");
		
		char sifre›lkHarf = scan.next().charAt(0);
		
		if(sifre›lkHarf >= 'a' && sifre›lkHarf <= 'z') { // k¸c¸k harf
			
			if(sifre›lkHarf == 'z') {
				System.out.println("geÁerli ˛ifre");
			}else {
				System.out.println("geÁersiz harf");
			}
			
			
		}else if(sifre›lkHarf >= 'A' && sifre›lkHarf <= 'Z') { // b¸y¸k harf
			
			if(sifre›lkHarf == 'A') {
				System.out.println("geÁerli ˛ifre");
			}else {
				System.out.println("geÁersiz harf");
			}
		}else {// yanl˝˛ giri˛
			System.out.println("Sifrenin ilk karakteri harf olmal˝");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
