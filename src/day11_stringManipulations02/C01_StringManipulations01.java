package day11_stringManipulations02;

import java.util.Scanner;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cümle ve bir kelime alýn,
		// cümlede kelimenin kullanýp kullanýlmadýðýný yazdýrýn 
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir cümle giriniz");
		String cumle =scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scan.next().toLowerCase();
		
		// cumlede kelimenin kullanýlýp kullanýlmadýðýný yazdýrýn
		// indexof kullanalým
		
		if (cumle.indexOf(kelime) != 1) {
			System.out.println("kelime cümlede kullanýlmýs");
		}else {
			System.out.println("kelime cümlede kullanýlmamýs");
		}
		
		
		// contains () kullanalým
		// CONTAÝNS METHODUNU ÇOK KULLANICAZ!!!!!!
		
		if (cumle.contains(kelime)) { // contains methodu bize boolean bir sonuç döndüreceði için ayrýca bir karþýlaþtýrma yapmaya gerek yok 
			System.out.println("kelime cümlede kullanýlmýs");
		}else {
			System.out.println("kelime cümlede kullanýlmamýs");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
