package day07_Ýf_Else_Statements;

import java.util.Scanner;

public class C05_ÝfElseÝf01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		//eger uzunluklardan biriisi 0 veya daha kucukse 
		// gecerli uzunllluk giriniz  yazdýrýn
		// uzunluklarýn ikiside pozitif ise
		// dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen diktorgenin kenarlarýný giriniz \nýlk kenarý yyazýnca ENTER'a basýnýz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 <= 0 || kenar2 <= 0) {
			System.out.println("Lütfen geçerli uzunluk giriniz ");
		}else if (kenar1 == kenar2) {
			System.out.println("Girdiðiniz diktorgen karedir");
		}else {
			System.out.println("Girdiðiniz diktorgen kare deðildir");
		}
		
		
		
		
		
		
		
		
		

	}

}
