package day02_variablesscanner;

import java.util.Scanner;

public class C05_ScannerHomeWork2 {

	public static void main(String[] args) {
		
		// 3- kullan�c�dan yar� �ap isteyip �emberin �evresini ve dairenin alan�n� hesaplay�n?
		
		// �ember:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �emberin �ap�n� giriniz");

		int cemberinCap� = scan.nextInt();
		System.out.println("�emberin �evresi = " + (3.14 * cemberinCap� ));
		
		System.out.println("Dairenin yar� �ap�n� giriniz");
		int daireYar��ap = scan.nextInt();
		
		System.out.println("Dairenin Alan� = " + (3.14*daireYar��ap*daireYar��ap ));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
