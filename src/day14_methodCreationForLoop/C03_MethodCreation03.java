package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
 			- @ isareti icermiyorsa gecersiz email yazdirin
 			- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
 			- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
 			- Bu sorunlardan hiçbiri yoksa "email adresiiniz basarýyla kaydedildi" yazdýrýn
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen email adresinizi giriniz :");
		String email = scan.next();
		
		emailKontrolEt(email);
		
	}

	public static void emailKontrolEt(String email) {
		
		if(!email.contains("@")) {
			System.out.println("Geçersiz email");
		}else if(!email.contains("@gmail.com")) {
			System.out.println("Lütfen gmail adresinizi girin ");
		}else if(!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("Mailiniz baþarýyla kaydedildi");
		}
		
	}

}
