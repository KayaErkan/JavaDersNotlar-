package day09_SwitchCase;

import java.util.Scanner;

public class C01_SwitchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun
		// ve gun ismini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Haftan�n ka��nc� g�n�nde oldu�unuzu giriniz");
		int g�nNo = scan.nextInt();

		switch (g�nNo) {
			case 1:
				System.out.println("Pazartesi g�n�ndesiniz");
				break;
			case 2 : 
				System.out.println("Sal� G�n�ndesiniz");
				break;
			case 3 :
				System.out.println("�ar�amba G�n�ndesiniz");
				break;
			case 4:
				System.out.println("Per�embe G�n�ndesiniz");
				break;
			case 5:
				System.out.println("Cuma G�n�ndesiniz");
				break;
			case 6:
				System.out.println("Cumartesi G�n�ndesiniz");
				break;
			case 7:
				System.out.println("Pazar G�n�ndesiniz");
				break;
			default:
				System.out.println("L�tfen ge�erli bir g�n numaras� giriniz");
		}

	}

}
