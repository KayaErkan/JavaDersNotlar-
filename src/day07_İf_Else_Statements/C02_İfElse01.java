package day07_�f_Else_Statements;

import java.util.Scanner;

public class C02_�fElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		//        ve dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen diktorgenin kenarlar�n� giriniz \n�lk kenar� yyaz�nca ENTER'a bas�n�z");
		
		double kenar1 = scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girdi�iniz diktorgen kare");
		}else {
			System.out.println("Girdi�iniz diktorgen kare de�il");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
