package day07_�f_Else_Statements;

import java.util.Scanner;

public class C05_�fElse�f01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		//eger uzunluklardan biriisi 0 veya daha kucukse 
		// gecerli uzunllluk giriniz  yazd�r�n
		// uzunluklar�n ikiside pozitif ise
		// dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen diktorgenin kenarlar�n� giriniz \n�lk kenar� yyaz�nca ENTER'a bas�n�z");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 <= 0 || kenar2 <= 0) {
			System.out.println("L�tfen ge�erli uzunluk giriniz ");
		}else if (kenar1 == kenar2) {
			System.out.println("Girdi�iniz diktorgen karedir");
		}else {
			System.out.println("Girdi�iniz diktorgen kare de�ildir");
		}
		
		
		
		
		
		
		
		
		

	}

}
