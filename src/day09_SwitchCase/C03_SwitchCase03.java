package day09_SwitchCase;

import java.util.Scanner;

public class C03_SwitchCase03 {

	public static void main(String[] args) {
	
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gün ismi giriniz");
		String gün = scan.next().toLowerCase();
		
		switch (gün) {
			
		case "pazartesi" :
		case "salý" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Girdiginiz gün hafta ici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Girdiðiniz gün hafta sonu");
			break;
		default:
			System.out.println("Lütfen geçerli bir gün adý giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
