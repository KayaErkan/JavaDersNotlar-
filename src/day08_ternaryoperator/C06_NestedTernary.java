package day08_ternaryoperator;

import java.util.Scanner;

public class C06_NestedTernary {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi alin ve
		 *  sayi 10�dan kucukse �Rakam veya negatif say�� , 
		 * 100�den kucukse �iki basamakli sayi�
		 * degilse �uc basamakli veya daha buyuk sayi� yazdirin
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("L�tfen bir tamsay� giriniz");
		
		double sayi = scan.nextDouble();
		
		System.out.println( sayi < 10 ? "Rakam veya  negatif " : sayi < 100 ? "�ki basamakl� saayi" : "�� basamakl� veya daha b�y�k say�");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
