package day03_datacasting_increment;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		
		// 7- Kullan�c�dan ismini al�p ba� harfiini yaz�n�z?
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen ad�n�z� giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		// scan.next bize ilk kelimeyi getirir 
		// devam�na .charAt(0) dedi�imizde o kelimenin ilk harfini getirecektir.
		// ilk harfinni derken java indexte onu 0 olarak tan�mlaro y�zden java da index 0 dan ba�lar herzaman!
		
		System.out.println("girdi�iniz kelimenin ilk harfi : " + ilkHarf);
		
		scan.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
