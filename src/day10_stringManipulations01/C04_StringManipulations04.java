package day10_stringManipulations01;

import java.util.Scanner;

public class C04_StringManipulations04 {

	public static void main(String[] args) {
		/* 
		 * soru 2 ) kullanýcýdan bir cümle ve bir kelime isteyin
		 * kelimenin cümledeki kullanýmýna bakarak aþaðýdaki 3 cümleden uygun olanýný yazdýrýn
		 *  - Girilen kelime cümlede kullanýlmamýþ
		 *  - Girilen kelime cümlede 1 kere kullanýlmýþ
		 *  - Girilen kelime cümlede 1'den fazla kullanýlmýþ
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime giriniz");
		String kelime =scan.next().toLowerCase();
		
		int ilkKullanýmÝndexi = cumle.indexOf(kelime); // 0
		int sonKullanýmÝndexi= cumle.lastIndexOf(kelime); // 16
		
		if (ilkKullanýmÝndexi == -1) {
			System.out.println("Girilen kelime cümlede kullanýlmamýþ");
		}else if (ilkKullanýmÝndexi == sonKullanýmÝndexi) {
			System.out.println("Girilen kelime cümlede 1 kere kullanýlmýþ");
		}else {
			System.out.println("Girilen kelime cümlede 1'den fazla kullanýlmýþ");
		}
		
		
		
		
		
		
		
		
		

	}

}
