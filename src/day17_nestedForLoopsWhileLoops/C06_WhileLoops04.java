package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan pozitif bir sayi alin ve 
		// bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen pozitif bir say� giriniz");
		
		int sayi = scan.nextInt();
		
		int i = sayi;
		int rakamlarToplam� = 0;
		int rakam = 0;
		while (i>0) {
			rakam = i % 10;
			rakamlarToplam� += rakam;
			i /= 10;

		}
		
		System.out.println("girdiginiz " + sayi + " sayisinin rakamlar toplam� : " + rakamlarToplam�);
		
		
		
		
		
		
		
		
	}

}
