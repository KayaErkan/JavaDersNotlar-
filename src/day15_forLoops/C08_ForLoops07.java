package day15_forLoops;

import java.util.Scanner;

public class C08_ForLoops07 {

	public static void main(String[] args) {
		 /*
		 * Soru 8 ) Interview Question: Kullanicidan bir String isteyin 
		 * ve Stringi tersine ceviren bir program yaz�n.
		 */
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("l�tfen tersten yazd�rmak i�in bir sring yaz�n�z");
		
		String kelime = scan.nextLine();
		String tersten = "";
		for (int i = 0; i < kelime.length(); i++) {
		 tersten  += kelime.substring(kelime.length()-1-i , kelime.length()-i);
		}
		System.out.println(tersten);

	}

}
