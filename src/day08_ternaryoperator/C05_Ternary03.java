package day08_ternaryoperator;

import java.util.Scanner;

public class C05_Ternary03 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir say� isteyin ve say�n�n mutlak de�erini yazd�r�n
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen bir say� giriniz");
		
		double sayi1 = scan.nextDouble(); 
		
		System.out.println(sayi1 >= 0 ? sayi1 : -1*sayi1);
		
		// if ile yapmak isteseydik
		
		if(sayi1 > 0 ) {
			System.out.println("Girdi�iniz say�n�n mutlak de�eri : " + sayi1);
		}else {
			System.out.println("Girdi�iniz say�n�n mutlak d�eri : " + -sayi1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
