package day09_SwitchCase;

import java.util.Scanner;

public class C03_SwitchCase03 {

	public static void main(String[] args) {
	
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("g�n ismi giriniz");
		String g�n = scan.next().toLowerCase();
		
		switch (g�n) {
			
		case "pazartesi" :
		case "sal�" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Girdiginiz g�n hafta ici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Girdi�iniz g�n hafta sonu");
			break;
		default:
			System.out.println("L�tfen ge�erli bir g�n ad� giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
