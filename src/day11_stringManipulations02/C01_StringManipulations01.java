package day11_stringManipulations02;

import java.util.Scanner;

public class C01_StringManipulations01 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir c�mle ve bir kelime al�n,
		// c�mlede kelimenin kullan�p kullan�lmad���n� yazd�r�n 
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen bir c�mle giriniz");
		String cumle =scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime giriniz");
		String kelime = scan.next().toLowerCase();
		
		// cumlede kelimenin kullan�l�p kullan�lmad���n� yazd�r�n
		// indexof kullanal�m
		
		if (cumle.indexOf(kelime) != 1) {
			System.out.println("kelime c�mlede kullan�lm�s");
		}else {
			System.out.println("kelime c�mlede kullan�lmam�s");
		}
		
		
		// contains () kullanal�m
		// CONTA�NS METHODUNU �OK KULLANICAZ!!!!!!
		
		if (cumle.contains(kelime)) { // contains methodu bize boolean bir sonu� d�nd�rece�i i�in ayr�ca bir kar��la�t�rma yapmaya gerek yok 
			System.out.println("kelime c�mlede kullan�lm�s");
		}else {
			System.out.println("kelime c�mlede kullan�lmam�s");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
