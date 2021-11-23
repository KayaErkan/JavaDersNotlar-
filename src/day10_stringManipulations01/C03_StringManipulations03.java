package day10_stringManipulations01;

import java.util.Scanner;

public class C03_StringManipulations03 {

	public static void main(String[] args) {
	
		// '' char , "" Stringtir ama index of () acisindan farkalri yok 
		
		String str = "Java ogrenmek ne guzel";
		
		System.out.println(str.indexOf("e")); // 8
		
		System.out.println(str.indexOf(' ')); // 4
		
		//  aradýðýmýz karakteri istersek String istersek char olarak girebiliriz
		
		System.out.println(str.indexOf("mek")); // 10 
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); // -1
		
		System.out.println(str.indexOf("J")); // 0
		
		// kullanýcýdan bir String isteyin
		// girdigi String "Java" içeriyorsa aferin yazdýrýn
		// içermiyorsa daha cok calýsman lazým yazdýrýn
		// buuyuk kucuk harf önemsiz olsun
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("bir cümle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		
	    // 	cumle.indexOf("Java"); 
		// cümlede java varsa index ddönecek
		// yoksa -1 dönecek
		
		// 1. yol
		
		if (cumle.indexOf("java") == -1) {
			System.out.println("daha cok calisman lazim");
		}else {
			System.out.println("Aferin");
		}
		
		// 2. yol
		
		if (cumle.indexOf("java") != -1) {
			System.out.println("Aferin");
		}else {
			System.out.println("daha cok calýsman lazým");
		}
			
		// 3.yol
		
		System.out.println(cumle.indexOf("java") == -1 ? "daha cok calýsman lazým" : "Aferin");
		
		
		
		
		
		
	}

}
