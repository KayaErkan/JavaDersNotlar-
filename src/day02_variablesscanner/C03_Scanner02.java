package day02_variablesscanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		
		// 6- kullan�c�dan ismini ve soyismini al�p
		// aralar�nda bir bo�luk olu�turarak a�a��daki �ekilde yazd�r�n
		// �sim - soyisim : Mehmet Bulutluoz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen �sminizi Giriniz");
		
		String name = scan.next();
		
		System.out.println("L�tfenn Soyisminizi Giriniz");
		
		String surname = scan.next();
		
		// �sim - soyisim : +Mehmet+  +Bulutluoz
		System.out.println("�sim - Soyisim : " + name + " " + surname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
