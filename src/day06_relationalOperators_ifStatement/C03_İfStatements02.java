package day06_relationalOperators_ifStatement;

import java.util.Scanner;

public class C03_�fStatements02 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsayi isteyin ve say�n�n tek veya �ift oldu�unu yazd�r�n
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir sayi giriniz");
		
		int girilenSayi = scan.nextInt();
		
		if(girilenSayi %2 == 0) {
			System.out.println("Girdi�iniz say� �ift");
		}
		
		if(girilenSayi %2 == 1) {
			System.out.println("Girdi�iniz say� tek");
		}
		
		if (girilenSayi < 0 ) {
			System.out.println("L�tfen pozitif bir tamsay� girin");
		}
		
		
		
		
		
		
		
		
		

	}

}
