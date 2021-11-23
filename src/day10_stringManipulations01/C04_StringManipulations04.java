package day10_stringManipulations01;

import java.util.Scanner;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		/* 
		 * soru 2 ) kullan�c�dan bir c�mle ve bir kelime isteyin
		 * kelimenin c�mledeki kullan�m�na bakarak a�a��daki 3 c�mleden uygun olan�n� yazd�r�n
		 *  - Girilen kelime c�mlede kullan�lmam��
		 *  - Girilen kelime c�mlede 1 kere kullan�lm��
		 *  - Girilen kelime c�mlede 1'den fazla kullan�lm��
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime giriniz");
		String kelime =scan.next().toLowerCase();
		
		int ilkKullan�m�ndexi = cumle.indexOf(kelime); // 0
		int sonKullan�m�ndexi= cumle.lastIndexOf(kelime); // 16
		
		if (ilkKullan�m�ndexi == -1) {
			System.out.println("Girilen kelime c�mlede kullan�lmam��");
		}else if (ilkKullan�m�ndexi == sonKullan�m�ndexi) {
			System.out.println("Girilen kelime c�mlede 1 kere kullan�lm��");
		}else {
			System.out.println("Girilen kelime c�mlede 1'den fazla kullan�lm��");
		}
		
		
		
		
		
		
		
		
		

	}

}
