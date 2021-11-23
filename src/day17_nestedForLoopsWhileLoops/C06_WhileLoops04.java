package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan pozitif bir sayi alin ve 
		// bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner (System.in);
		System.out.println("lütfen pozitif bir sayý giriniz");
		
		int sayi = scan.nextInt();
		
		int i = sayi;
		int rakamlarToplamý = 0;
		int rakam = 0;
		while (i>0) {
			rakam = i % 10;
			rakamlarToplamý += rakam;
			i /= 10;

		}
		
		System.out.println("girdiginiz " + sayi + " sayisinin rakamlar toplamý : " + rakamlarToplamý);
		
		
		
		
		
		
		
		
	}

}
