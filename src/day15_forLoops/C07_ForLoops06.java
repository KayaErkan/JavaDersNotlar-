package day15_forLoops;

import java.util.Scanner;

public class C07_ForLoops06 {

	public static void main(String[] args) {
		/*
		 * Soru 7 ) Interview Question Kullanicidan bir String isteyin 
		 * ve Stringi tersten yazdirin.
		 */
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("lütfen tersten yazdýrmak için bir sring yazýnýz");
		
		String kelime = scan.next();
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i , kelime.length()-i));
		}

	}

}
